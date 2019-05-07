package com.lipnus.android.numpicker.base


interface BaseView<T>{

    var presenter: T

    fun initLayout()

    fun getStringPref(key: String):String
    fun saveStringPref(key:String, value:String)

}