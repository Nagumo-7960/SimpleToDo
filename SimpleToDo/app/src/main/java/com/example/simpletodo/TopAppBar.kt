package com.example.simpletodo

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Text(text = "Simple ToDo")
        },
    )
}