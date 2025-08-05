package br.senai.sp.jandira.clientesapp.screens.cliente

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.clientesapp.screens.cliente.componentes.barraDeTitulo
import br.senai.sp.jandira.clientesapp.screens.cliente.componentes.barraInferior
import br.senai.sp.jandira.clientesapp.screens.cliente.componentes.botaoFlutuante
import br.senai.sp.jandira.clientesapp.screens.cliente.componentes.conteudo
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme

@Composable
fun listaCLienteSceen (modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            barraDeTitulo()
        },
        bottomBar = {
            barraInferior()
        },
        floatingActionButton = {
            botaoFlutuante()
        },
        content = {padding ->
            conteudo(padding)
        }
    )
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun listaClientePreview(){
    ClientesAppTheme {
        listaCLienteSceen()
    }
}