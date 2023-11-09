package io.amplicode.amplicodehero.jpa.repos;

import io.amplicode.amplicodehero.jpa.entities.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NewEntityRepository extends JpaRepository<NewEntity, Long>, JpaSpecificationExecutor<NewEntity> {
}