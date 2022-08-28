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

        findViewById<Button>(R.id.send_mail_btn).setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
                .setType("message/rfc822")
                .putExtra(Intent.EXTRA_EMAIL, arrayOf("android@otus.ru", "i.s.rakhcheev@gmail.com"))
                .putExtra(Intent.EXTRA_SUBJECT, "Greeting")
                .putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello everyone here, I'm trying to send you an email from my Android app"
                )
            startActivity(Intent.createChooser(intent, "Send email using..."))
        }
    }
}