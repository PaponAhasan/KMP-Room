package org.kmp.kmp_room

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform