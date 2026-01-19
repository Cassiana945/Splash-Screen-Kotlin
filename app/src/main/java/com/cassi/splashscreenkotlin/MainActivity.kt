package com.cassi.splashscreenkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()    // Splash Screen
        setContentView(R.layout.activity_main)

        // Intent Explicito

        val explicityButton = findViewById<Button>(R.id.explicitButton)

        explicityButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }

        // Intent Implícito

        val url = "https://pudim.com.br/"
        val implicityButton = findViewById<Button>(R.id.implicitButton)

        implicityButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
        }
    }
}