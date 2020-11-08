package com.example.Restaurantlivedata.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Restaurantlivedata.R
import com.example.Restaurantlivedata.model.Restaurant
import kotlinx.android.synthetic.main.row_layout.view.*

class ResAdpater(val reslist:List<Restaurant>):RecyclerView.Adapter<ResAdpater.resViewholder>(){


    class resViewholder(itemview:View):RecyclerView.ViewHolder(itemview){
        val resTv=itemview.findViewById<TextView>(R.id.resTextView)
        val resaddTv=itemview.findViewById<TextView>(R.id.resaddTextView)
        val respecialTv=itemview.findViewById<TextView>(R.id.respecialTextView)
        val resratingTv=itemview.findViewById<TextView>(R.id.ratingTextView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): resViewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return resViewholder(view)
    }

    override fun onBindViewHolder(holder: resViewholder, position: Int) {
        holder.itemView.apply {
            resTextView.text=reslist[position].resname
            resaddTextView.text=reslist[position].resaddress
            respecialTextView.text=reslist[position].respeciality
            ratingTextView.text=reslist[position].rating

        }
    }

    override fun getItemCount(): Int {
        return reslist.size
    }
}