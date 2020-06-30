package com.ex2i.gardener

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.bitmap.TransformationUtils.circleCrop
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter(
    private var context: Context,
    private var items: List<Recycler_Data>,
    mCallback: OnItemClick
) :
    RecyclerView.Adapter<Adapter.MainViewHolder>() {

    private var mCallback: OnItemClick? = mCallback

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        items[position].let { item ->
            with(holder) {

                tvName.text = item.name
                tvSummary.text = item.summary

                tvSummary.isSelected = true


                Glide.with(holder.itemView.context)
                    .load(item.image)
                    .apply(RequestOptions().circleCrop())
                    .into(holder.ivFlower)
//                ivFlower.setImageResource(item.image)

                holder.itemView.setOnClickListener {
                    mCallback?.itemOnClick(item.name, item.image,item.summary)
                }

            }
        }

    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
    ) {

        val tvName: TextView = itemView.tv_name
        val ivFlower: ImageView = itemView.iv_flower
        val tvSummary: TextView = itemView.tv_summary
        val ivDetail: ImageView = itemView.iv_detail

    }

}