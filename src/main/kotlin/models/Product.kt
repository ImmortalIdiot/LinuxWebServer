package com.immortalidiot.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(val id: Int, val title: String)
