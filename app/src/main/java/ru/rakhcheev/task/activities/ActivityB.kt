package ru.rakhcheev.task.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        findViewById<Button>(R.id.open_c_btn).setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("B", "B ACTIVITY \tonStart  - $this")
    }

    override fun onResume() {
        super.onResume()
        Log.d("B", "B ACTIVITY \tonResume - $this")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("B", "B ACTIVITY \tonDestroy  - $this")
    }
}