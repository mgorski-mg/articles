package com.mgorski.articles

import android.util.Log

object Logger {
    private val TAG: String = "article_categories"

    fun d(message: String) {
        Log.d(TAG, message)
    }

    fun e(error: Throwable) {
        Log.e(TAG, error.message, error)
    }
}