package com.example.simpletodo

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Text(text = "Simple ToDo")
        },
        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Menu, contentDescription = "Open drawer")
            }
        }
    )
}