package com.rahman.educationinfo.network.model

import com.rahman.educationinfo.domain.model.Language
import com.rahman.educationinfo.domain.util.DomainMapper

class LangDtoMapper : DomainMapper<LangDto,Language> {
    override fun mapToDomainModel(model: LangDto): Language {
       return Language(
           name = model.name?:"",
           code = model.code?:""
       )
    }

    override fun mapFromDomainModel(domainModel: Language): LangDto {
      return LangDto(
          name = domainModel.name,
          code = domainModel.code
      )
    }

    fun toDomainList(items: List<LangDto>): List<Language>{
        return items.map { mapToDomainModel(it) };
    }
    fun fromDomainList(items: List<Language>): List<LangDto>{
        return items.map { mapFromDomainModel(it) };
    }


}