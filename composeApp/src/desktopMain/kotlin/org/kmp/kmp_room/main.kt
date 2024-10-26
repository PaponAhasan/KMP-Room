package org.kmp.kmp_room

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KmpRoom",
    ) {
        App()
    }
}