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

    fun loadItems() {
        _uiState.value = _uiState.value.copy(isLoading = true)

        viewModelScope.launch{
            try {
                val data = listOf("Item 1", "Item 2", "Item 3")
                _uiState.value = HomeUiState(items = data, message = "Items loaded")
            } catch (e: Exception) {
                _uiState.value = HomeUiState(errorMessage = "Fail to load items")
            }
        }
    }

    fun updateMessage(newMessage: String) {
        _uiState.value = _uiState.value.copy(message = newMessage)
    }
}
