package com.example.recyclerviews

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val names = listOf("Amina", "Brenda", "Carol", "Diana", "Esther", "Flo", "Gina",
            "Kelvin", "Lisa", "Mike", "Naomi", "Oscar", "Pearl", "Queen", "Robert","susan", "titus",
            "universe","valon", "wanja","xoza","yiamat","zash")

        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter =NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter= namesAdapter
    }
}