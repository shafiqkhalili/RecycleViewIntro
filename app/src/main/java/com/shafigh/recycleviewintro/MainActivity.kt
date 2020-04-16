package com.shafigh.recycleviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = listOf<Person>(Person("Emil",24), Person("Sofia",25),Person("test",55))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonRecycleAdapter(context = this, persons = persons)

        recyclerView.adapter = adapter
    }
}
