package com.samsoftware.kafka.consumer;

import com.samsoftware.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the message from alibou Topic:: %s", msg));
    }

    @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the message from alibou Topic:: %s", student.toString()));
    }
}
