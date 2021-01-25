package com.kishorramani.navigationcomponentbasic.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kishorramani.navigationcomponentbasic.R
import com.kishorramani.navigationcomponentbasic.databinding.FragmentFirstScreenBinding

class FirstScreen : Fragment() {

    private var fragmentFirstScreenBinding: FragmentFirstScreenBinding? = null
    private val binding get() = fragmentFirstScreenBinding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentFirstScreenBinding = FragmentFirstScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next.setOnClickListener {
            viewPager2?.currentItem = 1
        }
    }
}