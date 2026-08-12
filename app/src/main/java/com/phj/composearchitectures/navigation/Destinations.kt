package com.phj.composearchitectures.navigation

object Destinations {
    const val HOME = "home"
    const val DETAIL = "detail/{topic}"

    fun detailRoute(topic: String) = "detail/$topic"
}