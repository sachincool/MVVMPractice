package com.example.crappy.mvvmpractice.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.crappy.mvvmpractice.data.QuoteRepository

@Suppress("UNCHECKED_CAST")
class QuoteViewModelFactory(private val quoteRepository: QuoteRepository ):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModal(quoteRepository) as T
    }


}