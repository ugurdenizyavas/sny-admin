package com.sony.ebs.octopus3.admin

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

/**
 * Created by TRBabalH on 18.09.2014.
 */
@Configuration
@ComponentScan(value = 'com.sony.ebs.octopus3.admin')
@PropertySource(value = ['classpath:/default.properties', 'classpath:/${environment}.properties'], ignoreResourceNotFound = true)
class SpringAdminConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
