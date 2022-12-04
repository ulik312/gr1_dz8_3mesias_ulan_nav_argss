package com.example.gr1_dz8_3mesias_ulan_nav_argss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.gr1_dz8_3mesias_ulan_nav_argss.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)
            binding.tvName.text= navArgs.argmarval.name
            binding.tvLiga.text = navArgs.argmarval.liga
            Glide.with(binding.imgSecondFr).load(navArgs.argmarval.imach).into(binding.imgSecondFr)
        }
    }

}