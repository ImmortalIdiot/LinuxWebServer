package com.immortalidiot.routes

import com.immortalidiot.models.User
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userRoutes() {
    route("/users") {
        get {
            call.respond(
                listOf(
                    User(1, "Random User"),
                    User(2, "John Doe")
                )
            )
        }
    }
}
