package com.randoworks.coryatkeeper.ui.main;


public class JRoundStats {

    private final int TWO_HUNDRED = 200;
    private final int FOUR_HUNDRED = 400;
    private final int SIX_HUNDRED = 600;
    private final int EIGHT_HUNDRED = 800;
    private final int ONE_THOUSAND = 1000;

    private Integer jRoundScore = 0;

     int value200Correct = 0;
     int value200Attempted = 0;

     int value400Correct = 0;
     int value400Attempted = 0;

     int value600Correct = 0;
     int value600Attempted = 0;

     int value800Correct = 0;
     int value800Attempted = 0;

     int value1000Correct = 0;
     int value1000Attempted = 0;

     int valueDDCorrect = 0;
     int valueDDAttempted = 0;

    private int value200Score = 0;
    private int value400Score = 0;
    private int value600Score = 0;
    private int value800Score = 0;
    private int value1000Score = 0;


    private int ddWager;
    private Boolean ddCorrect;

    public JRoundStats() {
        
    }

    private void calculateJRoundScore() {
        jRoundScore = value200Score
                + value400Score
                + value600Score
                + value800Score
                + value1000Score;
    }

    public Integer getJRoundScore() {
        return jRoundScore;
    }

    private void calculate200Score() {
        value200Score = (TWO_HUNDRED * value200Correct) - (TWO_HUNDRED * (value200Attempted-value200Correct));
    }

    private void calculate400Score() {
        value400Score = (FOUR_HUNDRED * value400Correct) - (FOUR_HUNDRED * (value400Attempted-value400Correct));
    }

    private void calculate600Score() {
        value600Score =  (SIX_HUNDRED * value600Correct) - (SIX_HUNDRED * (value600Attempted-value600Correct));
    }

    private void calculate800Score() {
        value800Score = (EIGHT_HUNDRED * value800Correct) - (EIGHT_HUNDRED * (value800Attempted-value800Correct));
    }

    private void calculate1000Score() {
        value1000Score =  (ONE_THOUSAND * value1000Correct) - (ONE_THOUSAND * (value1000Attempted-value1000Correct));
    }

    public void jCorrect200() {
        value200Correct++;
        value200Attempted++;
        calculate200Score();
        calculateJRoundScore();
    }

    public void jIncorrect200() {
        value200Attempted++;
        calculate200Score();
        calculateJRoundScore();
    }

    public void jCorrect400() {
        value400Correct++;
        value400Attempted++;
        calculate400Score();
        calculateJRoundScore();
    }

    public void jIncorrect400() {
        value400Attempted++;
        calculate400Score();
        calculateJRoundScore();
    }

    public void jCorrect600() {
        value600Correct++;
        value600Attempted++;
        calculate600Score();
        calculateJRoundScore();
    }

    public void jIncorrect600() {
        value600Attempted++;
        calculate600Score();
        calculateJRoundScore();
    }

    public void jCorrect800() {
        value800Correct++;
        value800Attempted++;
        calculate800Score();
        calculateJRoundScore();
    }

    public void jIncorrect800() {
        value800Attempted++;
        calculate800Score();
        calculateJRoundScore();
    }

    public void jCorrect1000() {
        value1000Correct++;
        value1000Attempted++;
        calculate1000Score();
        calculateJRoundScore();
    }

    public void jIncorrect1000() {
        value1000Attempted++;
        calculate1000Score();
        calculateJRoundScore();
    }

    public void jDDCorrect() {
        valueDDCorrect++;
        valueDDAttempted++;
    }

    public void jDDIncorrect() {
        valueDDAttempted++;
    }

}
