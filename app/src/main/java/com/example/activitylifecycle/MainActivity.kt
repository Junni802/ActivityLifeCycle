package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		
		Log.d("lifeCycleText", "onCreate()함수 실행")
		binding.txtCreate.text = "onCreate() 함수 실행"

		val intent = Intent(this, SubActivity::class.java)

		binding.subBtn.setOnClickListener {	startActivity(intent) }

		binding.mainBtn.setOnClickListener { finish() }
	}

	override fun onStart(){
		super.onStart()
		Log.d("lifeCycleText", "onStart()함수 실행")
		binding.txtStart.text = "onStart() 함수 실행"
	}

	override fun onResume(){
		super.onResume()
		Log.d("lifeCycleText", "onResume()함수 실행")
		binding.txtResume.text = "onResume() 함수 실행"
	}

	override fun onPause(){
		super.onPause()
		Log.d("lifeCycleText", "onPause()함수 실행")
		binding.txtPause.text = "onPause() 함수 실행"
	}

	override fun onStop(){
		super.onStop()
		Log.d("lifeCycleText", "onStop()함수 실행")
		binding.txtStop.text = "onStop() 함수 실행"
	}

	override fun onDestroy(){
		super.onDestroy()
		Log.d("lifeCycleText", "onDestroy()함수 실행")
		binding.txtDestroy.text = "onDestroy() 함수 실행"
	}
}