package com.ex2i.gardener

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentSucculent : Fragment(), OnItemClick {

    var springFlowerItem: MutableList<Recycler_Data> = mutableListOf()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getParcelableArrayList<Recycler_Data>("list")?.let {
            springFlowerItem = it
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(text: ArrayList<Recycler_Data>) = FragmentSucculent().apply {
            arguments = Bundle().apply {
                putParcelableArrayList("list", text)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_succulent, container, false)
        val context: Context = view.context

        val rv_succluent = view.findViewById<RecyclerView>(R.id.rv_succluent)
        val ekdbr_layout = view.findViewById<ConstraintLayout>(R.id.ekdbr_layout)
        val tjsdlswkd_layout = view.findViewById<ConstraintLayout>(R.id.tjsdlswkd_layout)

        ekdbr_layout.setOnClickListener {
            val intent = Intent(context, SucculentActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            intent.putExtra("succulent","다육식물")
            startActivity(intent)
        }

        tjsdlswkd_layout.setOnClickListener {
            val intent = Intent(context, SucculentActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            intent.putExtra("succulent","선인장")
            startActivity(intent)
        }


        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rv_succluent.adapter =
            SucculentAdapter(context, springFlowerItem, this)
        rv_succluent.layoutManager = layoutManager


        return view
    }

    override fun itemOnClick(name: String?, image: Int?, summary: String?) {
        val intent = Intent(context,WebviewActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        intent.putExtra("URL",summary)
        startActivity(intent)

    }

}