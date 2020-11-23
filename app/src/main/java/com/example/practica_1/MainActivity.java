package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendData(View view) {
        Intent intent = new Intent(this, actInfo.class);
        EditText txtName = (EditText) findViewById(R.id.txtName);
        EditText txtBirthDate = (EditText) findViewById(R.id.txtBirthDate);
        EditText txtPhone = (EditText) findViewById(R.id.txtPhone);
        RadioGroup radioGrpGender = (RadioGroup) findViewById(R.id.radioGrpGender);
        int selectedGenderID = radioGrpGender.getCheckedRadioButtonId();
        RadioButton radioGender = (RadioButton) findViewById(selectedGenderID);
        Bundle b = new Bundle();
        b.putString("name", txtName.getText().toString());
        b.putString("birth_date", txtBirthDate.getText().toString());
        b.putString("phone", txtPhone.getText().toString());
        b.putString("gender", radioGender.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}