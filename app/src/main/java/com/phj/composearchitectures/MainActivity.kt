package com.phj.composearchitectures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.phj.composearchitectures.navigation.AppNavHost


enum class ArchitectureType {
    MVVMPure,
    MVIPure
}
class MainActivity : ComponentActivity() {
    // Choose which architecture to launch
    private val selectedArchitecture = ArchitectureType.MVVMPure
    //Or: private val selectedArchitecture = ArchitectureType.MVIPure

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            when (selectedArchitecture) {
                ArchitectureType.MVVMPure -> {
                    AppNavHost(
                        navController = navController,
                        homeScreen = { onTopicClick ->
                            com.phj.mvvmpure.ui.HomeScreen(onTopicClick = onTopicClick)
                        },
                        detailScreen = { topic, navController ->
                            com.phj.mvvmpure.ui.DetailScreen(topic = topic, navController = navController)
                        }
                    )
                }
                ArchitectureType.MVIPure -> {
                AppNavHost(
                    navController = navController,
                    homeScreen = { onTopicClick ->
//                        com.phj.mviflow.ui.MviHomeScreen(onTopicClick = onTopicClick)
                    },
                    detailScreen = { topic, navController ->
//                        com.phj.mviflow.ui.DetailScreen(topic = topic, navController = navController)
                    }
                )
            }
            }

        }
    }
}

