package com.example.kotlin_btk_10.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlin_btk_10.databinding.FragmentBesinListeBinding
import com.example.kotlin_btk_10.service.BesinAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class besinListeFragment : Fragment() {

    private var _binding: FragmentBesinListeBinding? = null
    private  val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBesinListeBinding.inflate(inflater, container, false)
        val view = binding.root


        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swipeRefreshLayout.setOnRefreshListener {

        }

        val retrofit = Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BesinAPI::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            val besinler = retrofit.getBesinler()
            besinler.forEach {
                println(it.isim)
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    }