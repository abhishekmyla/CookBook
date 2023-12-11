package com.example.cookbook.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CookBook(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val imageBanner: Int,
    val ingredients: String,
     val recipeDetails: String
)
