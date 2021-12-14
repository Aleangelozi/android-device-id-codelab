package com.aleangelozi.androiddeviceidcodelab

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.id)
        text.text = getDeviceId(this)
    }

    private fun getDeviceId(context: Context) : String? {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)

    }
}