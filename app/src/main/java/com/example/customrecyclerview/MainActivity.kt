package com.example.customrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclerview.adapter.ItemAdapter
import com.example.customrecyclerview.data.Datasource
import com.example.customrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityMainBinding
    private lateinit var listIntent : Intent
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btnGrid.setOnClickListener { launchgrid() }
        
        binding.btnHorizontal.setOnClickListener { launchHorizontal() }

        binding.btnVertical.setOnClickListener { launchVertical() }


//        val myDataset = Datasource().loadAffirmations()
//        val recyclerView = findViewById<RecyclerView>(R.id.h_recyclerView)
//        recyclerView.adapter = ItemAdapter(this, myDataset)
//        recyclerView.setHasFixedSize(true)
        
    }
    
    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }
    
    private fun launchHorizontal() {
        listIntent = Intent(this, HorizontalListActivity::class.java)
        startActivity(listIntent)
    }
    
    private fun launchgrid() {
        listIntent = Intent(this, GridListActivity::class.java)
    }
}