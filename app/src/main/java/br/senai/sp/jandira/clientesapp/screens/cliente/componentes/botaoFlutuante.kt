package br.senai.sp.jandira.clientesapp.screens.cliente.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme

@Composable
fun botaoFlutuante(modifier: Modifier = Modifier) {
    FloatingActionButton(
        onClick = {}
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "botao"
        )
    }
}

@Composable
@Preview
private fun botaoFlutuantePreview(){
    ClientesAppTheme {
        botaoFlutuante()
    }
}