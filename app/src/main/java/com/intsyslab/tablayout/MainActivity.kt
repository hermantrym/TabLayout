package com.intsyslab.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.intsyslab.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment(), "First")
        adapter.addFragment(SecondFragment(), "Second")
        adapter.addFragment(ThridFragment(), "Third")

        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)
    }
}