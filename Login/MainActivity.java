package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (EditText) findViewById(R.id.username);
        t2= (EditText) findViewById(R.id.password);
        b= (Button) findViewById(R.id.button2);
    }
    public void login(View view){
        String u = t1.getText().toString();
        String p = t2.getText().toString();
        Toast to1,to2;

        if (u.equals("username") && p.equals("password")){
            to1 = Toast.makeText(this, "Login successfull", Toast.LENGTH_SHORT);
            to1.show();
        }else {
            to2 = Toast.makeText(this,"Login failed", Toast.LENGTH_SHORT);
            to2.show();
        }
    }
}