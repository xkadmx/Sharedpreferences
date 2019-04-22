package com.example.sharedpreferences;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    SharedPreferences utils;
    Button buttonOk;
    EditText editLogin;


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        utils = getSharedPreferences("loginPref", MODE_PRIVATE);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        editLogin = (EditText) findViewById(R.id.editLogin);
        loadData();
    }
    private void loadData(){
        String loadFromPref = utils.getString("login", " ");
        editLogin.setText(loadFromPref);
    }
}
