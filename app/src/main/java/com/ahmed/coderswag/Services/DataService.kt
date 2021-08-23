package com.ahmed.coderswag.Services

import com.ahmed.coderswag.Model.Category
import com.ahmed.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS" ,"hatimage"),
        Category("DIGITAL" , "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
    Category("HOODIES", "hoodieimage"),
    Category("HATS", "hatimage"),
    Category("DIGITAL", "digitalgoodsimage"),
    Category("SHIRTS", "shirtimage"),
    Category("HOODIES", "hoodieimage"),
    Category("HATS", "hatimage"),
    Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Big Bang City Hat", "$12" , "hat1"),
        Product("Big Bang World Hat", "$18" , "hat2"),
        Product("Big Bang Universe Hat", "$20" , "hat3"),
        Product("Big Bang Galaxy Hat", "$25" , "hat4"),
        Product("Big Bang City Hat", "$12" , "hat1"),
        Product("Big Bang World Hat", "$18" , "hat2"),
        Product("Big Bang Universe Hat", "$20" , "hat3"),
        Product("Big Bang Galaxy Hat", "$25" , "hat4"),
        Product("Big Bang City Hat", "$12" , "hat1"),
        Product("Big Bang World Hat", "$18" , "hat2"),
        Product("Big Bang Universe Hat", "$20" , "hat3"),
        Product("Big Bang Galaxy Hat", "$25" , "hat4")
    )

    val hoodie = listOf(
        Product("Monster Hoodie", "$25", "hoodie1"),
        Product("Big Monster Hoodie", "$35", "hoodie2"),
        Product("Very Big Monster Hoodie", "$45", "hoodie3"),
        Product("Very Very Big Monster Hoodie", "$55", "hoodie4"),
        Product("Monster Hoodie", "$25", "hoodie1"),
        Product("Big Monster Hoodie", "$35", "hoodie2"),
        Product("Very Big Monster Hoodie", "$45", "hoodie3"),
        Product("Very Very Big Monster Hoodie", "$55", "hoodie4"),
        Product("Monster Hoodie", "$25", "hoodie1"),
        Product("Big Monster Hoodie", "$35", "hoodie2"),
        Product("Very Big Monster Hoodie", "$45", "hoodie3"),
        Product("Very Very Big Monster Hoodie", "$55", "hoodie4")
    )

    val shirts = listOf(
        Product("Monster Shirts", "$25", "shirt1"),
        Product("Big Monster Shirts", "$35", "shirt2"),
        Product("Very Big Monster Shirts", "$45", "shirt3"),
        Product("Very Very Big Monster Shirts", "$55", "shirt4"),
        Product("Very Very insane Big Monster Shirts", "$65", "shirt5"),
        Product("Monster Shirts", "$25", "shirt1"),
        Product("Big Monster Shirts", "$35", "shirt2"),
        Product("Very Big Monster Shirts", "$45", "shirt3"),
        Product("Very Very Big Monster Shirts", "$55", "shirt4"),
        Product("Very Very insane Big Monster Shirts", "$65", "shirt5"),
        Product("Monster Shirts", "$25", "shirt1"),
        Product("Big Monster Shirts", "$35", "shirt2"),
        Product("Very Big Monster Shirts", "$45", "shirt3"),
        Product("Very Very Big Monster Shirts", "$55", "shirt4"),
        Product("Very Very insane Big Monster Shirts", "$65", "shirt5")
    )
    val digitalGood = listOf<Product>()

    fun getProducts(category: String?) :List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES"-> hoodie
            else -> digitalGood
        }
    }
}