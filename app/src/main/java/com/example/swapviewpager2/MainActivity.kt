package com.example.swapviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vpFirst=findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.viewPager)
        val images= listOf(
            R.drawable.tre,
            R.drawable.tryu,
            R.drawable.meme,
            R.drawable.shankar
        )
        val adapter=ItemViewPager(images)
        vpFirst.adapter=adapter
        vpFirst.orientation=ViewPager2.ORIENTATION_VERTICAL
        vpFirst.beginFakeDrag()
        vpFirst.fakeDragBy(-30f)
        vpFirst.endFakeDrag()


    }
}