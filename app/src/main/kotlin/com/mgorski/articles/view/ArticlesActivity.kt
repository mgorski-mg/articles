package com.mgorski.articles.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mgorski.articles.R
import com.mgorski.articles.databinding.ActivityArticlesBinding
import com.mgorski.articles.viewmodel.ArticlesViewModel

class ArticlesActivity : AppCompatActivity() {

    private val viewModel = ArticlesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityArticlesBinding>(this, R.layout.activity_articles).viewModel = viewModel
    }
}