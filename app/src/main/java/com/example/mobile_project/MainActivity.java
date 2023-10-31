package com.example.mobile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loginUser, createUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUser = findViewById(R.id.loginButton);
        createUser = findViewById(R.id.registerUser);

        //If the user does not have an account, they can click this button to create on.
        createUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSignUp = new Intent(MainActivity.this, SignUpPage.class);
                startActivity(toSignUp);
            }
        });

        //If the user has an account, they should be taken to a page with their profile


    }//onCreate method
}//class MainActivity