package com.google.customadapterview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;

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

////        mInLayout = true;
//        final int adapterCount = mAdapter.getCount();
//        if (adapterCount == 0) {
//            removeAllViewsInLayout();
////            removeAndAddToCache(0);
//        } else {
////            removeAndAddToCache(0);
//            layoutChildren(0, adapterCount);
//        }
        View cache0 = getChildAt(0);
        View newUnderChild0 = mAdapter.getView(0, cache0, this);
        if (cache0 == null) {
            addViewInLayout(newUnderChild0, 0, newUnderChild0.getLayoutParams());
        }
        int childWidthSpec = getChildMeasureSpec(widthMeasureSpec, getPaddingTop() + getPaddingBottom(), newUnderChild0.getLayoutParams().width);
        int childHeightSpec = getChildMeasureSpec(heightMeasureSpec, getPaddingLeft() + getPaddingRight(), newUnderChild0.getLayoutParams().height);
        newUnderChild0.measure(childWidthSpec, childHeightSpec);
        newUnderChild0.layout(0,0,newUnderChild0.getMeasuredWidth(),newUnderChild0.getMeasuredHeight());

        View cache1 = getChildAt(1);
        View newUnderChild1 = mAdapter.getView(1, cache1, this);
        if (cache0 == null) {
            addViewInLayout(newUnderChild1, 1, newUnderChild1.getLayoutParams());
        }
        int childWidthSpec1 = getChildMeasureSpec(widthMeasureSpec, getPaddingTop() + getPaddingBottom(), newUnderChild1.getLayoutParams().width);
        int childHeightSpec1 = getChildMeasureSpec(heightMeasureSpec, getPaddingLeft() + getPaddingRight(), newUnderChild1.getLayoutParams().height);
        newUnderChild1.measure(childWidthSpec1, childHeightSpec1);
        newUnderChild1.layout(0,newUnderChild0.getMeasuredHeight() + 5, newUnderChild1.getMeasuredWidth(),
                newUnderChild0.getMeasuredHeight() + 5 + newUnderChild1.getMeasuredHeight());

        View cache2 = getChildAt(2);
        View newUnderChild2 = mAdapter.getView(2, cache2, this);
        if (cache0 == null) {
            addViewInLayout(newUnderChild2, 2, newUnderChild2.getLayoutParams());
        }
        int childWidthSpec2 = getChildMeasureSpec(widthMeasureSpec, getPaddingTop() + getPaddingBottom(), newUnderChild2.getLayoutParams().width);
        int childHeightSpec2 = getChildMeasureSpec(heightMeasureSpec, getPaddingLeft() + getPaddingRight(), newUnderChild2.getLayoutParams().height);
        newUnderChild2.measure(childWidthSpec2, childHeightSpec2);
        newUnderChild2.layout(0,newUnderChild0.getMeasuredHeight() + 5 + newUnderChild1.getMeasuredHeight() + 5,
                newUnderChild2.getMeasuredWidth(), newUnderChild0.getMeasuredHeight() + 5 + newUnderChild2.getMeasuredHeight() + 5 + newUnderChild2.getMeasuredHeight());
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    private void makeAndAddView(View child, int index) {

        ViewGroup.LayoutParams lp = (ViewGroup.LayoutParams) child.getLayoutParams();
        addViewInLayout(child, 0, lp, true);

        final boolean needToMeasure = child.isLayoutRequested();
        if (needToMeasure) {
            int childWidthSpec = getChildMeasureSpec(widthMeasureSpec,
//                    getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin,
                    getPaddingLeft() + getPaddingRight(),
                    lp.width);
            int childHeightSpec = getChildMeasureSpec(heightMeasureSpec,
//                    getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin,
                    getPaddingTop() + getPaddingBottom(),
                    lp.height);
            child.measure(childWidthSpec, childHeightSpec);
        } else {
            cleanupLayoutState(child);
        }

        int w = child.getMeasuredWidth();
        int h = child.getMeasuredHeight();

        int gravity = Gravity.TOP | Gravity.START;
//        }

        int layoutDirection = 0;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN)
            layoutDirection = getLayoutDirection();
        final int absoluteGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection);
        final int verticalGravity = gravity & Gravity.VERTICAL_GRAVITY_MASK;

        int childLeft;
        int childTop;
        switch (absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
            case Gravity.CENTER_HORIZONTAL:
                childLeft = (getWidth() + getPaddingLeft() - getPaddingRight()  - w) / 2;
//                        lp.leftMargin - lp.rightMargin;
                break;
            case Gravity.END:
                childLeft = getWidth() + getPaddingRight() - w;
//                        - lp.rightMargin;
                break;
            case Gravity.START:
            default:
                childLeft = getPaddingLeft();
//                        + lp.leftMargin;
                break;
        }
        switch (verticalGravity) {
            case Gravity.CENTER_VERTICAL:
                childTop = (getHeight() + getPaddingTop() - getPaddingBottom()  - h) / 2 + 0;
//                        lp.topMargin - lp.bottomMargin;
                break;
            case Gravity.BOTTOM:
//                childTop = getHeight() - getPaddingBottom() - h - lp.bottomMargin;
                childTop = getHeight();
                break;
            case Gravity.TOP:
            default:
                childTop = getPaddingTop();
//                + lp.topMargin;
                break;
        }
        child.layout(childLeft, childTop, childLeft + w, childTop + h);
    }




}
