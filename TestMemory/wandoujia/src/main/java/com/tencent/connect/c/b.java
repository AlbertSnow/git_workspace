package com.tencent.connect.c;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.b.c;
import com.tencent.open.a.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public final class b
  implements com.tencent.open.utils.d
{
  b(a parama, Bundle paramBundle, String paramString1, String paramString2, com.tencent.tauth.b paramb, Activity paramActivity)
  {
  }

  private static int a(BitmapFactory.Options paramOptions, int paramInt)
  {
    int i = 1;
    double d1 = paramOptions.outWidth;
    double d2 = paramOptions.outHeight;
    int j;
    if (paramInt == -1)
      j = i;
    while (true)
    {
      if ((128 >= j) && (paramInt == -1))
        j = i;
      if (j <= 8)
      {
        while (i < j)
          i <<= 1;
        j = (int)Math.ceil(Math.sqrt(d1 * d2 / paramInt));
        continue;
      }
      i = 8 * ((j + 7) / 8);
    }
    return i;
  }

  public static Bitmap a(String paramString, int paramInt)
  {
    Object localObject;
    if (TextUtils.isEmpty(paramString))
      localObject = null;
    while (true)
    {
      return localObject;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      try
      {
        BitmapFactory.decodeFile(paramString, localOptions);
        label32: int i = localOptions.outWidth;
        int j = localOptions.outHeight;
        if ((localOptions.mCancel) || (localOptions.outWidth == -1) || (localOptions.outHeight == -1))
          return null;
        if (i > j)
        {
          localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
          if (i > paramInt)
            localOptions.inSampleSize = a(localOptions, paramInt * paramInt);
          localOptions.inJustDecodeBounds = false;
        }
        try
        {
          Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
          localObject = localBitmap;
          if (localObject == null)
          {
            return null;
            i = j;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
          while (true)
            localObject = null;
          int k = localOptions.outWidth;
          int m = localOptions.outHeight;
          Matrix localMatrix;
          int n;
          int i1;
          if (k > m)
          {
            if (k <= paramInt)
              continue;
            localMatrix = new Matrix();
            n = localObject.getWidth();
            i1 = localObject.getHeight();
            if (n <= i1)
              break label239;
          }
          while (true)
          {
            float f1 = paramInt / n;
            localMatrix.postScale(f1, f1);
            return Bitmap.createBitmap(localObject, 0, 0, localObject.getWidth(), localObject.getHeight(), localMatrix, true);
            k = m;
            break;
            label239: n = i1;
          }
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        break label32;
      }
    }
  }

  protected static String a(Bitmap paramBitmap, String paramString1, String paramString2)
  {
    File localFile1 = new File(paramString1);
    if (!localFile1.exists())
      localFile1.mkdirs();
    String str = paramString1 + paramString2;
    File localFile2 = new File(str);
    if (localFile2.exists())
      localFile2.delete();
    if (paramBitmap != null);
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 80, localFileOutputStream);
      localFileOutputStream.flush();
      localFileOutputStream.close();
      paramBitmap.recycle();
      return str;
    }
    catch (IOException localIOException)
    {
      return null;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      label109: break label109;
    }
  }

  private static boolean b(String paramString, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    try
    {
      BitmapFactory.decodeFile(paramString, localOptions);
      label28: int i = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((localOptions.mCancel) || (localOptions.outWidth == -1) || (localOptions.outHeight == -1))
        return false;
      int k;
      if (i > j)
      {
        k = i;
        if (i >= j)
          break label143;
      }
      while (true)
      {
        f.b("openSDK_LOG.AsynScaleCompressImage", "longSide=" + k + "shortSide=" + i);
        localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
        if ((k <= paramInt2) && (i <= paramInt1))
          break label150;
        return true;
        k = j;
        break;
        label143: i = j;
      }
      label150: return false;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      break label28;
    }
  }

  public final void a(int paramInt, String paramString)
  {
    if (paramInt == 0)
      this.a.putString("imageLocalUrl", paramString);
    do
    {
      a.a(this.f, this.e, this.a, this.d);
      return;
    }
    while ((!TextUtils.isEmpty(this.b)) || (!TextUtils.isEmpty(this.c)));
    if (this.d != null)
    {
      this.d.a(new com.tencent.tauth.d(-6, "获取分享图片失败!"));
      f.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
    }
    com.tencent.open.b.d.a();
    com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", a.a(this.f).b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "获取分享图片失败!");
  }

  public final void a(ArrayList<String> paramArrayList)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.b
 * JD-Core Version:    0.6.0
 */