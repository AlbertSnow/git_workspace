package com.google.testopengl;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File testFile = new File(getFilesDir(), "test.txt");
        Log.i("test", Uri.fromFile(testFile).toString());
        initView();
    }

    private void initView() {
        findViewById(R.id.gl_surface_view);
    }
}
