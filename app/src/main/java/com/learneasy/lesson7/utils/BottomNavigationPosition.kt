package com.learneasy.lesson7.utils

import androidx.fragment.app.Fragment
import com.learneasy.lesson7.R
import com.learneasy.lesson7.ui.fragment.FirstFragment
import com.learneasy.lesson7.ui.fragment.SecondFragment


enum class BottomNavigationPosition(val position: Int, val id: Int) {
    FIRST(0, R.id.first),
    SECOND(1, R.id.second)
}
fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.FIRST.id -> BottomNavigationPosition.FIRST
    BottomNavigationPosition.SECOND.id -> BottomNavigationPosition.SECOND
    else -> BottomNavigationPosition.FIRST
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.FIRST -> FirstFragment.newInstance()
    BottomNavigationPosition.SECOND -> SecondFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.FIRST -> FirstFragment.TAG
    BottomNavigationPosition.SECOND -> SecondFragment.TAG
}