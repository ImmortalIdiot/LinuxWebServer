package com.immortalidiot

import com.immortalidiot.routes.healthCheck
import com.immortalidiot.routes.productRoutes
import com.immortalidiot.routes.userRoutes
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(
        factory = Netty,
        port = 5000,
        module = Application::module
    )
        .start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        healthCheck()
        productRoutes()
        userRoutes()
    }
}
