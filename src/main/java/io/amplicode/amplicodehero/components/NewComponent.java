package io.amplicode.amplicodehero.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewComponent {

    private final KafkaTemplate<String, String> stringKafkaTemplate;

    public NewComponent(KafkaTemplate<String, String> stringKafkaTemplate) {
        this.stringKafkaTemplate = stringKafkaTemplate;
    }

    @KafkaListener(topics = "topic", containerFactory = "stringListenerFactory")
    public void consumeString(String string) {

    }
}
