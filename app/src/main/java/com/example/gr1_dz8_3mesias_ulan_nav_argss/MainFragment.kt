package com.example.gr1_dz8_3mesias_ulan_nav_argss

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gr1_dz8_3mesias_ulan_nav_argss.databinding.FragmentMainBinding
import com.example.gr1_dz8_3mesias_ulan_nav_argss.databinding.ItemMarvelBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    private val marvel = arrayListOf<MarvelDataClass>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MustiteliAdapter(marvel, this:: onClck)
        binding.recycler.adapter = adapter

        loadData()

    }

    private fun loadData() {

        marvel.add(MarvelDataClass("Боевик","Бэтмен","https://sun9-33.userapi.com/54U1EbEPgFZFvst4wGREHouzqzUjmfqK8jL4zg/8JNdROK9WOg.jpg"))
        marvel.add(MarvelDataClass("Фантастика","Человек-паук","https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/c245354c-078c-429c-b35b-17ee2656405e/1920x"))
        marvel.add(MarvelDataClass("Фантастика","Железный человек","https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/aae8eee5-3c40-4c46-b325-ff1b1dfbfb70/1920x"))
        marvel.add(MarvelDataClass("Триллер","Форсаж","https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/31c2fcc0-5021-4426-841b-a5073c618d63/1920x"))
        marvel.add(MarvelDataClass("Ужас","Пила","https://avatars.mds.yandex.net/get-kinopoisk-image/1898899/e01b999e-7db5-4012-9938-aab99eaf9b22/1920x"))
        marvel.add(MarvelDataClass("Комедия","Затерянный город","https://avatars.mds.yandex.net/get-kinopoisk-image/4486454/8f6db90b-ffed-4a50-80a6-34025e652179/1920x"))
        marvel.add(MarvelDataClass("Фантастика","ТОР","https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/b715ff5a-c1fd-4923-b366-4ba2f90d5cf8/1920x"))
        this::onClck
    }


    private fun onClck(position: Int) {

        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToSecondFragment(marvel[position])
        )


    }

}
