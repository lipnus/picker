package com.lipnus.android.numpicker.ui.first

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseFragment
import com.lipnus.android.numpicker.ui.number.NumberActivity


// TODO: Rename parameter arguments, choose names that match

private const val ARG_PARAM1 = "param1"


class SecondFragment : BaseFragment() {


    companion object {

        fun newInstance(param1: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(EXTRA_MESSAGE, param1)
                }
            }
    }




    private var param1: String? = null
    private lateinit var button: Button


    interface OnFrgmentInteraction {
        // TODO: Update argument type and name
        fun onIntent(msg: String)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_second, container, false)
        val message = arguments?.getString(EXTRA_MESSAGE)

        var textView: TextView = view.findViewById(R.id.second_title_tv)

        button = view.findViewById(R.id.second_btn)

        button.setOnClickListener {
            activity?.let{
                val iT = Intent(context, NumberActivity::class.java)
                startActivity(iT)
            }
        }

        return view
    }




}
