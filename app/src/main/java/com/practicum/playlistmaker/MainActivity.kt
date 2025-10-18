package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListeners()
    }

    private fun setClickListeners() {
        findViewById<android.view.View>(R.id.searchButton).setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    val intent = Intent(this@MainActivity, SearchActivity::class.java)
                    startActivity(intent)
                }
            }
        )

        findViewById<android.view.View>(R.id.mediaLibraryButton).setOnClickListener {
            val intent = Intent(this@MainActivity, MediaLibraryActivity::class.java)
            startActivity(intent)
        }

        findViewById<android.view.View>(R.id.settingsButton).setOnClickListener {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}