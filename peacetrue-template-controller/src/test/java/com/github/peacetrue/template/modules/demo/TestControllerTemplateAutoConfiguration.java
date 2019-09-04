package com.github.peacetrue.template.modules.demo;

import com.github.peacetrue.template.ControllerTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiayx
 */
@Configuration
@ImportAutoConfiguration(classes = {
        TestServiceTemplateAutoConfiguration.class,
        WebMvcAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        ControllerTemplateAutoConfiguration.class,
})
@PropertySource("classpath:application-template-controller-test.properties")
public class TestControllerTemplateAutoConfiguration {
}
