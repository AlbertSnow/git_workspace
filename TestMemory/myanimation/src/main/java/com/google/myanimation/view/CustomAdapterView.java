package com.google.myanimation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

/**
 * Created by Administrator on 2016/9/26.
 */

public class CustomAdapterView extends AdapterView {

    private int heightMeasureSpec;
    private int widthMeasureSpec;

    public CustomAdapterView(Context context) {
        super(context);
    }

    public CustomAdapterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomAdapterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
    }

    @Override
    public Adapter getAdapter() {
        return null;
    }

    @Override
    public void setAdapter(Adapter adapter) {

    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setSelection(int position) {

    }
}
