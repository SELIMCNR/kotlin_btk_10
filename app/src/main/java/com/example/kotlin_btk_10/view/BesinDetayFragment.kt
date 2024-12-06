package com.example.kotlin_btk_10.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlin_btk_10.databinding.FragmentBesinDetayBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BesinDetayFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BesinDetayFragment : Fragment() {

    private var _binding: FragmentBesinDetayBinding? = null
    private  val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBesinDetayBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}