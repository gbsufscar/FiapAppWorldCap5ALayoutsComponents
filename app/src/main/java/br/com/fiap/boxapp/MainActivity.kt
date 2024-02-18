package br.com.fiap.boxapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.boxapp.ui.theme.BoxAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Componentes de Layouts
                    ColumnRowScreen()

                }
            }
        }
    }
}

@Composable
fun BoxScreen() {
    Box(
        contentAlignment = Alignment.TopEnd
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.TopStart)
            ) {
            Text(text = "Clique aqui")
        }
        Text(
            text = "FIAP",
            modifier = Modifier.align(Alignment.TopStart)
            )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = 20.dp, y = 10.dp)
        ) {
            Text(text = "Outro Botão")

        }
    }
}


@Composable
fun ColumnRowScreen() {
    // Column principal
    Column(
        modifier = Modifier
            .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(300.dp)
        ) {
            // Aqui vai o conteúdo da coluna
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 01")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 02")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 03")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 03")
            }
        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Green)
            ) {
                // Aqui vai o conteúdo
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background((Color.Yellow))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(8.dp)
                        .background(Color.Red)
                        .weight(0.7f)
                ) {
                    // Aqui vai o conteúdo
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(8.dp)
                        .background(Color.Blue)
                        .weight(0.7f)
                ) {
                    // Aqui vai o conteúdo
                }

            }
        }
    }




/*
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxScreenPreview() {
    BoxScreen()
    }
*/