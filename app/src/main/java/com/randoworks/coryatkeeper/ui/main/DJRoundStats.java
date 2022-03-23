package com.randoworks.coryatkeeper.ui.main;

import android.util.Log;

import java.util.ArrayList;

public class DJRoundStats {

    private final int FOUR_HUNDRED = 400;
    private final int EIGHT_HUNDRED = 800;
    private final int TWELVE_HUNDRED = 1200;
    private final int SIXTEEN_HUNDRED = 1600;
    private final int TWO_THOUSAND = 2000;

    private Integer djRoundScore = 0;

    private int value400Correct = 0;

    public int getValue400Correct() {
        return value400Correct;
    }

    public int getValue400Attempted() {
        return value400Attempted;
    }

    public int getValue800Correct() {
        return value800Correct;
    }

    public int getValue800Attempted() {
        return value800Attempted;
    }

    public int getValue1200Correct() {
        return value1200Correct;
    }

    public int getValue1200Attempted() {
        return value1200Attempted;
    }

    public int getValue1600Correct() {
        return value1600Correct;
    }

    public int getValue1600Attempted() {
        return value1600Attempted;
    }

    public int getValue2000Correct() {
        return value2000Correct;
    }

    public int getValue2000Attempted() {
        return value2000Attempted;
    }

    public int getValueDDCorrect() {
        return valueDDCorrect;
    }

    public int getValueDDAttempted() {
        return valueDDAttempted;
    }

    private int value400Attempted = 0;

    private int value800Correct = 0;
    private int value800Attempted = 0;

    private int value1200Correct = 0;
    private int value1200Attempted = 0;

    private int value1600Correct = 0;
    private int value1600Attempted = 0;

    private int value2000Correct = 0;
    private int value2000Attempted = 0;

    private int valueDDCorrect = 0;
    private int valueDDAttempted = 0;

    private int value400Score = 0;
    private int value800Score = 0;
    private int value1200Score = 0;
    private int value1600Score = 0;
    private int value2000Score = 0;

    public DJRoundStats() {
    }

    private void calculateDJRoundScore() {
        djRoundScore = value400Score
                + value800Score
                + value1200Score
                + value1600Score
                + value2000Score;
        // TODO: SOMETHING ABOUT DDs
    }

    public Integer getDjRoundScore() {
        return djRoundScore;
    }

    private void calculate400Score(){
        value400Score = (FOUR_HUNDRED * value400Correct) - (FOUR_HUNDRED *(value400Attempted-value400Correct));
    }

    private void calculate800Score(){
        value800Score = (EIGHT_HUNDRED * value800Correct) - (EIGHT_HUNDRED * (value800Attempted-value800Correct));
    }

    private void calculate1200Score(){
        value1200Score = (TWELVE_HUNDRED * value1200Correct) - (TWELVE_HUNDRED * (value1200Attempted-value1200Correct));
    }

    private void calculate1600Score(){
        value1600Score = (SIXTEEN_HUNDRED * value1600Correct) - (SIXTEEN_HUNDRED * (value1600Attempted-value1600Correct));
    }

    private void calculate2000Score(){
        value2000Score = (TWO_THOUSAND * value2000Correct) - (TWO_THOUSAND * (value2000Attempted-value2000Correct));
    }

    public void djCorrect400() {
        value400Correct++;
        value400Attempted++;
        calculate400Score();
        calculateDJRoundScore();
    }

    public void djCorrect800() {
        value800Correct++;
        value800Attempted++;
        calculate800Score();
        calculateDJRoundScore();
    }

    public void djCorrect1200() {
        value1200Correct++;
        value1200Attempted++;
        calculate1200Score();
        calculateDJRoundScore();

    }
    public void djCorrect1600() {
        value1600Correct++;
        value1600Attempted++;
        calculate1600Score();
        calculateDJRoundScore();

    }
    public void djCorrect2000() {
        value2000Correct++;
        value2000Attempted++;
        calculate2000Score();
        calculateDJRoundScore();
    }

    public void djDDCorrect() {
        valueDDCorrect++;
        valueDDAttempted++;
    }

    public void djIncorrect400() {
        value400Attempted++;
        calculate400Score();
        calculateDJRoundScore();
    }

    public void djIncorrect800() {
        value800Attempted++;
        calculate800Score();
        calculateDJRoundScore();
    }

    public void djIncorrect1200() {
        value1200Attempted++;
        calculate1200Score();
        calculateDJRoundScore();
    }

    public void djIncorrect1600() {
        value1600Attempted++;
        calculate1600Score();
        calculateDJRoundScore();
    }

    public void djIncorrect2000() {
        value2000Attempted++;
        calculate2000Score();
        calculateDJRoundScore();
    }

    public void djDDIncorrect() {
        valueDDAttempted++;
    }
}
