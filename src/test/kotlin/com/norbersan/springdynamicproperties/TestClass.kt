package com.norbersan.springdynamicproperties

import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class TestClass {
    @Autowired
    lateinit var beanWithInjectedProperties: BeanWithInjectedProperties

    @Test
    fun `dynamic properties are loaded`(){
        KotlinLogging.logger {  }.info { "${beanWithInjectedProperties.host}:${beanWithInjectedProperties.port}" }
        assert(beanWithInjectedProperties.host.equals("safe.host"))
        assert(beanWithInjectedProperties.port.equals(443))
    }
}