package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(R.string.hero1, R.string.description1, R.drawable.ic_launcher_foreground),
        Hero(R.string.hero2, R.string.description2, R.drawable.ic_launcher_foreground),
        Hero(R.string.hero3, R.string.description3, R.drawable.ic_launcher_foreground),
        Hero(R.string.hero4, R.string.description4, R.drawable.ic_launcher_foreground),
        Hero(R.string.hero5, R.string.description5, R.drawable.ic_launcher_foreground),
        Hero(R.string.hero6, R.string.description6, R.drawable.ic_launcher_foreground)
    )
}
