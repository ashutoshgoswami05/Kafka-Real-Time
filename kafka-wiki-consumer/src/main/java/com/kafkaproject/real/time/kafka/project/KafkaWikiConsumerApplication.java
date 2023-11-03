package com.kafkaproject.real.time.kafka.project;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KafkaWikiConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaWikiConsumerApplication.class, args);
	}
	
	
	
		

}
