package com.poc.ktmp

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin rocks on ${platformName()}!"
}