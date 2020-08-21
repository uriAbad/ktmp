package com.poc.ktmp

import io.ktor.client.*
import io.ktor.client.engine.ios.*

actual val client: HttpClient get() = HttpClient(Ios)