package com.kishorramani.navigationcomponentbasic.simplenavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.kishorramani.navigationcomponentbasic.R
import com.kishorramani.navigationcomponentbasic.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var fragmentSecondBinding: FragmentSecondBinding? = null
    private val binding get() = fragmentSecondBinding!!

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myNumber = args.number
        binding.txtFragmentSecond.text = myNumber.toString()

        binding.txtFragmentSecond.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment)
        }
    }
}