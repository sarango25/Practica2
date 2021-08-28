package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private TextView preguntaText;
  private EditText respuestaUsuario;
  private TextView contadorTxt;
  private TextView puntajeText;
  private Button responder;
  private Pregunta preguntaActual;
  private int puntaje;
  private int tiempoRestante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preguntaText = findViewById(R.id.preguntaTxt);
        respuestaUsuario = findViewById(R.id.respuestaUsuario);
        contadorTxt = findViewById(R.id.contadorText);
        puntajeText = findViewById(R.id.puntaje);
        responder = findViewById(R.id.responder);

        puntaje = 0;
        puntajeText.setText("Puntaje: "+puntaje);

        tiempoRestante = 30;
        contadorTxt.setText("" + tiempoRestante);

        generarNuevaPregunta();


        responder.setOnClickListener(
                (view) -> {
                    verificarRespuesta();

                }
        );
    }
    public void verificarRespuesta(){
        String respuestaTexto = respuestaUsuario.getText().toString();
        int respuestaInt = (int) Integer.parseInt(respuestaTexto);

        if (respuestaInt == preguntaActual.getRespuesta()){
            Toast.makeText(this,"correcto",Toast.LENGTH_SHORT).show();
            puntaje += 5;
            puntajeText.setText("Puntaje: "+puntaje);
        }else{
            Toast.makeText(this,"mal",Toast.LENGTH_SHORT).show();
        }

    }

    public void generarNuevaPregunta(){
        preguntaActual = new Pregunta();
        preguntaText.setText(preguntaActual.getPregunta());
    }

}