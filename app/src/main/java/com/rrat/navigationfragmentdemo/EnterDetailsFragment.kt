package com.rrat.navigationfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.rrat.navigationfragmentdemo.databinding.FragmentEnterDetailsBinding


class EnterDetailsFragment : Fragment() {

    private lateinit var binding: FragmentEnterDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEnterDetailsBinding.inflate(inflater, container, false)



        val btnVerifyDetails = binding.btnVerifyDetails

        btnVerifyDetails.setOnClickListener {

            val firstName = binding.etFirstName.text.toString()
            val mobile = binding.etMobile.text.toString()

            when{
                firstName.isEmpty()->{
                    Toast.makeText(activity, "Enter Name.", Toast.LENGTH_SHORT).show()
                }
                mobile.isEmpty()->{
                    Toast.makeText(activity, "Enter Mobile Number.", Toast.LENGTH_SHORT).show()
                }
                else->
                {


                    findNavController()
                        .navigate(
                            EnterDetailsFragmentDirections.
                            actionEnterDetailsFragmentToVerifyDetailsFragment(firstName, mobile.toLong())
                        )
                }
            }


        }

        return binding.root
    }
}