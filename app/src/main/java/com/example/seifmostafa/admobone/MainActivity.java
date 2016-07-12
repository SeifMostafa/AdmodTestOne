package com.example.seifmostafa.admobone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.*;

public class MainActivity extends AppCompatActivity {

    Button bannerad,interstitialad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bannerad = (Button)findViewById(R.id.bannerAd);
        bannerad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BannerActivity.class));
            }
        });
        interstitialad = (Button)findViewById(R.id.interstitialAd);
        interstitialad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,InterstitialActivity.class));
            }
        });
    }
}
