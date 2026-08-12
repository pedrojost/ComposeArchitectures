package com.phj.mvvmpure.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment

@Composable
fun TopicList(
    topics: List<String>,
    onTopicClick: (String) -> Unit,
) {
    LazyColumn (
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(topics) { topic ->
            ListItem(
                headlineContent = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = topic,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable{ onTopicClick(topic) },
            )
            HorizontalDivider(thickness = 0.5.dp)
        }
    }
}