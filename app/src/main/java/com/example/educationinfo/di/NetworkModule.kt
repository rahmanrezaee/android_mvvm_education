package com.rahman.educationinfo.di

import com.rahman.educationinfo.network.LangService
import com.rahman.educationinfo.network.model.LangDtoMapper
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideLangMapper():  LangDtoMapper{
        return  LangDtoMapper();
    }

    @Singleton
    @Provides
    fun provideLangServer(): LangService{
        return Retrofit.Builder()
            .baseUrl("http://54.241.7.222:3000/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(LangService::class.java)
    }

    @Singleton
    @Provides
    @Named("token_auth")
    fun provideToken():String{
        return "Token asdasdew12313eqwdas";
    }

}