package com.unsoed.responis1mobileh1d023037

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unsoed.responis1mobileh1d023037.databinding.ActivityHistoryBinding
class HistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}