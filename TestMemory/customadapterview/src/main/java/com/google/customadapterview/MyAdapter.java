package com.google.customadapterview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30.
 */

public class MyAdapter extends BaseAdapter {
    List<String> mDatas;

    public MyAdapter(List<String> datas) {
//        mDatas = datas;
        mDatas = new ArrayList<>(5);
        mDatas.add("1");
        mDatas.add("2");
        mDatas.add("3");
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View subView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ((TextView)subView.findViewById(R.id.list_item_text)).setText(mDatas.get(position));
        return subView;
    }
}
