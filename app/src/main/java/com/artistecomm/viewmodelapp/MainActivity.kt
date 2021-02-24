package com.artistecomm.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel = ViewModelProvider(this).get(ActivityViewModel::class.java)
        var textView: TextView = findViewById(R.id.numtextview)
        textView.setText(viewModel.getNumber())
        var btn: Button = findViewById(R.id.addBtn)
        btn.setOnClickListener {
            viewModel.addNum()
            textView.setText(viewModel.getNumber())
        }
    }
}