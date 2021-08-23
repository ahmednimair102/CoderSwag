package com.ahmed.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmed.coderswag.R
import com.ahmed.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}