package io.amplicode.amplicodehero.jpa.entities;

import jakarta.persistence.*;

@Embeddable
public class NewEntityEmbeddable {
    @Column(name = "tqasfdg")
    private String tqasfdg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "new_entity_id")
    private NewEntity newEntity;

    public NewEntity getNewEntity() {
        return newEntity;
    }

    public void setNewEntity(NewEntity newEntity) {
        this.newEntity = newEntity;
    }

    public String getTqasfdg() {
        return tqasfdg;
    }

    public void setTqasfdg(String tqasfdg) {
        this.tqasfdg = tqasfdg;
    }
}