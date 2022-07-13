package com.gerald.pages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        //setting a back button

        val actionBar : ActionBar? =supportActionBar
        // it can be null
        actionBar?.setDisplayHomeAsUpEnabled(true)

    }
}