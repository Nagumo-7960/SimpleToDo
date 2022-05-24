package com.example.simpletodo

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Simple ToDo",
                color = Color.White
            )
        },
        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = "Open drawer",
                    tint = Color.White
                )
            }
        },
        backgroundColor = Color.Blue
    )
}