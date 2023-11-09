package io.amplicode.amplicodehero.jpa.mappers;

import io.amplicode.amplicodehero.jpa.dtos.NewEntityDto;
import io.amplicode.amplicodehero.jpa.entities.NewEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NewEntityMapper {
    NewEntity toEntity(NewEntityDto newEntityDto);

    NewEntityDto toDto(NewEntity newEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    NewEntity partialUpdate(NewEntityDto newEntityDto, @MappingTarget NewEntity newEntity);
}