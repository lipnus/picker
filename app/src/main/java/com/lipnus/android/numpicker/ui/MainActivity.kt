package com.lipnus.android.numpicker.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.util.Log
import com.lipnus.android.numpicker.R
import com.lipnus.android.skct.base.BaseActivity
import com.lipnus.android.skct.ui.MainPresenter
import com.lipnus.android.skct.ui.first.FirstFragment
import com.lipnus.android.skct.ui.second.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {


    private val firstFragment: FirstFragment by lazy { FirstFragment() }
    private val secondFragment: SecondFragment by lazy { SecondFragment() }


    private lateinit var mainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initLayout()

        test(3)
    }

    fun initLayout(){
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    fun<T> test (value : T?): Int{
        Log.d("SSS", "입력값: $value")
        return 0
    }




    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_first -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_second -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
