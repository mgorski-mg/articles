package com.mgorski.articles.model

import com.mgorski.articles.network.model.WebArticleCategory

class ArticleCategory(val name: String) {

    override fun toString()
            = name
}

fun WebArticleCategory.toArticleCategory() = ArticleCategory(Name)