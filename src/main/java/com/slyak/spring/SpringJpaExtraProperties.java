package com.slyak.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * .
 *
 * @author stormning on 16/6/10.
 */
@ConfigurationProperties(prefix = "spring.jpa.extra")
public class SpringJpaExtraProperties {

    private String templateLocation;

    private String templateBasePackage;


    public String getTemplateLocation() {
        return templateLocation;
    }

    public void setTemplateLocation(String templateLocation) {
        this.templateLocation = templateLocation;
    }

    public String getTemplateBasePackage() {
        return templateBasePackage;
    }

    public void setTemplateBasePackage(String templateBasePackage) {
        this.templateBasePackage = templateBasePackage;
    }
}
