package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.randoworks.coryatkeeper.R;

public class LiveModeSelectFragment extends Fragment {



    public LiveModeSelectFragment() {
        // Required empty public constructor
    }

    public static LiveModeSelectFragment newInstance() {
        LiveModeSelectFragment fragment = new LiveModeSelectFragment();
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
        return inflater.inflate(R.layout.fragment_live_mode_select, container, false);
    }
}