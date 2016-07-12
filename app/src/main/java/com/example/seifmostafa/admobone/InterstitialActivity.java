package com.example.seifmostafa.admobone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class InterstitialActivity extends AppCompatActivity {

    Button loadbtn,viewbtn;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);
        loadbtn = (Button)findViewById(R.id.loadAd);
        viewbtn = (Button)findViewById(R.id.viewAd);
        viewbtn.setEnabled(false);
        loadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewbtn.setText("Loading Interstitial");
                viewbtn.setEnabled(true);

            }
        });
        adView = (AdView)findViewById(R.id.adviewInterstitial);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        ToastListener toastListener = new ToastListener(InterstitialActivity.this);
        adView.setAdListener(toastListener);

    }
}
