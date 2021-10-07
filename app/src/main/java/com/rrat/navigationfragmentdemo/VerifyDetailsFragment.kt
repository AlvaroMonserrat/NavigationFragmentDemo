package com.rrat.navigationfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.rrat.navigationfragmentdemo.databinding.FragmentVerifyDetailsBinding


class VerifyDetailsFragment : Fragment() {

    private lateinit var binding: FragmentVerifyDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerifyDetailsBinding.inflate(inflater, container, false)

        val args: VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobileNumber = args.mobile
        //val name = arguments?.getString("name")
        //val mobileNumber = arguments?.getLong("mobile")

        binding.tvName.text = name
        binding.tvMobileNumber.text = mobileNumber.toString()

        return binding.root
    }

}