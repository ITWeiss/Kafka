package com.example.kafka.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * Класс для передачи данных пользователя
 *
 * @author ITWeiss
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent {

  private String type;
  private Long id;
  private String name;
  private LocalDateTime timestamp;
}
