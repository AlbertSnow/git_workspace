package com.google.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleActivity extends AppCompatActivity {
    
    private RecyclerView mRecyclerView;
    private MyRecycleAdapter mAdapter;
    private List<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        initView();
    }

    private void initView() {
        datas.add("hello1");
        datas.add("hello2");
        datas.add("hello3");
        datas.add("hello4");
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyRecycleAdapter(datas);
        mRecyclerView.setAdapter(mAdapter);
    }
}
