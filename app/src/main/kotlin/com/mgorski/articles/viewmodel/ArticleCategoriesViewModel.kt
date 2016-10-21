package com.mgorski.articles.viewmodel

import android.databinding.ObservableArrayList
import com.mgorski.articles.di.AppComponent
import com.mgorski.articles.model.ArticleCategory
import com.mgorski.articles.model.toArticleCategory
import com.mgorski.articles.network.ArticleCategoriesService
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class ArticleCategoriesViewModel {

    @Inject lateinit var articleService: ArticleCategoriesService

    val articleCategories = ObservableArrayList<ArticleCategory>()

    init {
        AppComponent.instance.inject(this)
    }

    init {
        articleService.getArticleCategories()
                .map { webArticleCategories -> webArticleCategories.map { it.toArticleCategory() } }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ newArticleCategories ->
                    articleCategories.clear()
                    articleCategories.addAll(newArticleCategories)
//                    isLoading.set(false)
                }, {
//                    isLoading.set(false)
                })
    }
}