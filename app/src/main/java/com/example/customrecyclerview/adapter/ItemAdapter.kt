package com.example.customrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclerview.R
import com.example.customrecyclerview.model.Affirmation

class ItemAdapter(
    private val context: Context?, 
    private val dataset: List<Affirmation>,
    private val layout : Int
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    } // 액티비티에 있을 때는 뷰바인딩을 사용하여 매개변수에 binding:listItemBinding을 넣어 findVIewById를 제거(불필요)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context?.resources!!.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }


    override fun getItemCount(): Int {
        return dataset.size
    }

}   