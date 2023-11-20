package io.amplicode.amplicodehero.mongo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MuMongoDBComponentRepository extends MongoRepository<MuMongoDBComponent, String>, JpaSpecificationExecutor<MuMongoDBComponent> {
}