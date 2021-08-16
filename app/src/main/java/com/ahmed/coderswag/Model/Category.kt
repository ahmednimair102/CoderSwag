package com.ahmed.coderswag.Model

open class Category(val title: String, public val image: String) {
    override fun toString(): String {
        return title
    }
}