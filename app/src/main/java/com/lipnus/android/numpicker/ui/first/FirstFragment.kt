package com.lipnus.android.numpicker.ui.first


import android.content.Context
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseFragment


// TODO: Rename parameter arguments, choose names that match

private const val ARG_PARAM1 = "param1"


class FirstFragment : BaseFragment() {

    companion object {

        fun newInstance(param1: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(EXTRA_MESSAGE, param1)
                }
            }
    }


    private var param1: String? = null
    private var listener: OnFragmentInteractionListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view: View = inflater.inflate(R.layout.fragment_first, container, false)
        val message = arguments?.getString(EXTRA_MESSAGE)

//        var textView: TextView = view.findViewById(R.id.textView)
//
//
//        textView.text = message

        return view
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnFragmentInteractionListener){
            listener = context
        }
        else throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
    }


    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(msg: String)
    }
}
