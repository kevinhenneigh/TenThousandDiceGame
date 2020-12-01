package com.ebookfrenzy.tenthousanddicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;

import android.os.Bundle;

import com.ebookfrenzy.tenthousanddicegame.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements RulesFragment.OnFragmentInteractionListener, GameFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}