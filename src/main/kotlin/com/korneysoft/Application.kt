package com.korneysoft

import com.korneysoft.plugins.configureRouting
import com.korneysoft.plugins.configureSecurity
import com.korneysoft.plugins.configureSerialization
import com.korneysoft.plugins.configureSockets
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
    //embeddedServer(Netty, port = 8080, host = "10.182.12.202") {
        configureRouting()
        configureSecurity()
        configureSockets()
        configureSerialization()
    }.start(wait = true)
}
