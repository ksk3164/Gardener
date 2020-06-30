package com.ex2i.gardener

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.list_herb.view.*

class Adapter3(
    private var context: Context,
    private var items: List<Recycler_Data2>,
    mCallback: OnHerbItemClick
) :
    RecyclerView.Adapter<Adapter3.MainViewHolder>() {

    private var mCallback: OnHerbItemClick? = mCallback

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        items[position].let { item ->
            with(holder) {

                tvTitle.text = item.name
                tvTaste.text = item.summary
                tvEffecacy.text = item.effecacy
                tvPurpose.text = item.purpose

                tvPurpose.isSelected = true
                tvEffecacy.isSelected = true
                tvTaste.isSelected = true


                Glide.with(holder.itemView.context)
                    .load(item.image)
                    .override(800,800)
                    .into(holder.ivHerb)
//                ivFlower.setImageResource(item.image)

                holder.itemView.setOnClickListener {
                    mCallback?.itemOnClick(item.name, item.image, item.summary, item.effecacy, item.purpose)
                }

            }
        }

    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_herb, parent, false)
    ) {

        val tvTitle: TextView = itemView.tv_title
        val ivHerb: ImageView = itemView.iv_herb
        val tvEffecacy: TextView = itemView.tv_effecacy
        val tvTaste: TextView = itemView.tv_taste
        val tvPurpose: TextView = itemView.tv_purpose

    }

}