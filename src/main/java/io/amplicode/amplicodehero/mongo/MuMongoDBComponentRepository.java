package io.amplicode.amplicodehero.mongo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MuMongoDBComponentRepository extends Repository<MuMongoDBComponent, String>, JpaSpecificationExecutor<MuMongoDBComponent> {
    List<MuMongoDBComponent> findByMuMongoDBComponent_MuMongoDBComponent1(MuMongoDBComponent muMongoDBComponent1);
}