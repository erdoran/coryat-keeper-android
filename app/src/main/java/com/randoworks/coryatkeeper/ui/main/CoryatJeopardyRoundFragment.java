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
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease200BtnClick() {
            mViewModel.getjRoundStats().jIncorrect200();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase400BtnClick() {
            mViewModel.getjRoundStats().jCorrect400();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease400BtnClick() {
            mViewModel.getjRoundStats().jIncorrect400();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase600BtnClick() {
            mViewModel.getjRoundStats().jCorrect600();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease600BtnClick() {
            mViewModel.getjRoundStats().jIncorrect600();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase800BtnClick() {
            mViewModel.getjRoundStats().jCorrect800();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease800BtnClick() {
            mViewModel.getjRoundStats().jIncorrect800();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase1000BtnClick() {
            mViewModel.getjRoundStats().jCorrect1000();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease1000BtnClick() {
            mViewModel.getjRoundStats().jIncorrect1000();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increaseDDBtnCLick() {
            mViewModel.getjRoundStats().jDDCorrect();
        }

        @Override
        public void decreaseDDBtnClick() {
            mViewModel.getjRoundStats().jDDIncorrect();
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
        mViewModel = new ViewModelProvider(requireActivity()).get(CoryatScorekeeperViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setHandler(handler);
        return mBinding.getRoot();
    }
}