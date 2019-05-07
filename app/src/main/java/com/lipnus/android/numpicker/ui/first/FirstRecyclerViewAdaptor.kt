package com.lipnus.android.numpicker.ui.first

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lipnus.android.numpicker.R
import com.rengwuxian.materialedittext.MaterialEditText

class FirstRecyclerViewAdaptor : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val items = ArrayList<FirstItem>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_first, parent, false)
        return CustomViewHoler(view)
    }


    class CustomViewHoler(view: View) : RecyclerView.ViewHolder(view) {

        var inputEt: MaterialEditText = view.findViewById(R.id.item_input_et)
        var titleTv: TextView = view.findViewById(R.id.item_title_tv)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var view = holder as CustomViewHoler

        view.inputEt.setText( items[position].text )
        view.titleTv.text = items[position].title
    }


    override fun getItemCount(): Int {
        return items.size
    }


    fun addItem(item: FirstItem){
        items.add(item)
    }
}
