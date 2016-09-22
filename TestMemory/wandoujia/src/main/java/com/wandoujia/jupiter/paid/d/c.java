package com.wandoujia.jupiter.paid.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.wandoujia.p4.a;
import java.net.URL;
import java.net.URLConnection;

final class c extends AsyncTask<Void, Void, Boolean>
{
  private Bitmap a;

  c(String paramString, d paramd)
  {
  }

  private Boolean a()
  {
    try
    {
      URLConnection localURLConnection = new URL(this.b).openConnection();
      localURLConnection.connect();
      this.a = BitmapFactory.decodeStream(localURLConnection.getInputStream());
      if (Build.VERSION.SDK_INT >= 11)
      {
        float f1 = a.a().getResources().getDimension(17104901);
        float f2 = a.a().getResources().getDimension(17104902);
        if ((f1 < this.a.getWidth()) || (f2 < this.a.getHeight()))
        {
          float f3 = Math.min(f1 / this.a.getWidth(), f2 / this.a.getHeight());
          Matrix localMatrix = new Matrix();
          localMatrix.setScale(f3, f3);
          Bitmap localBitmap = Bitmap.createBitmap(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), localMatrix, true);
          this.a.recycle();
          this.a = localBitmap;
        }
      }
      Boolean localBoolean = Boolean.valueOf(true);
      return localBoolean;
    }
    catch (Throwable localThrowable)
    {
    }
    return Boolean.valueOf(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.d.c
 * JD-Core Version:    0.6.0
 */