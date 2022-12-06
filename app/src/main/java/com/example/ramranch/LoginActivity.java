package com.example.ramranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    class Credentials
    {
        String name = "alex";
        String password = "12345";
    }

    EditText usernameInput;
    EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button confirmButton = findViewById(R.id.ConfirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernameInput = (EditText) findViewById(R.id.LoginUsername);
                passwordInput = (EditText) findViewById(R.id.LoginPassword);

                Credentials credentials = new Credentials();
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                System.out.println(username);
                System.out.println(password);

                if (username.equals(credentials.name)  && password.equals(credentials.password)){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }


            }
        });
    }
}