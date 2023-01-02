package com.rahman.educationinfo.persentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rahman.educationinfo.domain.model.Language
import com.rahman.educationinfo.persentation.theme.EducationInfoTheme

@Composable
fun LangCard(
    language: Language,
    onClick: () -> Unit
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth().padding(3.dp)
    ) {
        Column(
            Modifier.padding(10.dp)
        ) {
            Text(text = language.name, style = MaterialTheme.typography.h6)
            Text(text = language.code, style = MaterialTheme.typography.subtitle1)

        }
    }
}


@Preview
@Composable
fun ComposablePreview() {

    EducationInfoTheme {
        Column(  Modifier.fillMaxSize(),
            Arrangement.Top,
            Alignment.Start) {

            LangCard(Language("Persion", "Fa")) {}
            LangCard(Language("Afrikaans", "Fa")) {}
            LangCard(Language("Shqip", "Fa")) {}
            LangCard(Language("azərbaycan dili", "Fa")) {}
            LangCard(Language("euskara, euskera", "Fa")) {}

        }
    }
}