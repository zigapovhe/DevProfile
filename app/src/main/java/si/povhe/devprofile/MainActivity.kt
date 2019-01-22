package si.povhe.devprofile

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v7.app.AppCompatViewInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 15f
        //rounded.isCircular
        logo.setImageDrawable(rounded)

        statsView.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://ziga.povhe.si/"))
            startActivity(i)
        }

        imageView.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/zigapovhe/"))
            startActivity(i)
        }

        videoView.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCbekHCLRrgAFUR44NDxcL8Q"))
            startActivity(i)
        }

        codeView.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/zigapovhe"))
            startActivity(i)
        }


    }
}
