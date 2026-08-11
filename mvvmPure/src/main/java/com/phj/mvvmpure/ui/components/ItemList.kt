package com.phj.mvvmpure.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ItemList(items: List<String>) {
    items.forEach { item ->
        Text(text = item)
    }
}