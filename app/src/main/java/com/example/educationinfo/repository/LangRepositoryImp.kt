package com.rahman.educationinfo.repository

import com.rahman.educationinfo.domain.model.Language
import com.rahman.educationinfo.network.LangService
import com.rahman.educationinfo.network.model.LangDtoMapper

class LangRepositoryImp(
    private val langService: LangService,
    private val mapper: LangDtoMapper
) : LangRepository {

    override suspend fun getLang(): List<Language> {
        return mapper.toDomainList(langService.getLang().date);
    }
}