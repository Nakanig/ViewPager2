package com.example.viewpager2t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Messages", "Calls", "Photos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pager = findViewById<ViewPager2>(R.id.ViewPager2T)
        var t1 = findViewById<TabLayout>(R.id.tabLay)
        pager.adapter = MyAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(t1, pager) {
            tab, position ->
                tab.text = tabTitle[position]
        }.attach()


    }
}