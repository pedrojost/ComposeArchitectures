package com.phj.mvvmpure.ui

data class HomeUiState(
    val welcomeMessage: String = "Welcome to MVVM Pure",
    val searchQuery: String = "",
    val topics: List<String> = listOf(
        "MVVM Basics",
        "ViewModel lifecycle",
        "StateFlow in Compose",
        "Repository Pattern",
        "Testing ViewModels"
    ),
    val filteredTopics: List<String> = topics
)