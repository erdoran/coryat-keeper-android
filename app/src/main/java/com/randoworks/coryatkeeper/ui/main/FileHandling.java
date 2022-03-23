package com.randoworks.coryatkeeper.ui.main;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {

    /*
    FILE FORMAT AS FOLLOWS

    Final score
    Jeopardy Round Score
    Double Jeopardy Round Score
    Final Jeopardy Correct
    J $200 Correct
    J $200 Incorrect
    J $400 Correct
    J $400 Incorrect
    J $600 Correct
    J $600 Incorrect
    J $800 Correct
    J $800 Incorrect
    J $1000 Correct
    J $1000 Incorrect
    J DD Correct
    J DD Incorrect
    DJ $400 Correct
    DJ $400 Incorrect
    DJ $800 Correct
    DJ $800 Incorrect
    DJ $1200 Correct
    DJ $1200 Incorrect
    DJ $1600 Correct
    DJ $1600 Incorrect
    DJ $2000 Correct
    DJ $2000 Incorrect
    DJ DD Correct
    DJ DD Incorrect

     */

    Context context;
    String fileName;
    int fileNum;

    FileOutputStream fos;
    FileInputStream fis;

    String text = "TEST";

    public FileHandling(Context context) {
        this.context = context;
        this.fileNum = context.fileList().length;
        this.fileName = "game" + fileNum;
    }

    public void writeFile(String data) {
        try {
            fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            fos.write(data.getBytes());
            Toast.makeText(context, "Game data saved", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public void readFile() {
        try {
            fis = context.openFileInput("game0");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                Log.d("READING: ", text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
