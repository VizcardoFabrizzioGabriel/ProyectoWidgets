
package com.example.proyectowidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ProfileActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Mi segunda pantalla",
                            style = MaterialTheme.typography.headlineMedium
                        )

                        Text(
                            text = "Fabrizzio Vizcardo",
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(top = 16.dp)
                        )

                        Text(
                            text = "Bienvenido a mi aplicación de widgets.",
                            modifier = Modifier.padding(top = 12.dp)
                        )

                        Button(
                            onClick = {
                                finish()
                            },
                            modifier = Modifier.padding(top = 24.dp)
                        ) {
                            Text("Regresar")
                        }
                    }
                }
            }
        }
    }
}
