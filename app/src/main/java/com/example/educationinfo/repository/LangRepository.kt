package com.rahman.educationinfo.repository

import com.rahman.educationinfo.domain.model.Language

interface LangRepository {


    suspend fun getLang(): List<Language>

}