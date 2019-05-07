package com.lipnus.android.numpicker.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.util.PreferenceHelper


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    //프레퍼런스에서 불러오기
    open fun getStringPref(key: String):String {
        return PreferenceHelper.customPrefs(applicationContext, getString(R.string.PREF)).getString(key, "empty")
    }

    //프레퍼런스에 저장
    open fun saveStringPref(key:String, value:String) {
        PreferenceHelper.customPrefs(applicationContext, getString(R.string.PREF)).edit().putString(key, value).apply()
    }

}
