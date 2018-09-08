package com.example.crappy.mvvmpractice.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.crappy.mvvmpractice.R
import com.example.crappy.mvvmpractice.data.Quote
import com.example.crappy.mvvmpractice.utilities.InjectorUtils
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_quotes)
        initializeUI()
    }
    private fun initializeUI(){
val factory=InjectorUtils.provideQuotesViewModelFactory()
    val viewModel= ViewModelProviders.of(this,factory)
            .get(QuotesViewModal::class.java)

    viewModel.getQuotes().observe(this, Observer { quotes -> val stringBuilder= StringBuilder()
    quotes.forEach{quote->
        stringBuilder.append("$quote\n\n ")
    }
    textView_quotes.text=stringBuilder.toString()

    })
        button_add_quote.setOnClickListener{
            val quote = Quote(editText_quote.text.toString(),editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }}
