package com.google.customadapterview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import com.google.publiclibrary.ViewUtils;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/30.
 */

public class AbsAdapterView extends AdapterView {
    Adapter mAdapter;
    private int heightMeasureSpec;
    private int widthMeasureSpec;

    private ArrayList<View> cacheItems = new ArrayList<>();

    public AbsAdapterView(Context context) {
        super(context);
        init();

    }

    public AbsAdapterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AbsAdapterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
    }

    @Override
    public Adapter getAdapter() {
        return mAdapter;
    }

    @Override
    public void setAdapter(Adapter adapter) {
        mAdapter = adapter;
    }

    @Override
    public void setSelection(int position) {
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
    }

    @Override
    public View getSelectedView() {
        return mAdapter.getView(0, null, this);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (mAdapter == null) {
            return;
        }

        int delta = 0;
        for (int i = 0; i < 3; i++) {
            View cache = getChildAt(i);
            View newUnderChild = mAdapter.getView(i, cache, this);
            if (cache == null) {
                addViewInLayout(newUnderChild, i, newUnderChild.getLayoutParams());
            }
            int childWidthSpec = getChildMeasureSpec(widthMeasureSpec, getPaddingTop() + getPaddingBottom(), newUnderChild.getLayoutParams().width);
            int childHeightSpec = getChildMeasureSpec(heightMeasureSpec, getPaddingLeft() + getPaddingRight(), newUnderChild.getLayoutParams().height);
            newUnderChild.measure(childWidthSpec, childHeightSpec);
            newUnderChild.layout(0, delta, newUnderChild.getMeasuredWidth(), delta + newUnderChild.getMeasuredHeight());
            newUnderChild.setScaleX( (3- i) * 0.2f);
            newUnderChild.setScaleY( (3- i) * 0.2f);
            newUnderChild.offsetTopAndBottom(ViewUtils.dip2px(getContext(), i * 20f));
        }
    }

}
