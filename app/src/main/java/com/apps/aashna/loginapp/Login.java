package com.apps.aashna.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton();
    }

    public void loginButton() {
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        Button loginButton = (Button)findViewById(R.id.login_button);

        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("aashna") &&
                        password.getText().toString().equals("pass")){
                            Toast.makeText(Login.this,"Congratulations!",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, User.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(Login.this,"Incorrect credentials!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
