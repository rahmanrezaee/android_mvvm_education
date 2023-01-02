package com.rahman.educationinfo.di

import com.rahman.educationinfo.network.LangService
import com.rahman.educationinfo.network.model.LangDtoMapper
import com.rahman.educationinfo.repository.LangRepository
import com.rahman.educationinfo.repository.LangRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModul {

    @Singleton
    @Provides
    fun provideLangRepository(
        langService: LangService,
        langDtoMapper: LangDtoMapper
    ): LangRepository{
        return  LangRepositoryImp(
            langService,
            langDtoMapper
        );
    }

}