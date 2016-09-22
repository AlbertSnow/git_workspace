package com.google.testprocess;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("testLife", "MainActivity onCreate");
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.main_jump_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        findViewById(R.id.log_adb_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestLogcat.recordLogcat();
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i("testLife", "---------------------MainActivity onSaveInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("testLife", "--------------protected---MainActivity onSaveInstanceState");
    }


}
