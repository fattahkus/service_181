package com.example.task_today

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title="Service_181"

        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.tyga)


        btn_play.setOnClickListener{
            mediaPlayer?.start()
        }

        btn_pause.setOnClickListener{
            mediaPlayer?.pause()
        }

        btn_stop.setOnClickListener{
            mediaPlayer?.pause()
            mediaPlayer?.seekTo(0)
        }


        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/irfan.fattah.14"))
            startActivity(i)
        })

        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/fattahk.us"))
            startActivity(i)
        })

        btn_twt.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/FattahKusuma3"))
            startActivity(i)
        })



    }
}
