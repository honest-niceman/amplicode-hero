package io.amplicode.amplicodehero.jpa.entities;

import jakarta.persistence.*;

@MappedSuperclass
public class NewEntityMappedSuperclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}