package br.senai.sp.jandira.login.logincomponent.components.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.login.logincomponent.components.Fom
import br.senai.sp.jandira.login.logincomponent.components.header


@Composable

fun LoginScreen(){
    Column {

        header()
        Fom()
    }

}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()

}