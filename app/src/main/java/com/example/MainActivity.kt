package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.ui.TvViewModel
import com.example.ui.screens.MainTvScreen
import com.example.ui.theme.CostaRicaTvTheme

class MainActivity : ComponentActivity() {

    private val tvViewModel: TvViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CostaRicaTvTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainTvScreen(viewModel = tvViewModel)
                }
            }
        }
    }
}
