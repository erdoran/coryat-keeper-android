package com.randoworks.coryatkeeper.ui.main;

import android.util.Log;

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
        // TODO: There can be issues trying to work with nulls if certain conditions are met - causing a crash
        if (djRoundStats.getDjRoundScore() == null) {
            if (!isNegative(jRoundStats.getJRoundScore())) {
                return "$" + String.valueOf(jRoundStats.getJRoundScore());
            } else {
                return "-$" + String.valueOf(Math.abs(jRoundStats.getJRoundScore()));
            }
        }
        else if (jRoundStats.getJRoundScore() == null) {
            if (!isNegative(djRoundStats.getDjRoundScore())) {
                return "$" + String.valueOf(djRoundStats.getDjRoundScore());
            } else {
                return "-$" + String.valueOf(Math.abs(djRoundStats.getDjRoundScore()));
            }
        }
        else {
            if (!isNegative((jRoundStats.getJRoundScore()) + (djRoundStats.getDjRoundScore()))) {
                return "$" + String.valueOf(jRoundStats.getJRoundScore() + (djRoundStats.getDjRoundScore()));
            }
            else {
                return "-$" + String.valueOf(Math.abs(jRoundStats.getJRoundScore() + (djRoundStats.getDjRoundScore())));
            }
        }
    }

    public boolean isNegative(Integer score) {
        return score < 0;
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