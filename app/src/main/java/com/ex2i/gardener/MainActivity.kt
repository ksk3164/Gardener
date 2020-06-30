package com.ex2i.gardener

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private val firebase = FirebaseDatabase.getInstance().reference
    val realTimeArrayList: ArrayList<Recycler_Data> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("성국", R.drawable.test01.toString())
        Log.e("성국", R.drawable.test02.toString())
        Log.e("성국", R.drawable.test03.toString())
        Log.e("성국", R.drawable.test04.toString())
        Log.e("성국", R.drawable.test05.toString())

        navigationView.setOnNavigationItemSelectedListener(this)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, FragmentFlower())
            .commit()

        navigationView.selectedItemId = R.id.flowerItem

        firebase.child("list").addValueEventListener(object : ValueEventListener {

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                realTimeArrayList.clear() //없에버리고

                for (item in dataSnapshot.children) {
                    realTimeArrayList.add(item.getValue(Recycler_Data::class.java)!!)
                }

            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("성국", "loadPost:onCancelled", databaseError.toException())
            }
        })
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.flowerItem -> {
                val fragmentFlower = FragmentFlower()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, fragmentFlower).commit()
            }
            R.id.treeItem -> {
                val fragmentTree = FragmentHerb()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, fragmentTree).commit()
            }
            R.id.succulentItem -> {
                val fragmentSucculent = FragmentSucculent.newInstance(realTimeArrayList)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, fragmentSucculent).commit()
            }
        }
        return true
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }

}
