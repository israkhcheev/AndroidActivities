package ru.rakhcheev.task.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
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

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("A", "A ACTIVITY \tonNewIntent  - $this")
    }

    override fun onStart() {
        super.onStart()
        Log.d("A", "A ACTIVITY \tonStart  - $this")
    }

    override fun onResume() {
        super.onResume()
        Log.d("A", "A ACTIVITY \tonResume - $this")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("A", "A ACTIVITY \tonDestroy  - $this")
    }
}