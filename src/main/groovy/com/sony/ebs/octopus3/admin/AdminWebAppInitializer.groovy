package com.sony.ebs.octopus3.admin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
@EnableAutoConfiguration
class AdminApplication {

    public static void main(String... args) {
        SpringApplication.run(AdminApplication, args)
    }
}