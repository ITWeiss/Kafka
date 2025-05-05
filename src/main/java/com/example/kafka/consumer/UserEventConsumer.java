package com.example.kafka.consumer;

import com.example.kafka.events.UserEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Консьюмер для обработки событий пользователя
 *
 * @author ITWeiss
 */
@Service
public class UserEventConsumer {

  /**
   * Обработчик события пользователя
   *
   * @param event событие пользователя
   */
  @SuppressWarnings("unused")
  @KafkaListener(topics = "test-topic", groupId = "my-group")
  public void listen(UserEvent event) {
    System.out.println("Event received");
  }
}
