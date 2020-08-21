package com.poc.ktmp

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*

actual val client: HttpClient get() = HttpClient(OkHttp)