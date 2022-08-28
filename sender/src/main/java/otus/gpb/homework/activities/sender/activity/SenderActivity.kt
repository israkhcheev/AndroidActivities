package otus.gpb.homework.activities.sender.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.sender.R

class SenderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sender_activity_layout)

        findViewById<Button>(R.id.google_map_btn).setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.ru/maps/search/Рестораны/")
            )
            startActivity(intent)
        }
    }
}