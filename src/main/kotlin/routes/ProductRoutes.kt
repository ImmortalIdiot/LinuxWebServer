package com.immortalidiot.routes

import com.immortalidiot.models.Product
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.productRoutes() {
    route("/products") {
        get {
            call.respond(listOf(Product(1, "Milk"), Product(2, "Bread")))
        }
    }
}