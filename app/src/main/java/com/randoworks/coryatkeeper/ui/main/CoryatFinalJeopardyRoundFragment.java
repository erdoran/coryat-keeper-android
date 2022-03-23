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
import com.randoworks.coryatkeeper.databinding.FragmentCoryatFinalJeopardyRoundBinding;

public class CoryatFinalJeopardyRoundFragment extends Fragment {

    FragmentCoryatFinalJeopardyRoundBinding mBinding;
    CoryatScorekeeperViewModel mViewModel;
    FJRoundHandler handler = new FJRoundHandler(){

        @Override
        public void setFJStatusCorrect() {
            mViewModel.getFjRoundStats().setCorrect(true);
        }

        @Override
        public void setFJStatusIncorrect() {
            mViewModel.getFjRoundStats().setCorrect(false);
        }
    };

    public static CoryatFinalJeopardyRoundFragment newInstance() {
        return new CoryatFinalJeopardyRoundFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_final_jeopardy_round, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(CoryatScorekeeperViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setHandler(handler);
        setFJStatus();
        return mBinding.getRoot();
    }

    public void setFJStatus() {
        if (mViewModel.getFjRoundStats().getCorrect() != null) {
            if (mViewModel.getFjRoundStats().getCorrect()) {
                mBinding.coryatFjCorrectRadioBtn.setChecked(true);
            } else if (!mViewModel.getFjRoundStats().getCorrect()) {
                mBinding.coryatFjIncorrectRadioBtn.setChecked(true);
            }
        }
    }
}