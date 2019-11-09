package com.example.pkgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_game.image_view
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val isGoal = intent.getBooleanExtra("result", true)

        if (isGoal) {
            image_view.setImageResource(R.drawable.soccer_score_man)
            result_text.text = "ゴール！"
        } else {
            image_view.setImageResource(R.drawable.soccer_catch)
            result_text.text = "しかし止められた"
        }

        back_button.setOnClickListener {
            finish()
        }
    }
}
