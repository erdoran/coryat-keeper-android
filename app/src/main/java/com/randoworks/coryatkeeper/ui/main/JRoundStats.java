package com.randoworks.coryatkeeper.ui.main;

import android.util.Log;

public class JRoundStats {

    private final int TWO_HUNDRED = 200;
    private final int FOUR_HUNDRED = 400;
    private final int SIX_HUNDRED = 600;
    private final int EIGHT_HUNDRED = 800;
    private final int ONE_THOUSAND = 1000;

    private Integer jRoundScore;

    private int value200Correct;
    private int value200Incorrect;

    private int value400Correct;
    private int value400Incorrect;

    private int value600Correct;
    private int value600Incorrect;

    private int value800Correct;
    private int value800Incorrect;

    private int value1000Correct;
    private int value1000Incorrect;

    private int value200Score;
    private int value400Score;
    private int value600Score;
    private int value800Score;
    private int value1000Score;


    private int ddWager;
    private Boolean ddCorrect;

    public JRoundStats() {
        this.ddCorrect = null;
    }

    private void calculateJRoundScore() {
        jRoundScore = value200Score
                + value400Score
                + value600Score
                + value800Score
                + value1000Score;

        if (!(ddCorrect == null)) {
            if (ddCorrect) {
                jRoundScore += ddWager;
            } else {
                jRoundScore -= ddWager;
            }
        }
        Log.d("SCORE", String.valueOf(jRoundScore));
    }

    public Integer getJRoundScore() {
        return jRoundScore;
    }

    private void calculate200Score() {
        value200Score = (TWO_HUNDRED * value200Correct) - (TWO_HUNDRED * value200Incorrect);
    }

    private void calculate400Score() {
        value400Score = (FOUR_HUNDRED * value400Correct) - (FOUR_HUNDRED * value400Incorrect);
    }

    private void calculate600Score() {
        value600Score =  (SIX_HUNDRED * value600Correct) - (SIX_HUNDRED * value600Incorrect);
    }

    private void calculate800Score() {
        value800Score = (EIGHT_HUNDRED * value800Correct) - (EIGHT_HUNDRED * value800Incorrect);
    }

    private void calculate1000Score() {
        value1000Score =  (ONE_THOUSAND * value1000Correct) - (ONE_THOUSAND * value1000Incorrect);
    }

    public void jCorrect200() {
        value200Correct++;
        calculate200Score();
        calculateJRoundScore();
    }

    public void jIncorrect200() {
        value200Incorrect++;
        calculate200Score();
    }

    public void jCorrect400() {
        value400Correct++;
        calculate400Score();
        calculateJRoundScore();
    }

    public void jIncorrect400() {
        value400Incorrect++;
        calculate400Score();
        calculateJRoundScore();
    }

    public void jCorrect600() {
        value600Correct++;
        calculate600Score();
        calculateJRoundScore();
    }

    public void jIncorrect600() {
        value600Incorrect++;
        calculate600Score();
    }

    public void jCorrect800() {
        value800Correct++;
        calculate800Score();
        calculateJRoundScore();
    }

    public void jIncorrect800() {
        value800Incorrect++;
        calculate800Score();
        calculateJRoundScore();
    }

    public void jCorrect1000() {
        value1000Correct++;
        calculate1000Score();
        calculateJRoundScore();
    }

    public void jIncorrect1000() {
        value1000Incorrect++;
        calculate1000Score();
    }

}
