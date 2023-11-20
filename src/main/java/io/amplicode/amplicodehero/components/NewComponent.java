package io.amplicode.amplicodehero.components;

import io.amplicode.amplicodehero.jpa.entities.NewEntity;
import io.amplicode.amplicodehero.mongo.MuMongoDBComponentRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewComponent {

    private final MuMongoDBComponentRepository muMongoDBComponentRepository;

    public NewComponent(MuMongoDBComponentRepository muMongoDBComponentRepository) {
        this.muMongoDBComponentRepository = muMongoDBComponentRepository;
    }

    public void consumeString(String string) {

    }
}
