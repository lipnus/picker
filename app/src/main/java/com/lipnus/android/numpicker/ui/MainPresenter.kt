package com.lipnus.android.numpicker.ui

import android.util.Log
import com.lipnus.android.numpicker.R


class MainPresenter(private val mainView: MainContract.View): MainContract.Presenter{


    override fun start() {

        mainView.initLayout()
        mainView.initViewPager()

        initDatabase()
    }


    //최초실행 시 Database를 초기화한다.
    override fun initDatabase() {

        if( ! isDatabaseInited()){


        }
    }


    override fun isDatabaseInited():Boolean {

        if(mainView.getStringPref("DATABASE_INIT") == "empty"){
            mainView.saveStringPref("DATABASE_INIT", "inited")
            return false
        }
        return true
    }
}