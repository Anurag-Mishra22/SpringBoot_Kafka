package com.example.Kafka_Consumer;

import com.example.Kafka_Consumer.constants.KafkaConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@KafkaListener(topics = KafkaConstants.TOPIC, groupId="group_order")
	public void subscribeMsg(String order) {
		System.out.print("*** Msg Recieved From Kafka *** :: ");
		System.out.println(order);
		//logic
	}

}
