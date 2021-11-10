package com.norbersan.springdynamicproperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ClassWithInjectedProperties {
    @Value("\${application.host}")
    lateinit var host: String

    @Value("\${application.port}")
    var port: Int = 7933

    @Bean
    fun beanWithInjectedProperties() = BeanWithInjectedProperties(host, port)
}

data class BeanWithInjectedProperties(
        val host: String,
        val port: Int
)