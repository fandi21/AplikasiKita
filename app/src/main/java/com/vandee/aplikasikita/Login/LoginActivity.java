package com.vandee.aplikasikita.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.vandee.aplikasikita.R;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    TextView tv_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        tv_regis = findViewById(R.id.tv_register);

    }
}