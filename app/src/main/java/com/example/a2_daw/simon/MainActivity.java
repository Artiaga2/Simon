package com.example.a2_daw.simon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button playBtn;
    private Button puntuacionBtn;
    private Button rojoBtn;
    private Button verdeBtn;
    private Button azulBtn;
    private Button amarilloBtn;

    private ArrayList <Button> simon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectWidgets();
        connectEventtoWidgets();
        simon = new ArrayList<Button>();
        loadButtons();
    }

    private void loadButtons(Button button) {
        Random random = new Random();
        button = random.nextInt(simon.size())
        simon.add(new Button());
        simon.add(verdeBtn);
        simon.add(azulBtn);
        simon.add(amarilloBtn);
    }


    private void connectEventtoWidgets() {
        playBtn.setOnClickListener(this);
        puntuacionBtn.setOnClickListener(this);
        rojoBtn.setOnClickListener(this);
        verdeBtn.setOnClickListener(this);
        azulBtn.setOnClickListener(this);
        amarilloBtn.setOnClickListener(this);
    }

    private void connectWidgets() {
        playBtn = (Button) findViewById(R.id.btn_play);
        puntuacionBtn = (Button) findViewById(R.id.btn_puntuacion);
        rojoBtn = (Button) findViewById(R.id.btn_rojo);
        verdeBtn = (Button) findViewById(R.id.btn_verde);
        amarilloBtn = (Button) findViewById(R.id.btn_amarillo);
        azulBtn = (Button) findViewById(R.id.btn_azul);

    }

    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        switch (v.getId()) {
            case R.id.btn_rojo:
            case R.id.btn_verde:
            case R.id.btn_amarillo:
            case R.id.btn_azul:
                readButton();
                break;
            case R.id.btn_play:
                playGame();
                break;
            case R.id.btn_puntuacion:
                readPuntuacion();
                break;
                default:

        }
    }

    private void readPuntuacion(Button button){

    }

    private void playGame(Button button) {
        Random random = new Random();
        random

    }

    private void readButton(Button button) {
    }


}

