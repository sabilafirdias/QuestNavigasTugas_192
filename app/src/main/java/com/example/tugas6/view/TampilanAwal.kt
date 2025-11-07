package com.example.tugas6.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas6.R

@Composable
fun HalamanDepan(onNavigate: () -> Unit, modifier: Modifier = Modifier) {
    Column (modifier = Modifier.padding(top = 25.dp, bottom = 25.dp)) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(color = colorResource(id = R.color.ungu2)),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text("Selamat Datang", fontSize = 22.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)

                Image(
                    painter = painterResource(id = R.drawable.logoo),
                    contentDescription = "Logo Aplikasi",
                    modifier = Modifier
                        .width(350.dp)
                        .height(350.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))

                Text("Sabila Firdiastuti Maulani S.", fontSize = 13.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.SemiBold)
                Text("20230140192", fontSize = 13.sp, fontFamily = FontFamily.Monospace)

                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = onNavigate,
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.ungu1))
                ) {
                    Text("Masuk", color = Color.Black, fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif)

                }
            }
        }
    }
}
