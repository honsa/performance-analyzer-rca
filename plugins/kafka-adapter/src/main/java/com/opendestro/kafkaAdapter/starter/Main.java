package com.opendestro.kafkaAdapter.starter;

public class Main {
    public static void main(String[] args) {
        ProducerStarter.startProducer();
        ConsumerStarter.startConsumer();
    }
}