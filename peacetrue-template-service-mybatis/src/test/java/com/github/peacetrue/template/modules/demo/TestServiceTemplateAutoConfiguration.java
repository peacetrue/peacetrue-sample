package com.github.peacetrue.template.modules.demo;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import com.github.peacetrue.template.ServiceTemplateAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiayx
 */
@Configuration
@ImportAutoConfiguration(classes = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        MybatisAutoConfiguration.class,
        PageHelperAutoConfiguration.class,
        ServiceTemplateAutoConfiguration.class,
})
@PropertySource("classpath:application-template-service-test.properties")
public class TestServiceTemplateAutoConfiguration {
}
