package com.kbj.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add( ListViewModel("AA", "AA 2222"))
        list_item.add( ListViewModel("BB", "BB 2222"))
        list_item.add( ListViewModel("CC", "CC 2222"))


        val listview = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)

        listview.adapter = listAdapter
    }
}