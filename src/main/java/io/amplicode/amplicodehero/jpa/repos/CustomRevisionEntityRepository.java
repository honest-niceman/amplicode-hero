package io.amplicode.amplicodehero.jpa.repos;

import io.amplicode.amplicodehero.jpa.entities.CustomRevisionEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.history.RevisionRepository;

public interface CustomRevisionEntityRepository extends JpaSpecificationExecutor<CustomRevisionEntity>, RevisionRepository<CustomRevisionEntity, Integer, Integer> {
}