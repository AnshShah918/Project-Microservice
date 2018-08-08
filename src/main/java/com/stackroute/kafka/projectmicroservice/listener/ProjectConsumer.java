package com.stackroute.kafka.projectmicroservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.projectmicroservice.model.Project;


@Service
public class ProjectConsumer {
	 	 
	 
	    @KafkaListener(topics = "Projects",groupId="group_json",
	            containerFactory = "projectKafkaListenerFactory")
	    public void consumeJson(Project project) {
	        System.out.println("Consumed JSON Message: " + project);
	    }
}
