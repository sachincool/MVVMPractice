package com.example.crappy.mvvmpractice.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.crappy.mvvmpractice.data.Quote
import com.example.crappy.mvvmpractice.data.QuoteRepository

class QuotesViewModal(private val quoteRepository:QuoteRepository) :ViewModel() {
fun getQuotes()=quoteRepository.getQuotes()

    fun addQuote(quote:Quote){quoteRepository.addQuote(quote)}

}