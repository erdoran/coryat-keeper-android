package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentCoryatReviewStatsBinding;

public class CoryatReviewStatsFragment extends Fragment {

    FragmentCoryatReviewStatsBinding mBinding;
    CoryatScorekeeperViewModel mViewModel;

    public static CoryatReviewStatsFragment newInstance() {
        return new CoryatReviewStatsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_review_stats, container, false);
        mViewModel = new ViewModelProvider(getActivity()).get(CoryatScorekeeperViewModel.class);
        setStatInfo();
        return mBinding.getRoot();
    }

    public void setStatInfo() {
        mBinding.finalscoreTv.setText(mViewModel.getScore());
        mBinding.jscoreTv.setText("$"+String.valueOf(mViewModel.getjRoundStats().getJRoundScore()));
        mBinding.djscoreTv.setText("$"+String.valueOf(mViewModel.getDjRoundStats().getDjRoundScore()));
        if (mViewModel.getFjRoundStats().getCorrect() == null) {
            mBinding.fjscoreTv.setText("Incorrect");
        } else if (!mViewModel.getFjRoundStats().getCorrect()) {
            mBinding.fjscoreTv.setText("Incorrect");
        } else {
            mBinding.fjscoreTv.setText("Correct");
        }

        mBinding.j200Tv.setText(mViewModel.getjRoundStats().value200Correct+"/"+mViewModel.getjRoundStats().value200Attempted);
        mBinding.j400Tv.setText(mViewModel.getjRoundStats().value400Correct+"/"+mViewModel.getjRoundStats().value400Attempted);
        mBinding.j600Tv.setText(mViewModel.getjRoundStats().value600Correct+"/"+mViewModel.getjRoundStats().value600Attempted);
        mBinding.j800Tv.setText(mViewModel.getjRoundStats().value800Correct+"/"+mViewModel.getjRoundStats().value800Attempted);
        mBinding.j1000Tv.setText(mViewModel.getjRoundStats().value1000Correct+"/"+mViewModel.getjRoundStats().value1000Attempted);
        mBinding.jddTv.setText(mViewModel.getjRoundStats().valueDDCorrect+"/"+mViewModel.getjRoundStats().valueDDAttempted);

        mBinding.dj400Tv.setText(mViewModel.getDjRoundStats().getValue400Correct() + "/" + mViewModel.getDjRoundStats().getValue400Attempted());
        mBinding.dj800Tv.setText(mViewModel.getDjRoundStats().getValue800Correct() + "/" + mViewModel.getDjRoundStats().getValue800Attempted());
        mBinding.dj1200Tv.setText(mViewModel.getDjRoundStats().getValue1200Correct() + "/" + mViewModel.getDjRoundStats().getValue1200Attempted());
        mBinding.dj1600Tv.setText(mViewModel.getDjRoundStats().getValue1600Correct() + "/" + mViewModel.getDjRoundStats().getValue1600Attempted());
        mBinding.dj2000Tv.setText(mViewModel.getDjRoundStats().getValue2000Correct() + "/" + mViewModel.getDjRoundStats().getValue2000Attempted());
        mBinding.djddTv.setText(mViewModel.getDjRoundStats().getValueDDCorrect() + "/" + mViewModel.getDjRoundStats().getValueDDAttempted());

    }


}