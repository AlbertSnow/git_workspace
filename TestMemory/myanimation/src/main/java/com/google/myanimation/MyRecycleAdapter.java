package com.google.myanimation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/19.
 */

public class MyRecycleAdapter extends RecyclerView.Adapter {
    private List<String> mDatas;

    public MyRecycleAdapter(List<String> datas) {
        mDatas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewGroup layout = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_view_holder, parent, false);
        return new SimpleViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SimpleViewHolder simpleViewHolder = (SimpleViewHolder) holder;
        simpleViewHolder.mTextView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    private static class SimpleViewHolder extends RecyclerView.ViewHolder{

        final TextView mTextView;

        SimpleViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
