package com.rahman.educationinfo.persentation.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rahman.educationinfo.domain.model.Language
import com.rahman.educationinfo.repository.LangRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class LangViewModel @Inject constructor(
    private @Named("token_auth") val token: String,
    private val repository: LangRepository
) : ViewModel() {

     val lang: MutableState<List<Language>> = mutableStateOf(listOf());
    init {

       viewModelScope.launch {
           var result = repository.getLang();
           lang.value = result
       }
   }



}