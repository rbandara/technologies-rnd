#!/usr/bin/env python
import threading, logging, time

from kafka.client import KafkaClient
from kafka.consumer import SimpleConsumer
from kafka.producer import SimpleProducer
from kafka.common import LeaderNotAvailableError

class Producer(threading.Thread):
    daemon = True

    def run(self):
        client = KafkaClient("localhost:9092")
        producer = SimpleProducer(client)

        while True:
            try:
                producer.send_messages('my-topic', "test")
                producer.send_messages('my-topic', "\xc2Hola, mundo!")
            except LeaderNotAvailableError:
                # https://github.com/mumrah/kafka-python/issues/249
                time.sleep(1)
                producer.send_messages('my-topic', "test")
                producer.send_messages('my-topic', "\xc2Hola, mundo!")


            time.sleep(1)


class Consumer(threading.Thread):
    daemon = True

    def run(self):
        client = KafkaClient("localhost:9092")
        consumer = SimpleConsumer(client, "test-group", "my-topic")

        for message in consumer:
            print(message)

def main():
    threads = [
        Producer(),
        Consumer()
    ]

    for t in threads:
        t.start()

    time.sleep(5)

main()
