package io.amplicode.amplicodehero.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.RevisionEntity;

@Getter
@Setter
@Entity
@Table(name = "revinfo")
@RevisionEntity
public class CustomRevisionEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "timestamp", nullable = false)
    private long timestamp;

}