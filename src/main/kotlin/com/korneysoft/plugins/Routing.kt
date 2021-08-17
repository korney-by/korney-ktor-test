package com.korneysoft.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World! I'm Ktor.")
        }

        get("/123/") {
            call.respondText("Hello World! I'm 123.")
        }

        post("/") {
            call.respondText("This is POST.")
        }
    }
}
