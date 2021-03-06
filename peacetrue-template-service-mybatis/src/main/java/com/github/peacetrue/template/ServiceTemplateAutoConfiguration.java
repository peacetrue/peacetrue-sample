package com.github.peacetrue.template;

import com.github.peacetrue.associate.AssociatedSourceBuilder;
import com.github.peacetrue.associate.AssociatedSourceBuilderImpl;
import com.github.peacetrue.template.modules.demo.DemoService;
import com.github.peacetrue.template.modules.demo.DemoServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Objects;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(ServiceTemplateProperties.class)
@MapperScan(basePackageClasses = ServiceTemplateAutoConfiguration.class, annotationClass = Mapper.class)
@PropertySource("classpath:/application-template-service.properties")
public class ServiceTemplateAutoConfiguration {

    private ServiceTemplateProperties properties;

    public ServiceTemplateAutoConfiguration(ServiceTemplateProperties properties) {
        this.properties = Objects.requireNonNull(properties);
    }

    @Bean
    public AssociatedSourceBuilder associatedSourceBuilder() {
        return new AssociatedSourceBuilderImpl();
    }

    @Bean
    public DemoService demoService() {
        return new DemoServiceImpl();
    }

}
