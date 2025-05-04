package com.example.kafka.restController;

import static com.example.kafka.config.API.BASE_URL;
import static com.example.kafka.config.API.URL_CREATE;
import static com.example.kafka.config.API.URL_UPDATE;
import com.example.kafka.events.UserEvent;
import com.example.kafka.producer.UserEventProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(BASE_URL)
@RequiredArgsConstructor
public class UserController {

  private final UserEventProducer producer;

  @PostMapping(URL_CREATE)
  public ResponseEntity<Void> create(@RequestBody UserEvent event) {
    event.setType("CREATE");
    event.setCreatedAt(LocalDateTime.now());
    producer.sendMessage("test-topic", event);
    return ResponseEntity.ok().build();
  }

  @PostMapping(URL_UPDATE)
  public ResponseEntity<Void> update(@RequestBody UserEvent event) {
    event.setType("UPDATE");
    event.setCreatedAt(LocalDateTime.now());
    producer.sendMessage("test-topic", event);
    return ResponseEntity.ok().build();
  }

}
