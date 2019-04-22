package com.lipnus.android.numpicker.ui


import com.lipnus.android.numpicker.ui.MainContract

class MainPresenter: MainContract.Presenter {

    private var view: MainContract.View


    constructor(view: MainContract.View){
        this.view = view
    }


    override fun start() {

    }


}