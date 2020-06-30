package com.ex2i.gardener

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.android.synthetic.main.list_succlent.view.*

class SucculentAdapter (
    private var context: Context,
    private var items: List<Recycler_Data>,
    mCallback: OnItemClick

) :
    RecyclerView.Adapter<SucculentAdapter.MainViewHolder>() {

    private var mCallback: OnItemClick? = mCallback

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        items[position].let { item ->
            with(holder) {

                tvItem.text = item.name
                ivImage.setImageResource(item.image)

                ivImage.setOnClickListener {
                    mCallback?.itemOnClick(item.name, item.image, item.summary)
                }

            }
        }


    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_succlent, parent, false)
    ) {

        val ivImage: ImageView = itemView.iv_image
        val tvItem: TextView = itemView.tv_item

    }

}