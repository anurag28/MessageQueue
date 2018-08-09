package com.javasampleapproach.apachekafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javasampleapproach.apachekafka.storage.MessageStorage;

@Service
public class KafkaConsumer {
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@Autowired
	MessageStorage storage;
	
	@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage(String message) {
		log.info("received content = '{}'", message);
		storage.put(message);
    }
	
	
	@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage2(String message) {
		log.info("received content = '{}'", "HELLLLLOOOOOOO"+message);
		
		storage.put(message);
    }
	
}
