package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setupViewPager()
		setupTabLayout()

	}

	private fun setupTabLayout() {
		TabLayoutMediator(
			binding.tabLayout, binding.viewPager
		) { tab, position -> tab.text = "Tab " + (position + 1) }.attach()
	}

	private fun setupViewPager() {
		val adapter = ViewPagerAdapter(this, 2)
		binding.viewPager.adapter = adapter
	}

	override fun onBackPressed() {
		val viewPager = binding.viewPager
		if (viewPager.currentItem == 0) {
			super.onBackPressed()
		} else {
			viewPager.currentItem = viewPager.currentItem - 1
		}

	}
}