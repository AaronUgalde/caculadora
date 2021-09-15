package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.math.*;

public class CalculadoraCientifica extends AppCompatActivity {
    
    TextView pantalla,pantalla2;
    String newNum="",numT="",signo="",numanterior,nuno,ndos;
    float n1=0,n2,r;
    double n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica);
        pantalla2=findViewById(R.id.textViewCC);
        pantalla=findViewById(R.id.TextViewC);
    }
    public void btn0(View view){
            newNum="0";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn1(View view){
            newNum="1";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn2(View view){
            newNum="2";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn3(View view){
            newNum="3";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn4(View view){
            newNum="4";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn5(View view){
            newNum="5";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn6(View view){
            newNum="6";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn7(View view){
            newNum="7";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn8(View view){
            newNum="8";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btn9(View view){
            newNum="9";
            numT=numT+newNum;
            pantalla.setText(numT);
        }
        public void btnB(View view){
            numT="";
            pantalla.setText("0");

        }
        public void btnB1(View view){
            if (1<numT.length()){
                numT=numT.substring(0,numT.length()-1);
                pantalla.setText(numT);}
            else{
                numT="";
                pantalla.setText("0");}
        }
        public void btnp(View view){
            if(contarCaracteres(numT,'.')==0){
            newNum=".";
            if(numT==""){numT="0";}
            numT=numT+newNum;
            pantalla.setText(numT);}else{
                Toast.makeText(getApplicationContext(), "Ya hay un punto en la operacion", Toast.LENGTH_SHORT).show();
            }
        }
        public void btnmas(View view){
            signo="+";
            if(numT==""){
                numT="0";
            }
            n1=Float.parseFloat(numT);
            numT="";
            pantalla.setText("0");
        }
        public void btnmenos(View view){
            signo="-";
            if(numT==""){
                numT="0";
            }
            n1=Float.parseFloat(numT);
            numT="";
            pantalla.setText("0");
        }
        public void btnentre(View view){
            signo="/";
            n1=Float.parseFloat(numT);
            numT="";
            pantalla.setText("0");
        }
        public void btnpor(View view){
            signo="*";
            if(numT==""){
                numT="0";
            }
            n1=Float.parseFloat(numT);
            numT="";
            pantalla.setText("0");
        }
        public void btnigual(View view){
        try {
            if (numT == "") {
                numT = "0";
            }
            switch (signo) {
                case "+":
                    n2 = Float.parseFloat(numT);
                    ndos=Float.toString(n2);
                    nuno=Float.toString(n1);
                    numanterior=n1+"+"+n2+"=";
                    r = n1 + n2;
                    signo = "++";
                    break;
                case "++":
                    n1 = Float.parseFloat(numT);
                    n2 = Float.parseFloat(numT);
                    ndos=Float.toString(n2);
                    nuno=Float.toString(n1);
                    numanterior=n2+"+"+n1+"=";
                    r = n1 + n2;
                    break;
                case "-":
                    n2 = Float.parseFloat(numT);
                    r = n1 - n2;
                ndos=Float.toString(n2);
nuno=Float.toString(n1);
numanterior=n1+"+"+n2+"=";
                    signo = "--";
                    break;
                case "--":
                    n1 = Float.parseFloat(numT);
                    r = n1 - n2;
                    break;
                case "/":
                    n2 = Float.parseFloat(numT);
                    r = n1 / n2;
                    signo = "//";
                    break;
                case "//":
                    n1 = Float.parseFloat(numT);
                    r = n1 / n2;
                    break;
                case "*":
                    n2 = Float.parseFloat(numT);
                    r = n1 * n2;
                    signo = "**";
                    break;
                case "**":
                    n1 = Float.parseFloat(numT);
                    r = n1 * n2;
                    break;
                default:
                    break;
            }
            numT = String.valueOf(r);
            pantalla.setText(numT);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "No se pueden realizar esas operaciones", Toast.LENGTH_SHORT).show();
        }
        }
        public void btnraiz(View view){
            try {
            n=Math.sqrt(Float.parseFloat(numT));
            n1=(float) n;
            numT=Float.toString(n1);
            pantalla.setText(numT);}catch (Exception exception){
                Toast.makeText(getApplicationContext(), "No se pueden sacar esas raizes", Toast.LENGTH_SHORT).show();
            }
        }
        public void btnptn(View view){
            try{
            n1=Float.parseFloat(numT);
            n1=n1*n1;
            numT=Float.toString(n1);
            pantalla.setText(numT);}catch (Exception e){
                Toast.makeText(getApplicationContext(), "No se pueden hacer esas potencias", Toast.LENGTH_SHORT).show();
            }
        }
        public void btnsen(View view){
            n=Math.sin(Math.toRadians(Float.parseFloat(numT)));
            n1=(float) n;
            numT=Float.toString(n1);
            pantalla.setText(numT);
        }
        public void btntan(View view){
               n=Math.tan(Math.toRadians(Float.parseFloat(numT)));
               n1=(float) n;
               numT=Float.toString(n1);
               pantalla.setText(numT);
        }
        public void btncos(View view){
            n=Math.cos(Math.toRadians(Float.parseFloat(numT)));
            n1=(float) n;
            numT=Float.toString(n1);
            pantalla.setText(numT);
        }
        public void btnreciproco(View view){
            n1=Float.parseFloat(numT);
            n1=(1/n1);
            numT=Float.toString(n1);
            pantalla.setText(numT);
        }
        public void btnln(View view){
            n=Math.log(Float.parseFloat(numT));
            n1=(float) n;
            numT=Float.toString(n1);
            pantalla.setText(numT);
        }
        public void btnlog10(View view){
            n=Math.log10(Float.parseFloat(numT));
            n1=(float) n;
            numT=Float.toString(n1);
            pantalla.setText(numT);
        }

        public static int contarCaracteres(String cadena, char caracter) {
            int posicion, contador = 0;
            posicion = cadena.indexOf(caracter);
            while (posicion != -1) {
                contador++;
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
            return contador;
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.item1:
                    Intent i=new Intent(this,MainActivity.class);
                    startActivity(i);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }

}