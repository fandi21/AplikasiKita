package com.vandee.aplikasikita.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vandee.aplikasikita.R;

public class RegisterActivity extends AppCompatActivity {
    Button btnRegister;
    TextView login, etEmail, etPassword, etPasswordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login = findViewById(R.id.login);
        btnRegister = findViewById(R.id.btnRegister);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void signUp(){
        String etEmail1 = etEmail.getText().toString();
        String etPassword1 = etPassword.getText().toString();
        String etPasswordConfirm1 = etPasswordConfirm.getText().toString();

        if(etEmail1.isEmpty()){
            etEmail.setError("Please Isi Email");
            etEmail.requestFocus();
        }else if(etPassword1.isEmpty() || etPassword1.length() < 6){ //Jika Password Kosong atau password kurang dari 6 karakter
            etPassword.setError("Please Isi Password");
            etPassword.requestFocus();
        }else if(etPasswordConfirm1.isEmpty()){ //Jika Password Confirm Kosong
            etPasswordConfirm.setError("Please Isi Password Confirm");
            etPasswordConfirm.requestFocus();
        }else if(etPassword1 != etPasswordConfirm1){ //Jika pasword dan password confirm tidak sama
            etPasswordConfirm.setError("Password Not Mactch");
            etPasswordConfirm.requestFocus();
        }else{

        }
    }
}