package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etCity, etMajor, etMotivation;
    Button btnCancel, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_pass);
        etCity = findViewById(R.id.et_city);
        etMajor = findViewById(R.id.et_major);
        etMotivation = findViewById(R.id.et_motiva);
        btnCancel = findViewById(R.id.btn_cancel);
        btnSignup = findViewById(R.id.btn_sign);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etName.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Name is required!", Toast.LENGTH_LONG).show();
                }
                else if (etEmail.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Email is required!", Toast.LENGTH_LONG).show();
                }
                else if (etPassword.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Password is required!", Toast.LENGTH_LONG).show();
                }
                else if (etCity.length() == 0) {
                    Toast.makeText(getApplicationContext(), "City is required!", Toast.LENGTH_LONG).show();
                }
                else if (etMajor.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Major is required!", Toast.LENGTH_LONG).show();
                }
                else if (etMotivation.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Motivation is required!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "SUCCESFULLY SIGNED UP!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You cancelled the registration.", Toast.LENGTH_LONG).show();
                etName.setText(" ");
                etEmail.setText(" ");
                etPassword.setText(" ");
                etCity.setText(" ");
                etMajor.setText(" ");
                etMotivation.setText(" ");

            }
        });


    }
}