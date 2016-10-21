package com.mgorski.articles.viewmodel

import android.databinding.ObservableArrayList
import com.mgorski.articles.model.ArticleCategory

class ArticlesViewModel {
    val articleCategories = ObservableArrayList<ArticleCategory>()

    init {
        articleCategories.add(ArticleCategory("First"))
        articleCategories.add(ArticleCategory("Second"))
        articleCategories.add(ArticleCategory("Third"))
    }
}

