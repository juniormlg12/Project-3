package com.example.project_3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val images = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ImageView and Buttons
        imageView = findViewById(R.id.imageView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Set click listeners for each button
        button1.setOnClickListener { changeImage(0) }
        button2.setOnClickListener { changeImage(1) }
        button3.setOnClickListener { changeImage(2) }
    }

    // Function to change the image
    private fun changeImage(imageIndex: Int) {
        imageView.setImageResource(images[imageIndex])
    }
}
