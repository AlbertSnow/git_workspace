package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

public class RoundedImageView2 extends ImageView {
    private float mCornerRadius;

    public RoundedImageView2(Context context) {
        this(context, null);
    }

    public RoundedImageView2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    Paint mPaint = new Paint();
    PorterDuffXfermode mXfermode;
    DrawFilter mDrawFilter;
    float mStrokewidth;

    public RoundedImageView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mPaint.setColor(Color.WHITE);
        mPaint.setDither(true);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        mDrawFilter = new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
//         setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        mDrawFilter = new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
//            mCornerRadius = array.getDimension(R.styleable.RoundedImageView_corner_radius, 0);
        mCornerRadius = 50;
//            mStrokewidth = array.getDimension(R.styleable.RoundedImageView_stroke_width,0);
        mStrokewidth = 10;
    }

    private boolean mEnableRounded = true;

    public void setRoundEnable(boolean flag) {
        mEnableRounded = flag;
    }

    /**
     * mCornerRadius：控制图形的形状，取值为
     * 0   --   矩形
     * (0, width/2) --  圆角矩形
     * width/2     --   圆
     *
     * @param cornerRadius
     */
    public void setCornerRadius(float cornerRadius) {
        mCornerRadius = cornerRadius;
    }

    /**
     * mStrokewidth：控制图形边框的宽度，取值为
     * 0    --  无边框
     * >0   --  边框值
     *
     * @param strokewidth
     */
    public void setStrokewidth(float strokewidth) {
        mStrokewidth = strokewidth;
    }

    private final RectF mSaveLayerRect = new RectF();

    @Override
    protected void onDraw(Canvas canvas) {
        try {
            Drawable maiDrawable =  getDrawable();
            mPaint.setStrokeWidth(mStrokewidth);
            if (maiDrawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) maiDrawable).getBitmap();
                if (bitmap == null || bitmap.isRecycled()) return;

                final int width = getWidth();
                final int height = getHeight();
                final float offSet = mStrokewidth / 2;

                if (mCornerRadius > 0f) {
                    int saveCount = canvas.saveLayer(0, 0, getWidth(), getHeight(),
                            null, Canvas.HAS_ALPHA_LAYER_SAVE_FLAG);
                    Paint paint = ((BitmapDrawable) maiDrawable).getPaint();
                    DrawFilter drawFilter = canvas.getDrawFilter();
                    canvas.setDrawFilter(mDrawFilter);
                    mSaveLayerRect.set(0, 0, width, height);
                    canvas.drawRoundRect(mSaveLayerRect, mCornerRadius, mCornerRadius, paint);

                    Xfermode oldMode = paint.getXfermode();
                    paint.setAntiAlias(true);
                    paint.setColor(Color.BLACK);
                    paint.setXfermode(mXfermode);
                    super.onDraw(canvas);
                    paint.setXfermode(oldMode);
//                    Log.e("mStrokewidth", "mStrokewidth - onDraw:" + mStrokewidth);
                    if (mStrokewidth > 0f) {
//                        mSaveLayerRect.set(0 + offSet, 0 + offSet, width - offSet, height - offSet);
//                        canvas.drawRoundRect(mSaveLayerRect, mCornerRadius - offSet, mCornerRadius - offSet, mPaint);
                    }
                    canvas.setDrawFilter(drawFilter);
                    canvas.restoreToCount(saveCount);
                } else {
                    super.onDraw(canvas);
                }
            } else {
                super.onDraw(canvas);
            }
        } catch (Throwable e) {
            Log.e("RoundedImageView", "super.onDraw() error: ", e);
        }
    }
}
