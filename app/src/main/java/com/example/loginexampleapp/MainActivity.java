package com.example.loginexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logInButtonFunction(View view) {
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info", "Button pressed.");
        Log.i("Username", usernameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());

        Toast.makeText(this, "Hi there!", Toast.LENGTH_LONG).show();
    }
}
