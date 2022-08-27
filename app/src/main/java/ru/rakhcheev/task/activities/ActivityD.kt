package ru.rakhcheev.task.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    override fun onStart() {
        super.onStart()
        Log.d("D", "D ACTIVITY \tonStart  - $this")
    }

    override fun onResume() {
        super.onResume()
        Log.d("D", "D ACTIVITY \tonResume - $this")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("D", "D ACTIVITY \tonDestroy  - $this")
    }
}