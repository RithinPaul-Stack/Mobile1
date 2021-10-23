package com.example.loginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class other extends AppCompatActivity {
public void logout(View view){
    loginActivity();

}
public void loginActivity() {
    Intent login = new Intent(this, MainActivity.class);
    startActivity(login);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
}
}