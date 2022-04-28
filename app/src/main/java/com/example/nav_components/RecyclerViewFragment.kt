package com.example.nav_components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nav_components.databinding.FragmentRecyclerViewBinding

class RecyclerViewFragment : Fragment() {

    lateinit var binding : FragmentRecyclerViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        binding.albumRV.layoutManager = GridLayoutManager(activity,2)
        val data = ArrayList<String>()
        data.add("Michael")
        data.add("Jackson")
        data.add("Shakira")
        data.add("Nick")
        data.add("William")

        val adapter = RecyclerViewAdapter(data)
        binding.albumRV.adapter = adapter
        return binding.root

    }
}