package com.alex.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alex.app.algorithm.Balance
import com.alex.app.algorithm.DiagonalDifference
import com.alex.app.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnBalance.setOnClickListener {
            val input = binding.etInput.text.trim().toString()
            val outcome = Balance.isBalanced(input)
            binding.tvOutput.text = outcome
        }

        KTest.test()

    }
}