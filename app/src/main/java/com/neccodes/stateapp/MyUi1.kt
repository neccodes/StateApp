package com.neccodes.stateapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyUi1(
    clickedNumber: Int,
    onUpdateClickedNumber: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (clickedNumber > 0) {
            Text(
                text = "You clicked $clickedNumber times!",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color.Blue
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                onUpdateClickedNumber()
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