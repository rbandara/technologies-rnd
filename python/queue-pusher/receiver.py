#!/usr/bin/env python
import pika
import logging
logging.basicConfig()

# listens to DLQ and pick the messages
credentials = pika.PlainCredentials('bncomr', 'bncomr')
connection = pika.BlockingConnection(pika.ConnectionParameters('10.239.80.171',5672,'product',credentials))
channel = connection.channel()
# this queue needs to be DLQ ( where messages receive )
#channel.queue_declare(queue='DLQ.PM.ATG.PRODUCT_EANP1')

def callback(ch, method, properties, body):
    print " [x] Received %r" % (body,)
channel.basic_consume(callback, queue='DLQ.PM.ATG.PRODUCT_EANP1', no_ack=True)
channel.start_consuming()

# send the message in body