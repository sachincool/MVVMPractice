package com.example.crappy.mvvmpractice.data

class fakedatabase private constructor() {
    var quoteDao =fakeQuoteDao()
    private set
companion object {
    @Volatile private var instance:fakedatabase?=null
    fun getInstance() = instance?: synchronized(this){
        instance ?: fakedatabase().also { instance = it}

    }
}
}