package com.mgorski.articles.di

import com.mgorski.articles.network.RetrofitModule
import com.mgorski.articles.viewmodel.ArticleCategoriesViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(RetrofitModule::class))
interface AppComponent {

    companion object {
        var instance: AppComponent = DaggerAppComponent.builder()
                .build()
    }

    fun inject(articleCategoriesViewModel: ArticleCategoriesViewModel)
}