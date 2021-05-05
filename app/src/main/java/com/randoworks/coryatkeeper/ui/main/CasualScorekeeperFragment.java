package com.randoworks.coryatkeeper.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.randoworks.coryatkeeper.R;

public class CasualScorekeeperFragment extends Fragment {

    private CasualScorekeeperViewModel mViewModel;

    public static CasualScorekeeperFragment newInstance() {
        return new CasualScorekeeperFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_casual_scorekeeper, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CasualScorekeeperViewModel.class);
        // TODO: Use the ViewModel
    }

}