package com.abreuarthur.androidtemplate.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.abreuarthur.androidtemplate.R
import com.abreuarthur.androidtemplate.databinding.ActivityMainBinding
import com.abreuarthur.androidtemplate.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        )
        binding.viewModel = viewModel
    }
}
