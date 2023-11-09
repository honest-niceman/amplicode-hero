package io.amplicode.amplicodehero.jpa.dtos;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link io.amplicode.amplicodehero.jpa.entities.NewEntity}
 */
public class NewEntityDto implements Serializable {
    private final Long id;

    public NewEntityDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewEntityDto entity = (NewEntityDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }
}