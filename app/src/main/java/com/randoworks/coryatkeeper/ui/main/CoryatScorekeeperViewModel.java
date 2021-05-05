package com.randoworks.coryatkeeper.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CoryatScorekeeperViewModel extends ViewModel {

    // DEBUG TAG
    private final String TAG = "SCORE";

    // TODO: Implement the ViewModel
    private MutableLiveData<String> scoreDisplay;
    private int score;
    private JRoundStats jRoundStats;
    private DJRoundStats djRoundStats;
    private FJRoundStats fjRoundStats;

    public MutableLiveData<String> getScoreDisplay() {
        if (scoreDisplay == null) {
            scoreDisplay = new MutableLiveData<String>();
        }
        return scoreDisplay;
    }

    public CoryatScorekeeperViewModel() {
        jRoundStats = new JRoundStats();
        djRoundStats = new DJRoundStats();
        fjRoundStats = new FJRoundStats();
    }

    public String getScore() {
        return String.valueOf(jRoundStats.getJRoundScore());
    }



    public JRoundStats getjRoundStats() {
        return jRoundStats;
    }

    public DJRoundStats getDjRoundStats() {
        return djRoundStats;
    }

    public FJRoundStats getFjRoundStats() {
        return fjRoundStats;
    }
}