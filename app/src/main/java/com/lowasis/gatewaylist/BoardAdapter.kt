package com.lowasis.gatewaylist

import android.graphics.Color
import android.graphics.ColorSpace.Rgb
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lowasis.gatewaylist.databinding.ItemRecyclerViewBinding

data class BoardItem(val name: String, val favor: Boolean, val state: Boolean)

class BoardAdapter(private val itemList: ArrayList<BoardItem>) :
    RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val binding =
            ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BoardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class BoardViewHolder(private val binding: ItemRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: BoardItem) {
            binding.root.setBackgroundColor(if (data.favor) Color.argb(0x80, 0xaa, 0xda, 0xfe) else Color.argb(0x20, 0xff, 0xff, 0xff))
            //binding.tvName.setBackgroundColor(if (data.favor) Color.rgb(0xaa, 0xda, 0xfe) else Color.WHITE)
            binding.tvName.setTextColor(if (data.state) Color.RED else Color.WHITE)
            binding.tvName.text = data.name
        }
    }
}