package com.hades.uiuxtips

import android.animation.LayoutTransition
import android.os.Bundle
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_overview.*


class OverviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)

        val text1 = "This girl is..."
        val text2 = "This girl is BEAUTIFUL"

        /**
         * Solution 1
         * - android:animateLayoutChanges="true" in rootView
         * - enableTransition
         */
        llRoot.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)

        tvGirl.setOnClickListener {
            tvGirl.text = if (tvGirl.text == text1) text2 else text1
        }

        /**
         * Solution 2
         */
//        tvGirl.setOnClickListener {
//            TransitionManager.beginDelayedTransition(llRoot)
//            tvGirl.text = if (tvGirl.text == text1) text2 else text1
//        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}
