package com.example.crappy.mvvmpractice.data

class QuoteRepository private constructor(private val quoteDao: fakeQuoteDao){
fun addQuote(quote:Quote){
    quoteDao.addquote(quote)

}

    fun getQuotes()= quoteDao.getquotes()

    companion object {
    @Volatile private var instance:QuoteRepository?=null
    fun getInstance(quoteDao: fakeQuoteDao) = instance?: synchronized(this){
        instance ?: QuoteRepository(quoteDao).also { instance = it}

    }
}}