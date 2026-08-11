package com.phj.composearchitectures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phj.composearchitectures.ui.theme.ComposeArchitecturesTheme
import com.phj.mvvmpure.ui.HomeScreen
import com.phj.mvipure.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.phj.mvvmpure.ui.HomeScreen()
//            com.phj.mvipure.HomeScreen()
        }
    }
}

@Preview(showBackground = true, name = "HomeScreen Light")
@Composable
fun HomeScreenPreviewLight() {
    ComposeArchitecturesTheme(darkTheme = false) {
        com.phj.mvvmpure.ui.HomeScreen()
        //            com.phj.mvipure.HomeScreen()
    }
}

@Preview(showBackground = true, name = "HomeScreen Dark")
@Composable
fun HomeScreenPreviewDark() {
    ComposeArchitecturesTheme(darkTheme = true) {
        com.phj.mvvmpure.ui.HomeScreen()
        //            com.phj.mvipure.HomeScreen()
    }
}

