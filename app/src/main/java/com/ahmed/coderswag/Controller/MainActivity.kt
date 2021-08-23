package com.ahmed.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmed.coderswag.Adapters.RecyclerAdapter
import com.ahmed.coderswag.R
import com.ahmed.coderswag.Services.DataService
import com.ahmed.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = RecyclerAdapter(this, DataService.categories){ category ->
            val productIntent = Intent(this ,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY , category.title)
            startActivity(productIntent)
        }
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