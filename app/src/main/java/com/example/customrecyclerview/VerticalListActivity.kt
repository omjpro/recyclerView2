package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customrecyclerview.adapter.ItemAdapter
import com.example.customrecyclerview.data.Datasource
import com.example.customrecyclerview.databinding.ActivityVerticalListBinding


class VerticalListActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityVerticalListBinding
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        

        val myDataset = Datasource().loadAffirmations()

        binding.vRecyclerView.adapter = ItemAdapter(
            applicationContext,
            myDataset
        )

        binding.vRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        
    }
}