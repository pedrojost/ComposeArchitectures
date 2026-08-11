package com.phj.mvvmpure.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.phj.mvvmpure.viewmodel.HomeViewModel
import androidx.compose.runtime.getValue
import com.phj.mvvmpure.ui.components.ErrorMessage
import com.phj.mvvmpure.ui.components.ItemList
import com.phj.mvvmpure.ui.components.LoadingIndicator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val uiState by homeViewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("MVI Pure") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            when {
                uiState.isLoading -> LoadingIndicator()
                uiState.errorMessage != null ->{
                    ErrorMessage(uiState.errorMessage)
                }
                uiState.items.isNotEmpty() -> ItemList(uiState.items)
            }

            Text(text = "Current message: ${uiState.message}")

            Button(onClick = { homeViewModel.updateMessage("Hello Compose + ViewModel!")} ) {
                Text("Update message")
            }

            Button(onClick = { homeViewModel.loadItems() }) {
                Text("Load items")
            }
        }
    }
}
