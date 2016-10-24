package com.mgorski.articles.network

import com.mgorski.articles.network.model.WebArticleCategoryRequest
import com.mgorski.articles.network.model.WebArticleCategoryResponse
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import rx.Single

interface ArticleCategoriesService {

    @GET("api/articlecategory")
    fun getArticleCategories(): Single<List<WebArticleCategoryResponse>>

    @POST("api/articlecategory")
    @Headers("Content-Type: application/xml")
    fun sendArticleCategory(@Body webArticleCategoryRequest: WebArticleCategoryRequest): Single<ResponseBody>
}

