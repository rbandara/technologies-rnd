#!/usr/bin/env python
import pika
import logging
logging.basicConfig()


# this queue is the destination queue
credentials = pika.PlainCredentials('pm_dev', 'pm_dev')
parameters = pika.ConnectionParameters('10.237.180.112', 5672, 'product', credentials)
connection = pika.BlockingConnection(parameters)
print " connection created"

channel = connection.channel()
channel.queue_declare(queue='PM.ATG.PRODUCT_EANP1')

channel.basic_publish(exchange='PM.PRODUCT_EANP1', routing_key='', body='Hello World!')
print " [x] Sent 'Hello World!'"
connection.close()