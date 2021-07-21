package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import timber.log.Timber

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        Timber.d("onCreate")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume")

    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause")

    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy")

    }
}