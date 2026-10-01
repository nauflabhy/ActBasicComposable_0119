package com.example.prak3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp), // Memberikan jarak dari batas atas layar
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Teks Judul Login
        Text(
            text = "Login",
            fontSize = 32.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp)) // Jarak antara judul dan sub-judul

        // Teks Deskripsi Halaman
        Text(
            text = "Ini adalah halaman login,",
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
