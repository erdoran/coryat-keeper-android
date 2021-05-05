package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentCoryatJeopardyRoundBinding;

public class CoryatJeopardyRoundFragment extends Fragment {

    FragmentCoryatJeopardyRoundBinding mBinding;
    CoryatScorekeeperViewModel mViewModel;
    JRoundHandler handler = new JRoundHandler() {
        @Override
        public void increase200BtnClick() {
            mViewModel.getjRoundStats().jCorrect200();
            Log.d("SCORE", mViewModel.getScore());
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase400BtnClick() {
            mViewModel.getjRoundStats().jCorrect400();
        }

        @Override
        public void increase600BtnClick() {
            mViewModel.getjRoundStats().jCorrect600();
        }

        @Override
        public void increase800BtnClick() {
            mViewModel.getjRoundStats().jCorrect800();
        }

        @Override
        public void increase1000BtnClick() {
            mViewModel.getjRoundStats().jCorrect1000();
        }

        // TODO: Daily Double click
    };

    public static CoryatJeopardyRoundFragment newInstance() {
        return new CoryatJeopardyRoundFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_jeopardy_round, container, false);
        mViewModel = new ViewModelProvider(getParentFragment()).get(CoryatScorekeeperViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setHandler(handler);
        return mBinding.getRoot();
    }
}