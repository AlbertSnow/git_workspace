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
    private List<String> mDatas;
    private int[] mColors = {android.R.color.darker_gray, android.R.color.holo_purple, android.R.color.holo_green_dark};

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
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.rootView = convertView.findViewById(R.id.adapter_view_root);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.list_item_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(mDatas.get(position));
        viewHolder.rootView.setBackgroundResource(mColors[position % mColors.length]);
        return convertView;
    }

    private class ViewHolder {
        View rootView;
        TextView textView;
    }
}
