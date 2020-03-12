package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonRandomNumber(View view){
        TextView textViewSelectedNumber = findViewById(R.id.textViewSelectedNumber);
        int numberDrawn = new Random().nextInt(10) + 1; //generate random numbers from 1-10

        textViewSelectedNumber.setText("Numero selecionado: "+numberDrawn);

    }
}