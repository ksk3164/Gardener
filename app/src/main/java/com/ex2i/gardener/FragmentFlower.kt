package com.ex2i.gardener

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_flower.*


class FragmentFlower : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_flower, container, false)
        val context: Context = view.context

        val spring_layout = view.findViewById<ConstraintLayout>(R.id.spring_layout)
        val summer_layout = view.findViewById<ConstraintLayout>(R.id.summer_layout)
        val fall_layout = view.findViewById<ConstraintLayout>(R.id.fall_layout)
        val winter_layout = view.findViewById<ConstraintLayout>(R.id.winter_layout)
        val iv_birth = view.findViewById<TextView>(R.id.iv_birth)


        iv_birth.setOnClickListener {
            val intent = Intent(context, WebviewActivity::class.java)
            intent.putExtra("URL", "http://m.depanse.co.kr/article/%EB%B3%B4%EB%8F%84%EC%9E%90%EB%A3%8C/7/3307/#2")
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        spring_layout.setOnClickListener {
            val intent = Intent(context, FlowerActivity::class.java)
            intent.putExtra("season", "spring")
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        summer_layout.setOnClickListener {
            val intent = Intent(context, FlowerActivity::class.java)
            intent.putExtra("season", "summer")
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        fall_layout.setOnClickListener {
            val intent = Intent(context, FlowerActivity::class.java)
            intent.putExtra("season", "fall")
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        winter_layout.setOnClickListener {
            val intent = Intent(context, FlowerActivity::class.java)
            intent.putExtra("season", "winter")
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        return view
    }
}