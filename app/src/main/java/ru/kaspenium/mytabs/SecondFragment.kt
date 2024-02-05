package ru.kaspenium.mytabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val listView = view.findViewById<ListView>(R.id.listView)
        val array = arrayOf("Банан", "Слива", "Куркума", "Владик")
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.activitu_list, R.id.label, array)
        listView.adapter = arrayAdapter
        return view
    }


}