package com.poc.ktmp

import io.ktor.client.*
import io.ktor.client.request.*

expect val client: HttpClient

suspend fun getRequest(): String {
    return client.get<String>("https://opentdb.com/api.php?amount=10")
}