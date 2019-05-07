package com.lipnus.android.numpicker.ui.first


import android.content.Context
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdaptor: FirstRecyclerViewAdaptor



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view: View = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = view.findViewById(R.id.first_recyclerview)


        val message = arguments?.getString(EXTRA_MESSAGE)

        initRecyclerView()

//        textView.text = message

        return view
    }


    private fun initRecyclerView(){

        recyclerViewAdaptor = FirstRecyclerViewAdaptor()

        recyclerView.run{
            adapter = recyclerViewAdaptor
            layoutManager = LinearLayoutManager(context)
        }


        recyclerViewAdaptor.run{
            addItem(FirstItem(getText(R.string.setting_title_input).toString(), "첫번째"))
            addItem(FirstItem(getText(R.string.setting_title_getting).toString(), "두번째"))
            addItem(FirstItem(getText(R.string.setting_title_deny).toString(), "세번째"))
            recyclerViewAdaptor.notifyDataSetChanged()
        }

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
