package com.kishorramani.navigationcomponentbasic.onboarding

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kishorramani.navigationcomponentbasic.R
import com.kishorramani.navigationcomponentbasic.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    private var fragmentSplashBinding: FragmentSplashBinding? = null
    private val binding get() = fragmentSplashBinding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentSplashBinding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed({
            if (isOnBoardingFinish()) {
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_homeFragment)
            } else {
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_viewPagerFragment)
            }

//            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        }, 2000L)


    }

    private fun isOnBoardingFinish(): Boolean {
        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("Finished", false)
    }
}