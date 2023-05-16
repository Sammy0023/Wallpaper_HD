package com.francis.wallpaperhd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.francis.wallpaperhd.databinding.ActivityTypesBinding

class TypesActivity : AppCompatActivity() {

    lateinit var binding: ActivityTypesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstButton.setOnClickListener {
            startActivity(Intent(this, CarsActivity::class.java))
        }

        binding.thirdButton.setOnClickListener {
            startActivity(Intent(this, FlowersActivity::class.java))
        }



    }
}