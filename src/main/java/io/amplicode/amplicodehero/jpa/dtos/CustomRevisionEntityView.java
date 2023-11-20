package io.amplicode.amplicodehero.jpa.dtos;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import io.amplicode.amplicodehero.jpa.entities.CustomRevisionEntity;

@EntityView(CustomRevisionEntity.class)
public interface CustomRevisionEntityView {
    @IdMapping
    int getId();

    long getTimestamp();
}
