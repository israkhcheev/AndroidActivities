package ru.rakhcheev.task.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.open_a_btn).setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }

        findViewById<Button>(R.id.open_d_btn).setOnClickListener {
            startActivity(Intent(this, ActivityD::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK))
            finishAffinity()
        }

        findViewById<Button>(R.id.close_c_btn).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.close_stack).setOnClickListener {
            finishAffinity()
        }
    }
}