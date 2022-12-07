package com.example.ramranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {

    class Credentials
    {
        String name;
        String password;

        public Credentials(String name, String password){
            this.name = name;
            this.password = password;
        }

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

                Credentials alex = new Credentials("alex","12345");
                Credentials kyle = new Credentials("kyle", "12345");

                ArrayList<Credentials> loginInfo = new ArrayList<>();
                loginInfo.add(alex);
                loginInfo.add(kyle);

                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                System.out.println(username);
                System.out.println(password);

                for(Credentials i: loginInfo){
                    if (username.equals(i.name)  && password.equals(i.password)){
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }
                }



            }
        });
    }
}