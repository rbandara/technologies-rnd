import puka

producer = puka.Client("amqp://10.237.180.112//")
print "0"

send_promise = producer.connect()
producer.wait(send_promise)
print "1"

send_promise = producer.queue_declare(queue='PM.ATG.PRODUCT_EANP1')
producer.wait(send_promise)
print "2"

send_promise = producer.basic_publish(exchange='PM.PRODUCT_EANP1', routing_key='', body='Hello test!')
producer.wait(send_promise)

print "Message sent!"