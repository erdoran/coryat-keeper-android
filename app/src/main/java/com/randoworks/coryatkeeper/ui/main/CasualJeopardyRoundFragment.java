package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.randoworks.coryatkeeper.R;

public class CasualJeopardyRoundFragment extends Fragment {

    public CasualJeopardyRoundFragment() {
        // Required empty public constructor
    }

    public static CasualJeopardyRoundFragment newInstance(String param1, String param2) {
        CasualJeopardyRoundFragment fragment = new CasualJeopardyRoundFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_casual_double_jeopardy_round, container, false);
    }
}