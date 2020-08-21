package com.poc.ktmp

import io.ktor.client.*
import io.ktor.client.request.*

suspend fun getRequest(): String {
    val client = HttpClient()
    return client.get<String>("https://opentdb.com/api.php?amount=10")
}