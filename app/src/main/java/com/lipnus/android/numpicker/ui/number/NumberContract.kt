package com.lipnus.android.numpicker.ui.number

import com.lipnus.android.numpicker.base.BasePresenter
import com.lipnus.android.numpicker.base.BaseView


interface NumberContract{

    interface View: BaseView<Presenter>{

        fun insertContact(number:String)

    }


    interface Presenter: BasePresenter{


    }
}