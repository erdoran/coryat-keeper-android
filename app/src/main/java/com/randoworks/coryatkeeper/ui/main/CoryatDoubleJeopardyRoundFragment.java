package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentCoryatDoubleJeopardyRoundBinding;

public class CoryatDoubleJeopardyRoundFragment extends Fragment {

    FragmentCoryatDoubleJeopardyRoundBinding mBinding;
    CoryatScorekeeperViewModel mViewModel;
    DJRoundHandler handler = new DJRoundHandler() {
        @Override
        public void increase400BtnClick() {
            mViewModel.getDjRoundStats().djCorrect400();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase800BtnClick() {
            mViewModel.getDjRoundStats().djCorrect800();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase1200BtnClick() {
            mViewModel.getDjRoundStats().djCorrect1200();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase1600BtnClick() {
            mViewModel.getDjRoundStats().djCorrect1600();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increase2000BtnClick() {
            mViewModel.getDjRoundStats().djCorrect2000();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void increaseDDBtnClick() {
            mViewModel.getDjRoundStats().djDDCorrect();
        }

        @Override
        public void decrease400BtnClick() {
            mViewModel.getDjRoundStats().djIncorrect400();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease800BtnClick() {
            mViewModel.getDjRoundStats().djIncorrect800();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease1200BtnClick() {
            mViewModel.getDjRoundStats().djIncorrect1200();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease1600BtnClick() {
            mViewModel.getDjRoundStats().djIncorrect1600();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decrease2000BtnClick() {
            mViewModel.getDjRoundStats().djIncorrect2000();
            mViewModel.getScoreDisplay().setValue(String.valueOf(mViewModel.getScore()));
        }

        @Override
        public void decreaseDDBtnClick() {
            mViewModel.getDjRoundStats().djDDIncorrect();
        }

        // TODO: DAILY DOUBLE CLICK
    };

    public static CoryatDoubleJeopardyRoundFragment newInstance() {
        return new CoryatDoubleJeopardyRoundFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_double_jeopardy_round, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(CoryatScorekeeperViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setHandler(handler);
        return mBinding.getRoot();

    }
}