package com.example.calculatorintentweb

import android.app.Notification
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btn_CALL.setOnClickListener {
            val int = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254707227763"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(int)
            }
        }

        btn_Email.setOnClickListener {
            email("rehynsanders@gmail.com", "APPLICATION","Hello, I wish to apply for this job.")
        }
        btn_Share.setOnClickListener {
            share("Hello World!(from Kotlin)", "Some Information")
        }

        btn_STK.setOnClickListener {
            val simToolKitLaunchIntent = this@IntentActivity.packageManager.getLaunchIntentForPackage("com.android.stk")
            if (simToolKitLaunchIntent != null) {
                startActivity(simToolKitLaunchIntent)
            }
        }
        btn_camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }

        btn_SMS.setOnClickListener {
            sendSMS("+254707227763", "Hello, Buyabo")
        }

        btn_Dial.setOnClickListener {
            val phone = "+254707227763"
            val intent= Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phone, null))
        }
    }

}
