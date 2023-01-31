package com.example.composearticle

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

@Composable
fun ComposableQuadrantComplete() {
    Column(Modifier.fillMaxWidth()) {
        Row( modifier = Modifier.weight(1f)) {
            ComposeQuadrant(composableInfo = ComposableInformation.Text, modifier = Modifier.weight(1f))
            ComposeQuadrant(composableInfo = ComposableInformation.Image, modifier = Modifier.weight(1f))
        }
        Row( modifier = Modifier.weight(1f)) {
            ComposeQuadrant(composableInfo = ComposableInformation.Row, modifier = Modifier.weight(1f))
            ComposeQuadrant(composableInfo = ComposableInformation.Column, modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ComposeQuadrant(composableInfo: ComposableInformation, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
            .background(composableInfo.color)
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(id = composableInfo.title),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(id = composableInfo.definition),
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeArticleTheme() {
        ComposeQuadrant(
            composableInfo = ComposableInformation.Text
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantCompletePreview() {
    ComposeArticleTheme {
        ComposableQuadrantComplete()
    }
}

