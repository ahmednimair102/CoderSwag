package com.ahmed.coderswag.Services

import com.ahmed.coderswag.Model.Category
import com.ahmed.coderswag.Model.Product

open class DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS" ,"hatimage"),
        Category("DIGITAL" , "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Big Bang City Hat", "$12" , "hat01"),
        Product("Big Bang World Hat", "$18" , "hat02"),
        Product("Big Bang Universe Hat", "$20" , "hat03"),
        Product("Big Bang Galaxy Hat", "$25" , "hat04")
    )

    val hoodie = listOf(
        Product("Monster Hoodie", "$25", "hoodie01"),
        Product("Big Monster Hoodie", "$35", "hoodie02"),
        Product("Very Big Monster Hoodie", "$45", "hoodie03"),
        Product("Very Very Big Monster Hoodie", "$55", "hoodie04")
    )

    val shirts = listOf(
        Product("Monster Shirts", "$25", "shirt01"),
        Product("Big Monster Shirts", "$35", "shirt02"),
        Product("Very Big Monster Shirts", "$45", "shirt03"),
        Product("Very Very Big Monster Shirts", "$55", "shirt04"),
        Product("Very Very insane Big Monster Shirts", "$65", "shirt05")
    )
}