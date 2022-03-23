package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentCoryatScorekeeperBinding;

import java.util.Objects;

public class CoryatScorekeeperFragment extends Fragment {

    CoryatScorekeeperViewModel mViewModel;
    FragmentCoryatScorekeeperBinding mBinding;
    FragmentManager fragmentManager;

    public static CoryatScorekeeperFragment newInstance() {
        return new CoryatScorekeeperFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {

            @Override
            public void handleOnBackPressed() {
                ExitGameDialogFragment exitGameDialogFragment = new ExitGameDialogFragment();
                exitGameDialogFragment.show(requireActivity().getSupportFragmentManager(),"TEMP");
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_scorekeeper, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(CoryatScorekeeperViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setHandler(handler);
        final Observer<String> scoreObserver = new Observer<String>() {
            @Override
            public void onChanged(String scoreDisplay) {
                mBinding.coryatScoreTv.setText(scoreDisplay);
            }
        };
        mViewModel.getScoreDisplay().observe(getViewLifecycleOwner(), scoreObserver);
        return mBinding.getRoot();
    }

    ScoreHandler handler = new ScoreHandler() {
        @Override
        public void clickJeopardyBtn() {
            fragmentManager = getChildFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.coryat_fragment_container, CoryatJeopardyRoundFragment.class, null).commit();
        }

        @Override
        public void clickDoubleJeopardyBtn() {
            fragmentManager = getChildFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.coryat_fragment_container, CoryatDoubleJeopardyRoundFragment.class, null).commit();
        }

        @Override
        public void clickFinalJeopardyBtn() {
            fragmentManager = getChildFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.coryat_fragment_container, CoryatFinalJeopardyRoundFragment.class, null).commit();
        }

        @Override
        public void clickExitBtn() {

            ExitGameDialogFragment exitGameDialogFragment = new ExitGameDialogFragment();
            exitGameDialogFragment.show(requireActivity().getSupportFragmentManager(),"TEMP");
        }

        @Override
        public void clickEditBtn() {

        }

        @Override
        public void finishBtn() {
            fragmentManager = getParentFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, CoryatReviewFragment.class, null)
                    .setReorderingAllowed(true)
                    .commit();

        }
    };
}