package com.example.kafka.producer;

import com.example.kafka.events.UserEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Класс-продюсер для событий пользователя
 *
 * @author ITWeiss
 */
@Service
@RequiredArgsConstructor
public class UserEventProducer {

  private final KafkaTemplate<String, UserEvent> kafkaTemplate;

  public void sendMessage(String topic, UserEvent event) {
    kafkaTemplate.send(topic, event);
  }
}
