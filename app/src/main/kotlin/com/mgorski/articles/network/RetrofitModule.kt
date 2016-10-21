package com.mgorski.articles.network

import android.util.Log
import com.mgorski.articles.BuildConfig
import com.mgorski.articles.network.interceptor.AuthorizationInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class RetrofitModule {

    @Provides
    fun getArticleCategoriesService(retrofit: Retrofit)
            = retrofit.create(ArticleCategoriesService::class.java)

    @Provides
    fun getRetrofit(okHttpClient: OkHttpClient)
            = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BuildConfig.END_POINT_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build()

    @Provides
    fun getOkHttp(loggingInterceptor: HttpLoggingInterceptor, authorizationInterceptor: AuthorizationInterceptor)
            = OkHttpClient.Builder()
            .addNetworkInterceptor(authorizationInterceptor)
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { Log.d("articles_app", it) })
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    @Provides
    fun getAuthorizationInterceptor() = AuthorizationInterceptor()
}