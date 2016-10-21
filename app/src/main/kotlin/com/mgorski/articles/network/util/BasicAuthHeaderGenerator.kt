package com.mgorski.articles.network.util

import android.util.Base64

object BasicAuthHeaderGenerator {
    private val AUTHORIZATION_TYPE = "Basic "

    fun getValue(username: String, password: String): String {
        val credentials = username + ":" + password
        return AUTHORIZATION_TYPE + Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)
    }
}