package com.example.kafka.consumer;

import com.example.kafka.events.UserEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserEventConsumer {

  @KafkaListener(topics = "test-topic", groupId = "my-group")
  public void listen(UserEvent event) {
    System.out.println("Event received");
  }
}
