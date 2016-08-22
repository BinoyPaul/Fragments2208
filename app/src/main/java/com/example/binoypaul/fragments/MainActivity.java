package com.example.binoypaul.fragments;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;

class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentIntf {
    @Override
    public void memeCreate(String s1, String s2) {
        Log.i("bTest", "Got from fragment to Main activity ");
        Log.i("bTest", "String 1 is "+s1);
        Log.i("bTest", "String 2 is "+s2);
        com.example.binoypaul.fragments.BottomFragment bottomFragment = (com.example.binoypaul.fragments.BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomBit);
        bottomFragment.setTheText(s1, s2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

}
