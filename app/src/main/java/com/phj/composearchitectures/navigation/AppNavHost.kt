package com.phj.composearchitectures.navigation

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun AppNavHost(
    navController: NavHostController,
    homeScreen: @Composable (onTopicClick: (String) -> Unit) -> Unit,
    detailScreen: @Composable (topic: String, navController: NavHostController) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = Destinations.HOME
    ) {
        composable(Destinations.HOME) {
            homeScreen { topic ->
                navController.navigate(Destinations.detailRoute(Uri.encode(topic)))
            }
        }
        composable(
            route = Destinations.DETAIL,
            arguments = listOf(navArgument("topic") { type = NavType.StringType })
        ) { backStackEntry ->
            val topic = backStackEntry.arguments?.getString("topic") ?: ""
            detailScreen(topic, navController)
        }
    }
}

