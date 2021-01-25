package com.kishorramani.navigationcomponentbasic.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kishorramani.navigationcomponentbasic.databinding.FragmentViewPagerBinding
import com.kishorramani.navigationcomponentbasic.onboarding.screens.FirstScreen
import com.kishorramani.navigationcomponentbasic.onboarding.screens.SecondScreen
import com.kishorramani.navigationcomponentbasic.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private var fragmentViewPagerBinding: FragmentViewPagerBinding? = null
    private val binding get() = fragmentViewPagerBinding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentViewPagerBinding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList: ArrayList<Fragment> = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter
    }
}