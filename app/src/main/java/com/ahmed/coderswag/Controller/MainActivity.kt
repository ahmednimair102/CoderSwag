package com.ahmed.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmed.coderswag.Adapters.CategoryAdapter
import com.ahmed.coderswag.R
import com.ahmed.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categorylistview.adapter =adapter
    }
}