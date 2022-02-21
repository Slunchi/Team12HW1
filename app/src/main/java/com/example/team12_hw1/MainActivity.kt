package com.example.team12_hw1

import adapter.ItemAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadFacts()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }

    fun start(view: View) {
        val welcome: LinearLayout = findViewById(R.id.welcome_mod)
        welcome.setVisibility(View.GONE)
    }
}