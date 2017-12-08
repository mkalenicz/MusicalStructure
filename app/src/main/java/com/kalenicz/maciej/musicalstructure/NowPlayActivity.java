package com.kalenicz.maciej.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NowPlayActivity extends AppCompatActivity {
private static final String TAG = "NowPlayActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_play);
        Log.v(TAG, "NowPlayActivity works");
    }
}
