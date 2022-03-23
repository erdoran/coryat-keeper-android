package com.randoworks.coryatkeeper.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.randoworks.coryatkeeper.R;
import com.randoworks.coryatkeeper.databinding.FragmentCoryatReviewBinding;

import java.io.File;

public class CoryatReviewFragment extends Fragment {

    FragmentCoryatReviewBinding mBinding;
    FragmentManager fragmentManager;
    CoryatScorekeeperViewModel mViewModel;


    public static CoryatReviewFragment newInstance() {
        return new CoryatReviewFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {

            @Override
            public void handleOnBackPressed() {
                ExitGameDialogFragment exitGameDialogFragment = new ExitGameDialogFragment();
                exitGameDialogFragment.show(requireActivity().getSupportFragmentManager(), "TEMP");
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_coryat_review, container, false);
        mBinding.setHandler(handler);
        mViewModel = new ViewModelProvider(requireActivity()).get(CoryatScorekeeperViewModel.class);
        return mBinding.getRoot();
    }

    ReviewStatsHandler handler = new ReviewStatsHandler() {
        @Override
        public void onDiscardBtnClick() {
            ExitGameDialogFragment exitGameDialogFragment = new ExitGameDialogFragment();
            exitGameDialogFragment.show(requireActivity().getSupportFragmentManager(), "TEMP");
        }

        @Override
        public void onSaveBtnClick() {
            writeGameStats();
            requireActivity().getViewModelStore().clear();


            fragmentManager = getParentFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, HomeFragment.class, null)
                    .setReorderingAllowed(true)
                    .commit();
        }
    };

    private void writeGameStats() {
        FileHandling fh = new FileHandling(getContext());
        Log.d("NAME: ", fh.fileName);
        fh.writeFile(mViewModel.getScore());
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().getJRoundScore()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getDjRoundScore()));
        fh.writeFile(String.valueOf(mViewModel.getFjRoundStats().getCorrect()));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value200Correct));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value200Attempted));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value400Correct));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value400Attempted));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value600Correct));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value600Attempted));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value800Correct));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value800Attempted));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value1000Correct));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().value1000Attempted));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().valueDDCorrect));
        fh.writeFile(String.valueOf(mViewModel.getjRoundStats().valueDDAttempted)); // This technically isn't needed since there is only one DD in the J Round
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue400Correct()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue400Attempted()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue800Correct()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue800Attempted()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue1200Correct()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue1200Attempted()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue1600Correct()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue1600Attempted()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue2000Correct()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValue2000Attempted()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValueDDCorrect()));
        fh.writeFile(String.valueOf(mViewModel.getDjRoundStats().getValueDDAttempted()));

        fh.readFile();
    }

    private void loadGameStats() {


    }


}