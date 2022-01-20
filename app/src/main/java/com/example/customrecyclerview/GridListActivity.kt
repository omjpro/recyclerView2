package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customrecyclerview.adapter.ItemAdapter
import com.example.customrecyclerview.data.Datasource
import com.example.customrecyclerview.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityGridListBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityGridListBinding.inflate(layoutInflater)        
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        binding.gRecyclerView.adapter = ItemAdapter(
            applicationContext,
            myDataset
        )
        
        binding.gRecyclerView.setHasFixedSize(true)
        
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        
    }
}