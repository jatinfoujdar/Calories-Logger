package org.example.calorieslogger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform