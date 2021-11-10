package com.norbersan.springdynamicproperties

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.TestInstance
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@Tags(
        Tag("integration"),
        Tag("spring-boot"),
        Tag("nats")
)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test", "no-nats")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BaseTestClass {
    internal val internalObject: InternalObject = InternalObject

}