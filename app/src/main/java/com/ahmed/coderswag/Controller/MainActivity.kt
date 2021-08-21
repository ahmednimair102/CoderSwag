package com.ahmed.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmed.coderswag.Adapters.RecyclerAdapter
import com.ahmed.coderswag.R
import com.ahmed.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = RecyclerAdapter(this, DataService.categories)
        categorylistview.adapter =adapter

        val layoutManager = LinearLayoutManager(this)
        categorylistview.layoutManager = layoutManager
        categorylistview.setHasFixedSize(true)


        //categorylistview.setOnItemClickListener { parent, view, position, id ->
           // val categories = DataService.categories[position]
            // Toast.makeText(this, "you click on ${categories.title} cell", Toast.LENGTH_SHORT).show()
        //}
    }
}