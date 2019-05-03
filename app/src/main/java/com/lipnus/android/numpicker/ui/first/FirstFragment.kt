package com.lipnus.android.numpicker.ui.first


import android.content.Context
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseFragment
import com.rengwuxian.materialedittext.MaterialEditText


// TODO: Rename parameter arguments, choose names that match

private const val ARG_PARAM1 = "param1"


class FirstFragment : BaseFragment() {

    private lateinit var inputEt1: MaterialEditText
    private lateinit var inputEt2: MaterialEditText
    private lateinit var inputEt3: MaterialEditText


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


        //인풋 Edittext
        inputEt1 = view.findViewById(R.id.inputEt1)
        inputEt2 = view.findViewById(R.id.inputEt2)
        inputEt3 = view.findViewById(R.id.inputEt3)

        initEditTextListener()


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



    private fun initEditTextListener(){

        val et: Array<MaterialEditText> = arrayOf(
            inputEt1, inputEt2, inputEt3
        )

        for(i in 0..(et.size-1) ){
            et[i].addTextChangedListener(object: TextWatcher {

                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

//                    //변경내용을 db에 저장
//                    context?.database?.use{
//                        update("pickMessage", "content" to et[i].text )
//                            .whereSimple("id=?", i.toString())
//                            .exec()
//                    }
                }
            })
        }
    }


}
