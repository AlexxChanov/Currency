package com.example.currency.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currency.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openFragment()
    }

    private fun openFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, NavigationFragment())
            .commit()
    }
}
