package ru.kaspenium.mytabs

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val tableLayout = TableLayout(requireContext())
        tableLayout.layoutParams = TableLayout.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableLayout.LayoutParams.MATCH_PARENT
        )
        for (i in 0 until 5) {
            val tableRow = TableRow(requireContext())
            tableRow.layoutParams = TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )

            val button1 = Button(requireContext())
            button1.text = "Row $i, Col 1"
            button1.gravity = Gravity.CENTER
            val button2 = Button(requireContext())
            button2.text = "Row $i, Col 2"
            button2.gravity = Gravity.CENTER

            tableRow.addView(button1)
            tableRow.addView(button2)

            tableLayout.addView(tableRow)
        }

        view.findViewById<FrameLayout>(R.id.frameLayoutThird).addView(tableLayout)

        return view
    }
}