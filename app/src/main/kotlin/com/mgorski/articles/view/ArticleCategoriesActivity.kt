package com.mgorski.articles.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mgorski.articles.R
import com.mgorski.articles.databinding.ActivityArticleCategoriesBinding
import com.mgorski.articles.viewmodel.ArticleCategoriesViewModel

class ArticleCategoriesActivity : AppCompatActivity() {

    private val viewModel = ArticleCategoriesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityArticleCategoriesBinding>(this, R.layout.activity_article_categories).viewModel = viewModel
    }
}