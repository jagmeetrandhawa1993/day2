package com.example.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnSignIn;
    private Button btnClear;
    private TextView lblMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edtEmail = findViewById(R.id.editEmail);
        edtPassword = findViewById(R.id.editPassword);
        lblMessage = findViewById(R.id.lblMessage);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnClear = findViewById(R.id.btnClear);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                // Toast.makeText(getApplicationContext(), email, Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, email, Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, password, Toast.LENGTH_SHORT).show();

                if (email.equals("a") && password.equals("123"))
                {
                    lblMessage.setText("Welcome");

                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

//Navigation
                    Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);
                    //Set value to pass in next page
                    mIntent.putExtra("name", "Jagmeet");
                    startActivity(mIntent);
                }
                else
                {
                    lblMessage.setText("Invalid");
                    Toast.makeText(LoginActivity.this,"Invalid email,password" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
