package com.hades.uiuxtips

import android.os.Bundle
import android.view.View
import android.view.ViewStub
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_view_stub.*

/**
 * https://developer.android.com/training/improving-layouts/loading-ondemand#kotlin
 */

class ViewStubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_stub)

        val importPanel: View = findViewById<ViewStub>(R.id.simpleViewStub).inflate()

        showButton.setOnClickListener {
            importPanel.visibility = View.VISIBLE
        }

        hideButton.setOnClickListener {
            importPanel.visibility = View.GONE
        }
    }
}