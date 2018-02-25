package com.example.firza.firza_1202150018_modul3;


import android.content.Intent;

import android.os.Handler;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.WindowManager;

import android.widget.Toast;

import com.example.firza.firza_1202150018_modul3.MenuActivity;
import com.example.firza.firza_1202150018_modul3.R;


public class MainActivity extends AppCompatActivity {

    private int SplashInterval = 3000; // kecepatan perpindahan 3 detik

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//      Menghinlangkan head atau navigasi pada SplashScreen Activity

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                //berpindah dari splashscreen ke menulist utama

                startActivity(new Intent(getApplicationContext(), Login.class));

                //menampilkan toast

                Toast.makeText(MainActivity.this, "Selamat Datang", Toast.LENGTH_SHORT).show();

                finish();

            }

        },SplashInterval);

    }

}
