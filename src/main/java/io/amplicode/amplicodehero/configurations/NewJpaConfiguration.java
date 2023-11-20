package io.amplicode.amplicodehero.configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "dataSourceEntityManagerFactory", transactionManagerRef = "dataSourceTransactionManager")
public class NewJpaConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean dataSourceEntityManagerFactory(
            @Qualifier("dataSource") DataSource dataSource,
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dataSource)
                .packages("io.amplicode.amplicodehero")
                .persistenceUnit("Default")
                .build();
    }

    @Bean
    public PlatformTransactionManager dataSourceTransactionManager(
            @Qualifier("dataSourceEntityManagerFactory") LocalContainerEntityManagerFactoryBean dataSourceEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(dataSourceEntityManagerFactory.getObject()));
    }
}
