package com.lipnus.android.numpicker.ui


import com.lipnus.android.numpicker.base.BasePresenter
import com.lipnus.android.numpicker.base.BaseView


interface MainContract{

    interface View: BaseView<Presenter> {

        fun initViewPager()

        fun setPageIndex(index: Int)

    }


    interface Presenter: BasePresenter {

        fun initDatabase()
        fun isDatabaseInited():Boolean

    }


}