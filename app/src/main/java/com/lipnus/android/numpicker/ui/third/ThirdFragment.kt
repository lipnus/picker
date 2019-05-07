package com.lipnus.android.numpicker.ui.first


import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseFragment

private const val ARG_PARAM1 = "param1"


class ThirdFragment : BaseFragment() {

    private lateinit var button: Button
    private lateinit var button2: Button

    companion object {

        fun newInstance(param1: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(EXTRA_MESSAGE, param1)
                }
            }
    }


    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        var view: View? = inflater.inflate(R.layout.fragment_third, container, false)
        val message = arguments?.getString(EXTRA_MESSAGE)

        Log.d("SSS", message)

        var textView: TextView = view!!.findViewById(R.id.second_title_tv)
        textView.text = message

        button = view.findViewById(R.id.button)
        button2 = view.findViewById(R.id.button2)




        button.setOnClickListener {




        }


        button2.setOnClickListener{



        }
        return view
    }

}
