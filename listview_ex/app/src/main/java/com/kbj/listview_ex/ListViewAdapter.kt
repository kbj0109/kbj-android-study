package com.kbj.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter (val List: MutableList<ListViewModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView2 = convertView

        if(convertView2 == null) {
            convertView2 = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = convertView2!!.findViewById<TextView>(R.id.listViewItem)
        val content = convertView2!!.findViewById<TextView>(R.id.listViewItem2)
        title.text = List[position].title
        content.text = List[position].content

        // List[0] =>  ListViewModel("AA" , "AA 222"

        return convertView2!!
    }


}