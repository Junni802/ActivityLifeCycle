package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitylifecycle.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
	val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.btn1.setOnClickListener { finish() }
	}
}