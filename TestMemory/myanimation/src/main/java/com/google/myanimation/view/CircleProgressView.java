package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.google.myanimation.R;

/**
 * Created by Administrator on 2016/8/23.
 */

public class CircleProgressView extends ImageView {
    private Paint mUnDownloadBorderPaint;
    private Paint mDownloadingBorderPaint;
    private Paint mInnerShapePaint;

    private boolean isDownloading;

    private float mProgress = 30;

    private float mHeight;
    private float mWidth;

    private float mRadius;

    private float mCenterX;
    private float mCenterY;
    //    private RectF mCircleRectF;
    private RectF mCircleRectF;
    private Path mPath;

    private int mStrokeWidth = 1;

    public CircleProgressView(Context context) {
        super(context);
        init();
    }

    public CircleProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircleProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public CircleProgressView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mUnDownloadBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mUnDownloadBorderPaint.setStyle(Paint.Style.STROKE);
        mUnDownloadBorderPaint.setColor(0xffA4A9Ac);
        mUnDownloadBorderPaint.setStrokeWidth(mStrokeWidth);

        mDownloadingBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mDownloadingBorderPaint.setStyle(Paint.Style.STROKE);
        mDownloadingBorderPaint.setColor(0xff3488EB);
        mDownloadingBorderPaint.setStrokeWidth(mStrokeWidth);

        mInnerShapePaint = new Paint();
        mInnerShapePaint.setStyle(Paint.Style.FILL);
        mInnerShapePaint.setColor(0xff3488EB);
    }

    public float getProgress() {
        return mProgress;
    }

    /**
     * @param progress 取值范围 0-100，代表进度的百分比值
     */
    public void setProgress(float progress) {
        this.mProgress = progress;
        invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w - getPaddingLeft() - getPaddingRight();
        mHeight = h - getPaddingTop() - getPaddingBottom();
        mRadius = Math.min(mWidth / 2, mHeight / 2);

        mCenterX = w / 2.0f;
        mCenterY = h / 2.0f;

        float scale = w / 48.f;
        Matrix matrix = new Matrix();
        matrix.postScale(scale, scale);
        mPath = new Path();
        mPath.addPath(PathParser.parsePath(DOWNLOAD_SUCEESS_PATH), matrix);

        mCircleRectF = new RectF(mCenterX - mRadius, mCenterY - mRadius, mCenterX + mRadius, mCenterY + mRadius);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        if (isDownloading) {
        drawDownloading(canvas);
    }

    private static final String DOWNLOAD_SUCEESS_PATH = "M21.49,26.71L17.27,22.49C16.29,21.51 14.71,21.51 13.73,22.49C12.75,23.47 12.76,25.05 13.74,26.03L19.39,31.67C19.46,31.75 19.55,31.82 19.63,31.89C19.67,31.93 19.7,31.96 19.73,32C20.72,32.98 22.29,32.97 23.27,31.99L35.99,19.27C36.98,18.29 36.97,16.71 36,15.73C35.01,14.75 33.44,14.76 32.46,15.74L21.49,26.71Z";
    private static final String DOWNLOADING_PATH = "M18,16L30,16A2,2 0,0 1,32 18L32,30A2,2 0,0 1,30 32L18,32A2,2 0,0 1,16 30L16,18A2,2 0,0 1,18 16z";


    private void drawDownloading(Canvas canvas) {
        float startAngle = getSweepAngle();
        canvas.drawArc(mCircleRectF, 0, startAngle, false, mDownloadingBorderPaint);
        canvas.drawArc(mCircleRectF, 0, startAngle - 360 , false, mUnDownloadBorderPaint);
        if (startAngle > 180) {
            setImageResource(R.drawable.download_finish_progress_shap);
        } else {
            setImageResource(R.drawable.downloading_progress_shape);
        }
    }

    public float getSweepAngle() {
        return mProgress / 100.0f * 360;
    }
}
