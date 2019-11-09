package com.example.pkgame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    val buttonArray: Array<Button> by lazy {
        arrayOf(top_right_button, top_left_button, bottom_right_button, bottom_left_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        for ((index, button) in buttonArray.withIndex()) {
            button.setTag(index)
            button.setOnClickListener {
                val random = Random.nextInt(0,4)
                val result =  (random == button.tag)
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("result", result)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }
        }
    }
}
