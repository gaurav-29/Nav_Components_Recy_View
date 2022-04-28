package com.example.nav_components

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nav_components.databinding.RowAlbumBinding

class RecyclerViewAdapter(private var album: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ItemViewHolder(var viewBinding: RowAlbumBinding) : RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = RowAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemViewHolder = holder as ItemViewHolder
        itemViewHolder.viewBinding.nameTV.text = album[position]
    }

    override fun getItemCount(): Int {
        return album.size
    }
}