package com.swetajain.androidwithflutter

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flutterButton: Button = findViewById(R.id.flutterButton)
        flutterButton.setOnClickListener {
            goToFlutter(it)
        }

    }

    fun goToFlutter(view: View) {
        startActivity(
            FlutterActivity
                .withCachedEngine(
                    "my_flutter"
                )
                .build(this)
        )
    }
}