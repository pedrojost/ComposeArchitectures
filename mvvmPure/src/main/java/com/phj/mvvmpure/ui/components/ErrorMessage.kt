package com.phj.mvvmpure.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ErrorMessage(message: String?) {
    Text(
        text = "Error: $message",
        color = MaterialTheme.colorScheme.error
    )
}