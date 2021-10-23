package com.example.loginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void loginValue (View view) {
        EditText username = (EditText) findViewById(R.id.userName);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword);

        String user = username.getText().toString();
        String pass = password.getText().toString();

        if (user.equals("rithin") && pass.equals("12345")) {
            newActivity();
        } else {
            new AlertDialog.Builder(MainActivity.this)
                    .setMessage("Invalid Username or Password")
                    .setCancelable(true)
                    .setPositiveButton(
                            "OK", (dialog, id) -> dialog.cancel())
                    .show();
        }
    }

        public void newActivity () {
            Intent otheract = new Intent(MainActivity.this,other.class);
            startActivity(otheract);
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}