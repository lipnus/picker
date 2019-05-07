package com.lipnus.android.numpicker.ui.number

class NumberPresenter(private var numberView: NumberContract.View): NumberContract.Presenter{

    override fun start() {
        numberView.initLayout()
    }

}