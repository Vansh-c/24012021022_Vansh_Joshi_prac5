package com.example.a24012021022_prac5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormField(
    label:String,
    textState:String,
    onTextChange: (String) -> Unit,
    isPasswordField: Boolean = false,
    isNumber: Boolean = false
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = label,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        if(!isNumber){
            OutlinedTextField(
                value = textState,
                onValueChange = onTextChange,
                modifier = Modifier.padding(start = 16.dp).weight(2f),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                visualTransformation = (
                        if(isPasswordField)
                            PasswordVisualTransformation()
                        else
                            VisualTransformation.None
                        ),
                label = { Text("Enter $label") },
                placeholder = { Text("Enter $label") }
            )
        } else {
            NumericOutlinedTextField(
                label = label,
                value = textState,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(2f),
                onValueChange = onTextChange
            )
        }
    }
}

@Composable
fun NumericOutlinedTextField(
    label:String,
    value: String,
    modifier:Modifier,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = { newValue ->
            if(newValue.all {it.isDigit()}){
                onValueChange(newValue)
            }
        },
        modifier = modifier,
        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
        label = { Text("Enter $label") },
        placeholder = { Text("Enter $label") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = VisualTransformation.None
    )
}

@Composable
@Preview (showBackground = true)
fun FormFieldPreview(){
    FormField("Name","Vraj", onTextChange = {})
}