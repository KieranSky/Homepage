package com.example.homepage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun GreetingPage() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hello")
        Text(text = "World")
    }
}