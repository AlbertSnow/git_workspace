package com.google.myanimation.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

import com.google.myanimation.MyApplication;

import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2016/9/22.
 */

public class BlurUtils {
    /**
     * @param isBlur 是否进行高斯模糊
     * @return  可能返回null，需要判空
     */
    public Bitmap getFrame(boolean isBlur, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }

        Bitmap blurBitmap;
        if (isBlur) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 10, bos);
            byte[] bytes = bos.toByteArray();
            bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
            blurBitmap = blur(bitmap, 25);
            bitmap.recycle();
            return blurBitmap;
        } else {
            return bitmap;
        }
    }

    public static final float BITMAP_SCALE = 0.25f;

    public static Bitmap blur(Bitmap sentBitmap, int radius) {
        return blur(sentBitmap, radius, BITMAP_SCALE);
    }

    /**
     * @param sentBitmap
     * @param radius
     * @param scale 1--25 越大越模糊
     * @return
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static Bitmap blur(Bitmap sentBitmap, int radius, float scale) {
        try {
            RenderScript rs = RenderScript.create(MyApplication.getApplicaionContext());
            int width = Math.round(sentBitmap.getWidth() * scale);
            int height = Math.round(sentBitmap.getHeight() * scale);

            final Bitmap inputBitmap = Bitmap.createScaledBitmap(sentBitmap, width, height, false);
            final Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);

            Allocation input = Allocation.createFromBitmap(rs, inputBitmap);
            Allocation output = Allocation.createTyped(rs, input.getType());
            ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(
                    rs, input.getElement());
            blur.setInput(input);
            blur.setRadius(radius);
            blur.forEach(output);
            output.copyTo(outputBitmap);
            return outputBitmap;
        } catch (Throwable throwable) {
        }
        return sentBitmap;
    }

}
