package com.learneasy.lesson7.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learneasy.lesson7.R

open class FirstFragment : Fragment() {

    companion object {
        val TAG: String = FirstFragment::class.java.simpleName
        fun newInstance() = FirstFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)
        return view
    }
}