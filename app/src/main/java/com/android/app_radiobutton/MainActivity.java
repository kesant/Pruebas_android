package com.android.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;//declaramos las dos entradas de texto que son de tipo edit text
    private TextView tv1;//declaramos el cuadro de tipo text view
    private RadioButton rb1,rb2;//declaramos los botones que se encuentran dentro de radio group

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txt_valor1);//realizamos la comunicacion entre la parte logica y la grafica y almancenamos la variable
        et2=(EditText)findViewById(R.id.txt_valor2);
        tv1=(TextView)findViewById(R.id.txt_resultado);
        rb1=(RadioButton)findViewById(R.id.rb_sumar);
        rb2=(RadioButton)findViewById(R.id.rb_restar);
    }
    //metodo para el boton calcular
    public void Calcular(View view){
        String valor1_string=et1.getText().toString();//almacenamos las variables de los edit text , obtenemos el texto y to pasamos a string
        String valor2_string=et2.getText().toString();//almacenamos las variables de los edit text , obtenemos el texto y to pasamos a string

        int valor1_int=Integer.parseInt(valor1_string);
        int valor2_int=Integer.parseInt(valor2_string);
        if(rb1.isChecked()==true){//verificamos con la funcion ischecked si el boton 1 esta seleccionado
            int suma=valor1_int+valor2_int;
            //como queremos mostrar el valor en un text view obligatoriamente ncesitamos pasar de entero a string
            String resultado=String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rb2.isChecked()==true){
            int resta=valor1_int-valor2_int;
            //como queremos mostrar el valor en un text view obligatoriamente ncesitamos pasar de entero a string
            String resultado=String.valueOf(resta);
            tv1.setText(resultado);
        }
    }
}