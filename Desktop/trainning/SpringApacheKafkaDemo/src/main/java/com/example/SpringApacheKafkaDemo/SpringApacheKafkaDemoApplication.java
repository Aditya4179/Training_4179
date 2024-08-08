package com.example.SpringApacheKafkaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringApacheKafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApacheKafkaDemoApplication.class, args);
	}

}
