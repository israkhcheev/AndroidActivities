package ru.rakhcheev.task.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        findViewById<Button>(R.id.open_b_btn).setOnClickListener {
            startActivity(Intent(this,ActivityB::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }
}