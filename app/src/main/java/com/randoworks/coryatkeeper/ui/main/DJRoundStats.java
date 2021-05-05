package com.randoworks.coryatkeeper.ui.main;

import java.util.ArrayList;

public class DJRoundStats {

    private int djRoundScore;

    private int value400Correct;
    private int value400Incorrect;

    private int value800Correct;
    private int value800Incorrect;

    private int value1200Correct;
    private int value1200Incorrect;

    private int value1600Correct;
    private int value1600Incorrect;

    private int value2000Correct;
    private int value2000Incorrect;

    private ArrayList<DailyDouble> dailyDoubles;

    public DJRoundStats() {
        this.dailyDoubles = new ArrayList<DailyDouble>();
    }

    class DailyDouble {
        private Boolean correct;
        private int wager;

        public DailyDouble() {
            this.correct = null;
        }

        public Boolean getCorrect() {
            return correct;
        }

        public void setCorrect(Boolean correct) {
            this.correct = correct;
        }

        public int getWager() {
            return wager;
        }

        public void setWager(int wager) {
            this.wager = wager;
        }
    }

    public int getDjRoundScore() {
        return djRoundScore;
    }

    public void setDjRoundScore(int djRoundScore) {
        this.djRoundScore = djRoundScore;
    }

    public int getValue400Correct() {
        return value400Correct;
    }

    public void setValue400Correct(int value400Correct) {
        this.value400Correct = value400Correct;
    }

    public int getValue400Incorrect() {
        return value400Incorrect;
    }

    public void setValue400Incorrect(int value400Incorrect) {
        this.value400Incorrect = value400Incorrect;
    }

    public int getValue800Correct() {
        return value800Correct;
    }

    public void setValue800Correct(int value800Correct) {
        this.value800Correct = value800Correct;
    }

    public int getValue800Incorrect() {
        return value800Incorrect;
    }

    public void setValue800Incorrect(int value800Incorrect) {
        this.value800Incorrect = value800Incorrect;
    }

    public int getValue1200Correct() {
        return value1200Correct;
    }

    public void setValue1200Correct(int value1200Correct) {
        this.value1200Correct = value1200Correct;
    }

    public int getValue1200Incorrect() {
        return value1200Incorrect;
    }

    public void setValue1200Incorrect(int value1200Incorrect) {
        this.value1200Incorrect = value1200Incorrect;
    }

    public int getValue1600Correct() {
        return value1600Correct;
    }

    public void setValue1600Correct(int value1600Correct) {
        this.value1600Correct = value1600Correct;
    }

    public int getValue1600Incorrect() {
        return value1600Incorrect;
    }

    public void setValue1600Incorrect(int value1600Incorrect) {
        this.value1600Incorrect = value1600Incorrect;
    }

    public int getValue2000Correct() {
        return value2000Correct;
    }

    public void setValue2000Correct(int value2000Correct) {
        this.value2000Correct = value2000Correct;
    }

    public int getValue2000Incorrect() {
        return value2000Incorrect;
    }

    public void setValue2000Incorrect(int value2000Incorrect) {
        this.value2000Incorrect = value2000Incorrect;
    }

    public ArrayList<DailyDouble> getDailyDoubles() {
        return dailyDoubles;
    }

    public void setDailyDoubles(ArrayList<DailyDouble> dailyDoubles) {
        this.dailyDoubles = dailyDoubles;
    }
}
