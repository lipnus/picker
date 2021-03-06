package com.lipnus.android.numpicker.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseActivity
import com.lipnus.android.numpicker.ui.first.FirstFragment
import com.lipnus.android.numpicker.ui.first.SecondFragment
import com.lipnus.android.numpicker.ui.first.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity :
    BaseActivity(),
    MainContract.View,
    FirstFragment.OnFragmentInteractionListener{


    override lateinit var presenter: MainContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        presenter = MainPresenter(this)
        presenter.start()

    }


    override fun initLayout(){
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    override fun initViewPager() {

        val mainAdapter = MainPagerAdapter(supportFragmentManager)

        var firstFragment: FirstFragment = FirstFragment.newInstance("파라미터: 첫번재")
        var secondFragment: SecondFragment = SecondFragment.newInstance("파라미터: 두번째")
        var thirdFragment: ThirdFragment = ThirdFragment.newInstance("파라미터: 세번째")


        mainAdapter.run {
            addFragement(firstFragment,"첫번째")
            addFragement(secondFragment,"두번째")
            addFragement(thirdFragment,"세번째")
        }
        viewpager.adapter = mainAdapter

        viewpager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {
                navigation.menu.getItem(position).setChecked(true)
            }

        })

    }


    override fun setPageIndex(index: Int) {
        viewpager?.currentItem = index
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_first -> {
                setPageIndex(0)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_second -> {
                setPageIndex(1)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_third -> {
                setPageIndex(2)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    override fun onFragmentInteraction(msg: String) {

    }







}
