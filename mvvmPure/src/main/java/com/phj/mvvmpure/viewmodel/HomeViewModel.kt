package com.phj.mvvmpure.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.phj.mvvmpure.ui.HomeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    fun updateSearch(query: String) {
        viewModelScope.launch {
            val allTopics = _uiState.value.topics
            val filtered = if (query.isBlank()){
                allTopics
            } else {
                allTopics.filter { it.contains(query, ignoreCase = true) }
            }
            _uiState.value = _uiState.value.copy(
                searchQuery = query,
                filteredTopics = filtered
            )
        }
    }
}
