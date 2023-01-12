package com.testshopjava.testshopjava.embedded;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Embedded postgres configuration.
 */
@Configuration
public class EmbeddedPostgresConfig {
    /**
     * Embedded postgres datasoruce.
     */
    @Bean
    public DataSource getEmbeddedPostgresConfig() throws Exception {
        DataSource embeddedPostgresDs = EmbeddedPostgres.builder()
                .start().getPostgresDatabase();
        return embeddedPostgresDs;
    }
}
