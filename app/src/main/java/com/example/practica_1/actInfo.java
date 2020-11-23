package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class actInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_info);

        TextView txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        TextView txtData = (TextView) findViewById(R.id.txtData);
        Bundle b = this.getIntent().getExtras();
        txtWelcome.setText("Bienvenid@!\n"+b.getString("name")+".");
        txtData.setText("Tu género es "+b.getString("gender")+",\ntu fecha de nacimiento es "+b.getString("birth_date")+"\ny tu teléfono es "+b.getString("phone"));
    }

    public void BackToHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}