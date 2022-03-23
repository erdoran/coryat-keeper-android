package com.randoworks.coryatkeeper.ui.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    FragmentManager fragmentManager;
    FragmentHomeBinding mBinding;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        mBinding.setHandler(handler);
        return mBinding.getRoot();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    HomeHandler handler = new HomeHandler() {
        @Override
        public void scorekeeperBtnClick() {
            fragmentManager = getParentFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container, CoryatScorekeeperFragment.class, null).commit();
        }
    };
}