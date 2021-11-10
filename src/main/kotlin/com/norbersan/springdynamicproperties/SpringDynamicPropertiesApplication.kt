package com.norbersan.springdynamicproperties

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDynamicPropertiesApplication

fun main(args: Array<String>) {
    runApplication<SpringDynamicPropertiesApplication>(*args)
}
