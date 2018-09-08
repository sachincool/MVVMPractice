package com.example.crappy.mvvmpractice.utilities

import com.example.crappy.mvvmpractice.data.QuoteRepository
import com.example.crappy.mvvmpractice.data.fakedatabase
import com.example.crappy.mvvmpractice.ui.quotes.QuoteViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory():QuoteViewModelFactory{
        val quoteRepository=QuoteRepository.getInstance(fakedatabase.getInstance().quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}