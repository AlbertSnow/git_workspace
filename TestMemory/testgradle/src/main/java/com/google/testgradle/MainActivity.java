package com.google.testgradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.log_txt).setVisibility(View.VISIBLE);
        updateLog();
    }

    private void updateLog() {
        try {
            Process process = Runtime.getRuntime().exec("logcat -d");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log = new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            TextView tv = (TextView) findViewById(R.id.log_txt);
            tv.setText(log.toString());
        } catch (IOException e) {
        }
    }
}
