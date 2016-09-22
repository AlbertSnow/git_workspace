package com.example.administrator.testmemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    private ArrayList<String> testString = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        testLoad();
    }

    private void testLoad() {
        for (int i = 0; i < 300; i++) {
            testString.add("HelloWorld HelloWorlddsfadsfawefasdfasdfwerfasfdasfasdfasdfaewfwesf");
        }
    }
}
