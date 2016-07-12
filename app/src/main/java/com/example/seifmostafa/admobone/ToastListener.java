package com.example.seifmostafa.admobone;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by seifmostafa on 12/07/16.
 */
public class ToastListener extends AdListener {
    Context context;
    private String ErrorReason = null;
    public ToastListener(Context context1) {
        this.context=context1;
    }

    @Override
    public void onAdClosed() {
        Toast.makeText(context,"onAdClosed",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int i) {
        switch (i)
        {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
                ErrorReason="Internal error";
                break;
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
                ErrorReason="Internal error";
                break;
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
                ErrorReason="Internal error";
                break;
            case AdRequest.ERROR_CODE_NO_FILL:
                ErrorReason="Internal error";
                break;
        }
        getErrorReason(ErrorReason);
        Toast.makeText(context,"OnFailedToLoad "+ErrorReason,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
        Toast.makeText(context,"onAdLeftApplication",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        Toast.makeText(context,"onAdOpened",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLoaded() {
        Toast.makeText(context,"onAdLoaded",Toast.LENGTH_SHORT).show();
    }
    String getErrorReason(String core)
    {
        String error = null;
        Toast.makeText(context,core+"is the error",Toast.LENGTH_LONG).show();
        return error;
    }
}
