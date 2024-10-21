package com.dicoding.newsapp.ui

import androidx.lifecycle.ViewModelProvider
import com.dicoding.newsapp.data.NewsRepository

class ViewModelFactory private constructor(private val newsRepository: NewsRepository) :
    ViewModelProvider.NewInstanceFactory() {
}