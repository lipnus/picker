package com.lipnus.android.numpicker.base


interface BaseView<T>{

    var presenter: T

    fun initLayout()

}