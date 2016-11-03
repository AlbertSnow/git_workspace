package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

import com.google.myanimation.R;

/**
 * Created by Administrator on 2016/10/27.
 */

public class CustomListView extends RecyclerView {
    private Bitmap mBitmap;
    private int mChildHeightCount;

    public CustomListView(Context context) {
        super(context);
        init();
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        setLayerType(LAYER_TYPE_NONE, null);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    public void draw(Canvas canvas) {
//        canvas.save();
//        for (int i=0; i<7; i++) {
//            View childView = getChildAt(i);
//            if (childView == null) {
//                continue;
//            }
//            int x = (int) childView.getX();
//            int y = (int) childView.getY();
//            canvas.clipRect(new Rect(x, y + 160, x + childView.getWidth(), y+childView.getHeight()), Region.Op.XOR);
//        }
////        canvas.drawBitmap(mBitmap, 0, -1 * computeVerticalScrollOffset(), null);
//        canvas.drawBitmap(mBitmap, 0, 0, null);
//        canvas.restore();
        super.draw(canvas);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);

        mChildHeightCount = 0;
        for (int i = 0; i<getChildCount(); i++) {
            mChildHeightCount += getChildAt(i).getMeasuredHeight();
        }
        Log.i("test", "--------------begin-------------");
        Log.i("test", "childCount: " + getChildCount());
        Log.i("test", "childHeightCount: " + mChildHeightCount);
        Log.i("test", "thisHeight: " + getMeasuredHeight());
        Log.i("test", "--------------end-------------");
    }
}
