package com.artistecomm.viewmodelapp

import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {

    var num =0
    public fun addNum()
    {
        num++;
    }
    fun getNumber():String{
        return num.toString()
    }
}