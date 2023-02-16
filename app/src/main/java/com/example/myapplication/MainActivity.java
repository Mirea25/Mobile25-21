package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "ONCREATE", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "ONSTART", Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "ONRESUME", Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "ONPAUSE", Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "ONSTOP", Toast.LENGTH_LONG).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "ONRESTART", Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "ONDESTROY", Toast.LENGTH_LONG).show();
    }
}