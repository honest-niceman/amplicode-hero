package io.amplicode.amplicodehero.mongo;

import org.hibernate.proxy.HibernateProxy;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document
public class MuMongoDBComponent {

    @Id
    private String id;

    @Field("muMongoDBComponent")
    @DBRef
    private MuMongoDBComponent muMongoDBComponent;

    @Field("muMongoDBComponent1")
    @DocumentReference
    private MuMongoDBComponent muMongoDBComponent1;

    @Field("muMongoDBComponent2")
    private MuMongoDBComponent muMongoDBComponent2;

    @Field("asf")
    private String asf;

    @Transient
    private String da;

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getAsf() {
        return asf;
    }

    public void setAsf(String asf) {
        this.asf = asf;
    }

    public MuMongoDBComponent getMuMongoDBComponent2() {
        return muMongoDBComponent2;
    }

    public void setMuMongoDBComponent2(MuMongoDBComponent muMongoDBComponent2) {
        this.muMongoDBComponent2 = muMongoDBComponent2;
    }

    public MuMongoDBComponent getMuMongoDBComponent1() {
        return muMongoDBComponent1;
    }

    public void setMuMongoDBComponent1(MuMongoDBComponent muMongoDBComponent1) {
        this.muMongoDBComponent1 = muMongoDBComponent1;
    }

    public MuMongoDBComponent getMuMongoDBComponent() {
        return muMongoDBComponent;
    }

    public void setMuMongoDBComponent(MuMongoDBComponent muMongoDBComponent) {
        this.muMongoDBComponent = muMongoDBComponent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        MuMongoDBComponent that = (MuMongoDBComponent) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}