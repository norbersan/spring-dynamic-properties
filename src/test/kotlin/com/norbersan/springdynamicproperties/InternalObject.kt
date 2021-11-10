package com.norbersan.springdynamicproperties

import mu.KotlinLogging
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import java.util.concurrent.TimeUnit

internal object InternalObject {

    init{
        TimeUnit.SECONDS.sleep(15)
    }

    @DynamicPropertySource
    @JvmStatic
    fun registerDynamicProperties(registry: DynamicPropertyRegistry) {
        registry.add("host") { "safe.host" }
        registry.add("port") { 443 }
        KotlinLogging.logger { }.info{ "registerDynamicProperties executed" }
    }
}