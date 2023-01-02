package com.rahman.educationinfo.persentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.firestore.FirebaseFirestore
import com.rahman.educationinfo.domain.model.Language
import com.rahman.educationinfo.persentation.components.LangCard
import com.rahman.educationinfo.persentation.theme.EducationInfoTheme
import com.rahman.educationinfo.persentation.viewModel.LangViewModel

@Composable
fun homePage(
    langViewModel: LangViewModel
) {

    val langs: List<Language> = langViewModel.lang.value

    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
    ) {

        if (langs.isEmpty()) {
          Row(
              Modifier.fillMaxWidth(),
              Arrangement.Center
          ) {
              Text(text = "Loading...")
          }
        } else {

            LazyColumn {
                itemsIndexed(items = langs) { index, message ->
                    LangCard(message) {
                        println("Clicked on ${message.name}")
                    }
                }
            }
        }
    }
}

