package com.ebookfrenzy.tenthousanddicegame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.net.Uri;
import android.widget.TextView;


public class RulesFragment extends Fragment {

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    public RulesFragment() {
        // Required empty public constructor
    }

    public static RulesFragment newInstance(String param1, String param2) {
        RulesFragment fragment = new RulesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rules, container, false);
    }
}