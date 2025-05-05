package com.example.kafka.consumer;

import com.example.kafka.events.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Консьюмер для логирования событий пользователя
 *
 * @author ITWeiss
 */
@Service
@Slf4j
public class UserEventLogger {

  /**
   * Обработка события обновления пользователя
   *
   * @param event событие пользователя
   */
  @KafkaListener(topics = "test-topic", groupId = "user-events-logger")
  public void logInfo(UserEvent event) {
    log.info("User {} ({}) updated by event {} in {}",
        event.getName(),
        event.getId(),
        event.getType(),
        event.getTimestamp());
  }
}
