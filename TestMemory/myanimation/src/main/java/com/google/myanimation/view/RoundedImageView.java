package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/10/10.
 */

public class RoundedImageView extends ImageView {

    private Path mClipPath;

    public RoundedImageView(Context context) {
        super(context);
        init();
    }

    public RoundedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RoundedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mClipPath = new Path();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        mClipPath.reset();
        float radius = Math.min((getMeasuredWidth() - getPaddingLeft() - getPaddingRight()) / 2f,
                (getMeasuredHeight() - getPaddingTop() - getPaddingBottom()) / 2f);
        mClipPath.addCircle((float)getMeasuredWidth() / 2f, (float)getMeasuredHeight() / 2f, radius, Path.Direction.CCW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.clipPath(mClipPath);
        super.onDraw(canvas);
    }
}
