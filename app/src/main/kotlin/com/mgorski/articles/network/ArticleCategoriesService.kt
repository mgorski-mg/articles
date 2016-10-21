package com.mgorski.articles.network

import com.mgorski.articles.network.model.WebArticleCategory
import retrofit2.http.GET
import rx.Single

interface ArticleCategoriesService {

    @GET("api/articlecategory")
    fun getArticleCategories(): Single<List<WebArticleCategory>>
}