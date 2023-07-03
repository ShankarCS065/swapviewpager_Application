package com.example.swapviewpager2

import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ItemViewPager (
    val images:List<Int>
        ):RecyclerView.Adapter<ItemViewPager.ViewPagerViewHolder>()
{
        inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
                val view=LayoutInflater.from(parent.context).inflate(R.layout.itemviewpager,parent,false)

                return ViewPagerViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
                val curImage=images[position]
holder.itemView.findViewById<ImageView>(R.id.ivImage).setImageResource(curImage)
        }

        override fun getItemCount(): Int {
                return images.size
        }
}

