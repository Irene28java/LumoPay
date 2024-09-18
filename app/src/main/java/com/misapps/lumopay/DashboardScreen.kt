package com.misapps.lumopay

import androidx.compose.foundation.layout.* // Import correcto de layouts
import androidx.compose.material3.Button // Usar Button de Material 3
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dashboard") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp), // Añadido padding para evitar el error de tamaño
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Usa el estilo tipográfico de Material 3
            Text("Account Balance: $10,000", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { /* Implement Send Money Logic */ }) {
                Text("Send Money")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { /* Implement Request Money Logic */ }) {
                Text("Request Money")
            }
        }
    }
}
