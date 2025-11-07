package com.example.tugas6.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas6.R


@Composable
fun ListPeserta(onBeranda: () -> Unit, onForm: () -> Unit,  modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(top = 50.dp, bottom = 25.dp)) {
        Text(
            modifier = Modifier.padding(top = 25.dp, start = 20.dp),
            text = "List Daftar Peserta",
            fontSize = 27.sp,
            color = colorResource(id = R.color.ungu3),
            fontFamily = FontFamily.Serif
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
                .border(
                    width = 2.dp,
                    color = colorResource(id = R.color.ungu3),
                    shape = RoundedCornerShape(16.dp)
                ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )) {
            Row {
                Column (modifier = Modifier.padding(20.dp)){
                    Text("NAMA LENGKAP", fontWeight = FontWeight.Bold)
                    Text("Toto Sucipto")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("STATUS KAWIN", fontWeight = FontWeight.Bold)
                    Text("Single")
                }

                Spacer(modifier = Modifier.width(2.dp))

                Column (modifier = Modifier.padding(20.dp)){
                    Text("JENIS KELAMIN", fontWeight = FontWeight.Bold)
                    Text("Laki-laki")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("ALAMAT", fontWeight = FontWeight.Bold)
                    Text("Kubu Raya")
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
                .border(
                    width = 2.dp,
                    color = colorResource(id = R.color.ungu3),
                    shape = RoundedCornerShape(16.dp)
                ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )) {
            Row {
                Column (modifier = Modifier.padding(20.dp)){
                    Text("NAMA LENGKAP", fontWeight = FontWeight.Bold)
                    Text("Doremi Sola")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("STATUS KAWIN", fontWeight = FontWeight.Bold)
                    Text("Taken")
                }

                Spacer(modifier = Modifier.width(2.dp))

                Column (modifier = Modifier.padding(20.dp)){
                    Text("JENIS KELAMIN", fontWeight = FontWeight.Bold)
                    Text("Perempuan")

                    Spacer(modifier = Modifier.height(30.dp))

                    Text("ALAMAT", fontWeight = FontWeight.Bold)
                    Text("Bantul")
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = onBeranda, colors = ButtonDefaults.buttonColors(colorResource(id = R.color.ungu1))) {
                Text("Beranda", color = Color.Black, fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif)
            }
        }
    }
}