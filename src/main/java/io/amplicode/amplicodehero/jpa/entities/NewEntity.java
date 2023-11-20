package io.amplicode.amplicodehero.jpa.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "new_entity")
public class NewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tasf")
    private String tasf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "new_entity_id")
    private NewEntity newEntity;

    @Lob
    @ElementCollection
    @Column(name = "da")
    @CollectionTable(name = "new_entity_das", joinColumns = @JoinColumn(name = "owner_id"))
    private Set<byte[]> das = new LinkedHashSet<>();

    public String getTasf() {
        return tasf;
    }

    public void setTasf(String tasf) {
        this.tasf = tasf;
    }

    public Set<byte[]> getDas() {
        return das;
    }

    public void setDas(Set<byte[]> das) {
        this.das = das;
    }

    public NewEntity getNewEntity() {
        return newEntity;
    }

    public void setNewEntity(NewEntity newEntity) {
        this.newEntity = newEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}