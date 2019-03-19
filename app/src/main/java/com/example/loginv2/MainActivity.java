package com.example.loginv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void enviar (View view){

        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button button = findViewById(R.id.button);

        Log.i("nombre", nombreEditText.getText().toString());
        Log.i("password", passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
