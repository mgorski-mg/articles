package com.mgorski.articles.network.interceptor

import com.mgorski.articles.BuildConfig
import com.mgorski.articles.network.util.BasicAuthHeaderGenerator
import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor : Interceptor {
    private val AUTHORIZATION_HEADER = "Authorization"

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder().addHeader(AUTHORIZATION_HEADER, BasicAuthHeaderGenerator.getValue(BuildConfig.API_USERNAME, BuildConfig.API_PASSWORD)).build()
        return chain.proceed(request)
    }
}