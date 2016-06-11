package com.slyak.spring;

import com.slyak.spring.jpa.FreemarkerSqlTemplates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * .
 *
 * @author stormning on 16/6/10.
 */
@Configuration
@EnableConfigurationProperties(SpringJpaExtraProperties.class)
@AutoConfigureAfter({ DataSourceAutoConfiguration.class })
public class JpaExtraAutoConfiguration {

    @Autowired
    private SpringJpaExtraProperties springJpaProperties;

    @Bean
    protected FreemarkerSqlTemplates freemarkerSqlTemplates() {
        FreemarkerSqlTemplates sqlTemplates = new FreemarkerSqlTemplates();
        sqlTemplates.setTemplateBasePackage(springJpaProperties.getTemplateBasePackage());
        sqlTemplates.setTemplateLocation(springJpaProperties.getTemplateLocation());
        return sqlTemplates;
    }
}
