package com.neccodes.stateapp

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnrememberedMutableState")
@Composable
fun MyUi() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var clickedNumber by remember { mutableIntStateOf(0) }

        if (clickedNumber > 0) {
            Text(
                text = "You clicked $clickedNumber times!",
                style = TextStyle(
                    fontSize = 25.sp
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                clickedNumber++
                Log.d("KaleLog", clickedNumber.toString())
            }
        ) {
            Text(
                text = "Click Me",
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun MyUiPreview() {
    MyUi()
}