package com.example.simpletodo.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    showList()
}

@Composable
fun showList(){
    val names = listOf<String>("炭素20kg", "アンモニア4L", "石灰1.5kg", "リン400g", "塩分250g", "硝石100g", "硫黄80g", "フッ素7.5g")
    LazyColumn(){
        items(names){ names ->
            Text(
                names,
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 25.sp
            )
            Divider()
        }
    }
}