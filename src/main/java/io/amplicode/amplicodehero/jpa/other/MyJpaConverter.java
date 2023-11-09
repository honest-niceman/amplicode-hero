package io.amplicode.amplicodehero.jpa.other;

import io.amplicode.amplicodehero.jpa.entities.NewEntity;
import jakarta.persistence.Converter;
import jakarta.persistence.AttributeConverter;

@Converter
public class MyJpaConverter implements AttributeConverter<NewEntity, String> {

    @Override
    public String convertToDatabaseColumn(NewEntity newEntity) {
        return null;
    }

    @Override
    public NewEntity convertToEntityAttribute(String string) {
        return null;
    }
}
