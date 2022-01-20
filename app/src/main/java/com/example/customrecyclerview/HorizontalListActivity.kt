package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customrecyclerview.adapter.ItemAdapter
import com.example.customrecyclerview.data.Datasource
import com.example.customrecyclerview.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    
    private lateinit var binding:ActivityHorizontalListBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        binding.hRecyclerView.adapter = ItemAdapter(
            applicationContext,
            myDataset
        )

        binding.hRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        
    }
}