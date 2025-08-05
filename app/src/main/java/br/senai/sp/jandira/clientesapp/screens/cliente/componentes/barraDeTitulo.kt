package br.senai.sp.jandira.clientesapp.screens.cliente.componentes

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.clientesapp.R
import br.senai.sp.jandira.clientesapp.ui.theme.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun barraDeTitulo (modifier: Modifier = Modifier) {
        TopAppBar(
            title = {
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column {
                        Text(text = "homi ai", style = MaterialTheme.typography.titleLarge)
                        Text(text = "homiAi@gmail.com", style = MaterialTheme.typography.titleSmall)
                    }
                    Card (
                        modifier = Modifier
                            .size(60.dp)
                            .padding(4.dp),
                        shape = CircleShape
                    ) {
                        Image(
                            painter = painterResource(R.drawable.retrato),
                            contentDescription = "retrato ai",
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        )
}

@Preview
@Composable
private fun barraDeTituloPreview(){
    barraDeTitulo()
}