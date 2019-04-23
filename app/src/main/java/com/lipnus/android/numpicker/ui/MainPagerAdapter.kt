package com.lipnus.android.numpicker.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter



class MainPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager){

    var fragments: ArrayList<Fragment> = ArrayList() //프레그먼트
    var fragmentNames: ArrayList<String> = ArrayList() //각 프레그먼트의 이름


    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }


    override fun getCount(): Int {
        return fragments.size
    }


    fun addFragement(fragment: Fragment,  title: String){
        fragments.add(fragment)
        fragmentNames.add(title)
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return super.getPageTitle(position)
    }

}