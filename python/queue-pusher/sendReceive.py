import ConfigParser
import pika

# read from the config
Config = ConfigParser.ConfigParser()
Config.read("config.ini")


def ConfigSectionMap(section):
    dict1 = {}
    options = Config.options(section)
    for option in options:
        try:
            dict1[option] = Config.get(section, option)
            if dict1[option] == -1:
                print("skip: %s" % option)
        except:
            print("exception on %s!" % option)
            dict1[option] = None
    return dict1

RabbitSettings = ConfigSectionMap('RabbitSettings')
hostName = RabbitSettings.get('hostname')
readFromQueue = RabbitSettings.get('readfromqueue')
writeToQueue = RabbitSettings.get('writetoqueue')
routingKey = RabbitSettings.get('routingkey')

# Setup for write to Queue
connection = pika.BlockingConnection(pika.ConnectionParameters(host=hostName))
channel = connection.channel()
channel.queue_declare(queue=writeToQueue)

# Set up for reading, then read
def callback(ch, method, properties, body):
    print " [x] Received %r" % (body,)
channel.basic_consume(callback, queue=readFromQueue, no_ack=True)
channel.start_consuming()

channel.basic_publish(exchange='', routing_key=routingKey, body='Hello World!')
print " [x] Sent 'Hello World!'"
connection.close()