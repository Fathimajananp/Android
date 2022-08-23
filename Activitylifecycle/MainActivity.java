package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("My_Tag", "onCreate");
        Toast.makeText(this, "Activity Created", Toast.LENGTH_SHORT).show();
        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My_Tag", "onStart");
        Toast.makeText(this, "Activity Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My_Tag", "onResume");
        Toast.makeText(this, "Activity Resumed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My_Tag", "onStop");
        Toast.makeText(this, "Activity Stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My_Tag","onRestart");
        Toast.makeText(this, "Activity Restart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My_Tag","onDestroy");
        Toast.makeText(this, "Activity Destroyed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My_Tag", "onPaused");
        Toast.makeText(this, "Activity Paused", Toast.LENGTH_SHORT).show();
    }

    public void Activity() {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}