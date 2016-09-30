package com.google.customadapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AbsAdapterView mListView;
    private List<String> datas;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mListView = (AbsAdapterView) findViewById(R.id.custom_list);
        datas = new ArrayList<>(20);
        initData(5);
        mAdapter = new MyAdapter(datas);
        mListView.setAdapter(mAdapter);
    }

    private void initData(int count) {
        for (int i = 0; i < count; i++) {
            datas.add(i + " ");
        }
    }
}
