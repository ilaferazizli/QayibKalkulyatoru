package com.schooltools.qaybkalkulyatoru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.schooltools.qaybkalkulyatoru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
}