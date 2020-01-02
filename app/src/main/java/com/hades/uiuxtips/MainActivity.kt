package com.hades.uiuxtips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnActTransition.setOnClickListener {
            startActivity(Intent(this, OverviewActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        btnRipple.setOnClickListener {
            startActivity(Intent(this, RippleActivity::class.java))
        }

        btnThemedView.setOnClickListener {
            startActivity(Intent(this, ThemedViewActivity::class.java))
        }

        btnElevation.setOnClickListener {
            startActivity(Intent(this, ShadowActivity::class.java))
        }

        btnInclude.setOnClickListener {
            startActivity(Intent(this, IncludeActivity::class.java))
        }

        btnMerge.setOnClickListener {
            startActivity(Intent(this, MergeActivity::class.java))
        }

        btnViewStub.setOnClickListener {
            startActivity(Intent(this, ViewStubActivity::class.java))
        }

        btnTextSize.setOnClickListener {
            startActivity(Intent(this, TextSizeActivity::class.java))
        }


    }
}
