package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private String jugador = "x";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
    }

    public void presion(View v) {
        //Asignamos la var b al boton que es presionado
        Button b = (Button)v;
        if(b.getText().toString().equals("")){
            b.setText(jugador);
            verficarGano(jugador);
            cambioJugador();
        }
    }

    private  void verficarGano(String turno){
        String casilla1= bt1.getText().toString();
        String casilla2= bt2.getText().toString();
        String casilla3= bt3.getText().toString();
        String casilla4= bt4.getText().toString();
        String casilla5= bt5.getText().toString();
        String casilla6= bt6.getText().toString();
        String casilla7= bt7.getText().toString();
        String casilla8= bt8.getText().toString();
        String casilla9= bt9.getText().toString();
        if(casilla1.equals(turno) && casilla2.equals(turno) && casilla3.equals(turno))
            gano(turno);
        if(casilla4.equals(turno) && casilla5.equals(turno) && casilla6.equals(turno))
            gano(turno);
        if(casilla7.equals(turno) && casilla8.equals(turno) && casilla9.equals(turno))
            gano(turno);
        if(casilla1.equals(turno) && casilla4.equals(turno) && casilla7.equals(turno))
            gano(turno);
        if(casilla2.equals(turno) && casilla5.equals(turno) && casilla8.equals(turno))
            gano(turno);
        if(casilla3.equals(turno) && casilla6.equals(turno) && casilla9.equals(turno))
            gano(turno);
        if(casilla1.equals(turno) && casilla5.equals(turno) && casilla9.equals(turno))
            gano(turno);
        if(casilla3.equals(turno) && casilla5.equals(turno) && casilla7.equals(turno))
            gano(turno);
    }

    private void gano(String jugador){
        Toast.makeText(this, "Gano el jugador: "+jugador, Toast.LENGTH_SHORT).show();
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);
    }

    public void cambioJugador() {
        if (jugador.equals("x")) {
            jugador = "0";
        } else {
            jugador = "x";
        }
    }

    public void salir(View v){
        finish();
    }
}