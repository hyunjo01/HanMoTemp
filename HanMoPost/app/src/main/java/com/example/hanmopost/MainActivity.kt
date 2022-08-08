package com.example.hanmopost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var postList = arrayListOf<Post>(
        Post("A", "Hello", "16:00", "thumbnail1") ,
        Post("B", "Hi ~~", "17:00", "thumbnail2")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postAdapter = MainListAdapter(this, postList)

        val postListView: ListView = findViewById(R.id.postListView)
        postListView.adapter = postAdapter

    }
}