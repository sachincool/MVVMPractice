package com.example.crappy.mvvmpractice.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class fakeQuoteDao {
private val quoteList= mutableListOf<Quote>()
    private val quotes=MutableLiveData<List<Quote>>()
    init {
        quotes.value=quoteList
    }

    fun addquote(quote:Quote){
        quoteList.add(quote)
        quotes.value=quoteList
    }

    fun getquotes() =quotes as LiveData<List<Quote>>
}