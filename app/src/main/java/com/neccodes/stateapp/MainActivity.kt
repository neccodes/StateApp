package com.neccodes.stateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
                var clickedNumber by rememberSaveable { mutableIntStateOf(0) }

                MyUi1(
                    clickedNumber = clickedNumber,
                    onUpdateClickedNumber = {
                        clickedNumber++
                    }
                )
                MyUi2(
                    clickedNumber = clickedNumber,
                    onUpdateClickedNumber = {
                        clickedNumber++
                    }
                )
            }
        }
    }
}
