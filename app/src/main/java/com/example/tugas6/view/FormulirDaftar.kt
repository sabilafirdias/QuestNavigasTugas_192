package com.example.tugas6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas6.R

@Composable
fun FormDaftar(onBeranda: () -> Unit, modifier: Modifier = Modifier) {

    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}
    var status by remember {mutableStateOf("")}

    var showDialog by remember { mutableStateOf(false) }

    val gender:List<String> = listOf("Laki-laki", "Perempuan")
    val kawin:List<String> = listOf("Single", "Taken", "HTS")

    Column (modifier = Modifier.padding(top = 30.dp, bottom = 15.dp)) {
        Text(
            modifier = Modifier.padding(top = 25.dp, start = 20.dp),
            text = "Formulir Pendaftaran",
            fontSize = 27.sp,
            color = colorResource(id = R.color.ungu3),
            fontFamily = FontFamily.Serif
        )
        ElevatedCard (
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize(),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.ungu1)
            )
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                text = "NAMA LENGKAP",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )
            OutlinedTextField(
                value = textNama,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp),
                label = { Text("Isian nama lengkap") },
                onValueChange = { textNama = it }
            )

        }
    }
}