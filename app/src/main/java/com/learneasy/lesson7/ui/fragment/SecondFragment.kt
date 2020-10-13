package com.learneasy.lesson7.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learneasy.lesson7.R

open class SecondFragment : Fragment() {

    companion object {
        val TAG: String = SecondFragment::class.java.simpleName
        fun newInstance() = SecondFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)
        return view
    }
}