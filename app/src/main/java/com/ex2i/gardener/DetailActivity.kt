package com.ex2i.gardener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tv_name.text = intent.getStringExtra("name")
        iv_flower.setImageResource(intent.getIntExtra("image",0))
        tv_summary.text = intent.getStringExtra("summary")

    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0,0)
    }

}