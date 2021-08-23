package com.ahmed.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ahmed.coderswag.Model.Product
import com.ahmed.coderswag.R
import com.ahmed.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product?.image, "drawable", packageName)
        detailImageView.setImageResource(resourceId)
        detailProductName.text = product?.title
        detailProductPrice.text = product?.price

        val button = findViewById<Button>(R.id.Addbutton)
        button.setOnClickListener{
            val intent = Intent(this, ThanksActivity::class.java)
            startActivity(intent)
        }
    }
}