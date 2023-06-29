@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bora_rachar()
            }
        }
    }
@SuppressLint("UnrememberedMutableState")
@Composable
fun Bora_rachar() {
    var NumeroDePessoas = remember { mutableStateOf(0)}
    var Dinheiro = remember { mutableStateOf(0)}
    var resultado = remember { mutableStateOf(0)}

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Quantidade de Pessoas:")
        TextField(
            value = NumeroDePessoas.value.toString(),
            onValueChange = {
                NumeroDePessoas.value = it.toIntOrNull() ?: 1
            },
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text("Valor do Dinheiro:")
        TextField(
            value = Dinheiro.value.toString(),
            onValueChange = {
                Dinheiro.value = it.toIntOrNull() ?: 1
            },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text("O valor dividido para cada será:")
        TextField(
            value = resultado.value.toString(),
            onValueChange = {
                resultado.value = it.toIntOrNull() ?: 1
            },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (NumeroDePessoas.value > 0 && Dinheiro.value > 0){
            var pessoa = NumeroDePessoas.value
            var dindin = Dinheiro.value
            resultado.value = pessoa / dindin
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Bora_rachar()
}




