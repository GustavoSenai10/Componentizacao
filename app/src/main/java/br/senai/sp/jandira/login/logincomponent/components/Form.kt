package br.senai.sp.jandira.login.logincomponent.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.login.component.CaixaDeTexto

@Composable
fun Fom(){
    var emailState by remember {
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Card {
        Column (
            modifier = Modifier.padding(8.dp)
        ){
            CaixaDeTexto(
                label = "Seu email",
                valor = emailState,
                aoMudar = {
                    var x = 10
                    var y = 20

                    Log.i(
                        "Senia",
                        "a suma de ${x} e ${x}"
                    )
                    print(x+y)
                }
            )
            CaixaDeTexto(
                label = "Sua senha",
                valor = senhaState,
                aoMudar = {
                    var nome = "Gustavo"
                    var idade = 20

                    println("$nome tem $idade anos" )

                }
            )
        }
    }
}