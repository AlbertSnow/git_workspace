package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import com.google.myanimation.R;

/**
 * Created by Administrator on 2016/8/24.
 */

public class BackGroundView extends FrameLayout {
    Drawable  backgroundDrawable;
    private Paint testPaint;
    private Bitmap mBackGroundBitmap;

    public BackGroundView(Context context) {
        super(context);
        init();
    }

    public BackGroundView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BackGroundView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        mBackGroundBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        testPaint = new Paint();
    }

    @Override
    public void setTranslationY(float translationY) {
        super.setTranslationY(translationY);
        invalidate();
        Log.i("test", "setTranslationY getTranslationY: " + getTranslationY());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float translationY = getTranslationY();
        if (translationY != 0) {
            canvas.save();
            canvas.translate(0, -translationY);
            canvas.drawBitmap(mBackGroundBitmap, 0, 0, testPaint);
            canvas.restore();
            invalidate();
        } else {
            canvas.drawBitmap(mBackGroundBitmap, 0, 0, testPaint);
        }
    }
}
