package com.github.florent37.expectanim.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.github.florent37.expectanim.animation

class ExpectAnimAlphaActivity : AppCompatActivity() {

    lateinit var image1: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expectanim_activity_alpha)

        image1 = findViewById(R.id.image_1)
        image1.setOnClickListener {
            Toast.makeText(baseContext, "click", Toast.LENGTH_SHORT).show()
        }

        findViewById(R.id.visible).setOnClickListener {
            animation {
                animate(image1) {
                    visible()
                }
            }.start()
        }

        findViewById(R.id.invisible).setOnClickListener {
            animation(duration = 1000L) {
                animate(image1) {
                    invisible()
                }
            }.start()
        }
    }
}