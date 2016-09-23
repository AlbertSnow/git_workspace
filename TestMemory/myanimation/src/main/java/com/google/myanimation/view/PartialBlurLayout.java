package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/9/22.
 */

public class PartialBlurLayout extends FrameLayout {

    private int mHeight;
    private int mWidth;

    public PartialBlurLayout(Context context) {
        super(context);
    }

    public PartialBlurLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PartialBlurLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    View childeView;
    int clipTop;

    @Override
    public void draw(Canvas canvas) {
        childeView = getChildAt(0);
        if (childeView != null) {
            clipTop = (int) (mHeight - childeView.getHeight() + childeView.getTranslationY());
        }
        canvas.clipRect(0, clipTop, mWidth, mHeight);
        super.draw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
