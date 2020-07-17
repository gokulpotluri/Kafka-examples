package com.kafka.utils;

import java.util.Properties;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;

public class ClientFactory<K, V> {
	
	public KafkaProducer<K, V> createProducer(Properties configs) {
		return new KafkaProducer<K, V>(configs);
	}
	
	public KafkaConsumer<K, V> createConsumer(Properties configs) {
		return new KafkaConsumer<K, V>(configs);
		
	}

}
