package com.google.firebase.quickstart.auth.multicolorthemes


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val blue_theme_btn : Button = findViewById(R.id.blue_theme_btn)
        val red_theme_btn : Button = findViewById(R.id.red_theme_btn)
        val default_theme : Button = findViewById(R.id.default_theme_btn)

        blue_theme_btn.setOnClickListener {

            Utility.setTheme(applicationContext,1)
            recreateActivity()
        }
        red_theme_btn.setOnClickListener {
            Utility.setTheme(applicationContext,2)
            recreateActivity()
        }
        default_theme.setOnClickListener {
            Utility.setTheme(applicationContext,3)
            recreateActivity()
        }

    }


   /* fun onClick(v: View) {
        when (v.getId()) {
            R.id.blue_theme_btn -> {
                Utility.setTheme(
                    applicationContext, 1
                )
                recreateActivity()
            }
            R.id.red_theme_btn -> {
                Utility.setTheme(
                    applicationContext, 2
                )
                recreateActivity()
            }
        }
    }*/

    fun recreateActivity() {
        val intent = intent
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        finish()
        overridePendingTransition(0, 0)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}