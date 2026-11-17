
package com.example.proyectowidgets

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        provideContent {
            GlanceTheme {
                MyContent()
            }
        }
    }

    @Composable
    private fun MyContent() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(GlanceTheme.colors.background)
                .padding(12.dp),
            verticalAlignment = Alignment.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Fabrizzio Vizcardo",
                modifier = GlanceModifier.padding(8.dp)
            )

            Text(
                text = "¿A dónde quieres dirigirte?",
                modifier = GlanceModifier.padding(8.dp)
            )

            Row(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    text = "Página Principal",
                    onClick = actionStartActivity<MainActivity>()
                )

                Button(
                    text = "Mi perfil",
                    onClick = actionStartActivity<ProfileActivity>()
                )
            }
        }
    }
}
