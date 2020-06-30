package com.ex2i.gardener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.iv_flower
import kotlinx.android.synthetic.main.activity_detail.tv_name
import kotlinx.android.synthetic.main.activity_detail.tv_summary
import kotlinx.android.synthetic.main.activity_detail_herb.*

class DetailActivityHerb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_herb)

        tv_name.text = intent.getStringExtra("name")
        iv_flower.setImageResource(intent.getIntExtra("image",0))
        tv_summary.text = intent.getStringExtra("summary")
        tv_effecacy.text = intent.getStringExtra("effecacy")
        tv_purpose.text = intent.getStringExtra("purpose")

    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0,0)
    }

}