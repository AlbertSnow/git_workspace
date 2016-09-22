package com.google.myanimation;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FiveActivity extends AppCompatActivity {

    private ViewGroup mRootView;
    private View mChangeColorBtn;

    private final int[] colors = new int[]{android.R.color.black, android.R.color.white, android.R.color.holo_red_light};
    int colorIndex = 0;
    private TextView mTitleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        initView();
    }


    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.root_view);
        mChangeColorBtn = findViewById(R.id.change_color_btn);
        mTitleView = (TextView) findViewById(R.id.title_view);

        mChangeColorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = colorIndex % colors.length;
                mRootView.setBackgroundColor(getResources().getColor(colors[index]));
//                mRootView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                colorIndex++;
                if (colorIndex == Integer.MAX_VALUE) {
                    colorIndex = 0;
                }

                mRootView.setDrawingCacheEnabled(true);
                mRootView.buildDrawingCache();
                Bitmap bitmap = mRootView.getDrawingCache();
                setMainColor(mTitleView, bitmap);

            }
        });
    }

    public void setMainColor(final TextView view, Bitmap bitmap) {
        //首先获取一个Palette.Builder（稍后用到）
        Palette.Builder b = new Palette.Builder(bitmap);
        //设置好我们需要获取到多少种颜色
        b.maximumColorCount(1);
        Log.d("test", String.valueOf(b.generate().getSwatches().size()));
        //异步的进行颜色分析
        b.generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                //获取颜色列表的第一个
                Palette.Swatch swatch = palette.getSwatches().get(0);
                Log.i("test", "Color: " + Integer.toHexString(swatch.getRgb()));

                if (swatch != null) {
                    view.setTextColor(swatch.getTitleTextColor());
                } else {
                    Log.e("test", "swatch为空");
                }
            }
        });
    }
}
