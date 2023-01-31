package com.example.composearticle

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color

enum class ComposableInformation(
    @StringRes val title: Int,
    @StringRes val definition: Int,
    val color: Color
) {
    Text(R.string.text_composable_title, R.string.text_composable_definition, Color.Green),
    Image(R.string.image_composable_title, R.string.image_composable_definition, Color.Yellow),
    Row(R.string.row_composable_title, R.string.row_composable_definition, Color.Cyan),
    Column(R.string.column_composable_title, R.string.column_composable_definition, Color.LightGray)
}