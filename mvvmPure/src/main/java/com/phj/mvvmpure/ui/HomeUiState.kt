package com.phj.mvvmpure.ui

data class HomeUiState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val items: List<String> = emptyList(),
    val message: String = "Initial message"
)