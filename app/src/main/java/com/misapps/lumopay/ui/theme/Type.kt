package com.misapps.lumopay.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.misapps.lumopay.R

// Definir la familia tipográfica Arial utilizando el recurso de la fuente
val Arial = FontFamily(
    Font(R.font.arial, FontWeight.Normal) // Usar la referencia a la fuente en res/font/
)

// Crear la instancia de Typography usando Arial
val CustomTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = Arial,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Arial,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Arial,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Arial,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Arial,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    // Puedes definir otros estilos de texto (subtitle, button, etc.) si lo deseas
)
