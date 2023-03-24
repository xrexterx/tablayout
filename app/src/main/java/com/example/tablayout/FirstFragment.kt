package com.example.tablayout

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.databinding.FirstFragmentBinding

class FirstFragment: Fragment() {
	private lateinit var binding: FirstFragmentBinding

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
		binding = FirstFragmentBinding.inflate(layoutInflater)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		setupData()
	}

	private fun setupData() {
		Log.d("setup", "yes")
//		binding.f1TvMain.text = "first fragment"
	}
}