package com.mgorski.articles.model

import com.mgorski.articles.network.model.WebArticleCategoryResponse

class ArticleCategory(val name: String) {

    override fun toString()
            = name
}

fun WebArticleCategoryResponse.toArticleCategory() = ArticleCategory(Name)