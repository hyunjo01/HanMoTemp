package com.example.hanmopost

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MainListAdapter(val context: Context, val postList: ArrayList<Post>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.main_lv_item, null)

        val postThumbnail = view.findViewById<ImageView>(R.id.postThumbnailImg)
        val postTitle = view.findViewById<TextView>(R.id.postTitle)
        val postUserName = view.findViewById<TextView>(R.id.postUserName)
        val postTime = view.findViewById<TextView>(R.id.postTime)

        val post = postList[position]
        val resourceId = context.resources.getIdentifier(post.thumbnail, "drawable", context.packageName)
        postThumbnail.setImageResource(resourceId)
        postTitle.text = post.title
        postUserName.text = post.user
        postTime.text = post.postTime

        return view
    }

    override fun getItem(position: Int): Any {
        return postList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return postList.size
    }


}