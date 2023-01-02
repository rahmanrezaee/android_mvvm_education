package com.rahman.educationinfo.persentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rahman.educationinfo.persentation.theme.EducationInfoTheme
import com.rahman.educationinfo.persentation.viewModel.LangViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private  val langViewModel: LangViewModel by viewModels();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EducationInfoTheme {
                // A surface container using the 'background' color from the theme

                    homePage(
                        langViewModel
                    )

            }
        }
    }
}



