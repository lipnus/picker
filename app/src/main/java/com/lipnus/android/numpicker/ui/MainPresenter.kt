package com.lipnus.android.numpicker.ui


class MainPresenter(private val mainView: MainContract.View): MainContract.Presenter{


    override fun start() {

        mainView.initLayout()
        mainView.initViewPager()
    }
}