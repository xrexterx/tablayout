package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity, private var totalCount: Int) : FragmentStateAdapter(fragmentActivity) {

	override fun getItemCount(): Int {
		return totalCount
	}

	override fun createFragment(position: Int): Fragment {
		return when (position) {
			0 -> FirstFragment()
			1 -> SecondFragment()
			else -> FirstFragment()
		}
	}
}