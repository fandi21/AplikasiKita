package com.vandee.aplikasikita.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vandee.aplikasikita.R;
import com.vandee.aplikasikita.model.ApiResponse;
import com.vandee.aplikasikita.util.ApiClient;
import com.vandee.aplikasikita.util.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    Button btnRegister;
    TextView login, etName, etUsername, etPassword;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login = findViewById(R.id.login);
        btnRegister = findViewById(R.id.btnRegister);
        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        etUsername = findViewById(R.id.etUsername);

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
        String name = etName.getText().toString();
        String password = etPassword.getText().toString();
        String username = etUsername.getText().toString();

        if(name.isEmpty()){
            etName.setError("Please Isi Name");
            etName.requestFocus();
        }else if(username.isEmpty()){
            etUsername.setError("Please Isi Username");
            etUsername.requestFocus();
        }else if(password.isEmpty() || etPassword.length() < 6){
            etPassword.setError("Please Isi Password");
            etPassword.requestFocus();
        }else{
            progressDialog.setMessage("Please Wait Register");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            Call<ApiResponse> call = ApiClient.getApiClient().create(ApiInterface.class)
                    .performUserRegisIn(name, username, password);
            call.enqueue(new Callback<ApiResponse>() {
                @Override
                public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {

                }

                @Override
                public void onFailure(Call<ApiResponse> call, Throwable t) {

                }
            });
        }
    }
}