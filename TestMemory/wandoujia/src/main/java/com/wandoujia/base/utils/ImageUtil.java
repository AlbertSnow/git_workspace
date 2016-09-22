package com.wandoujia.base.utils;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.wandoujia.base.config.GlobalConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ImageUtil
{
  private static final String MAPS_CLASS_NAME = "com.google.android.maps.MapsActivity";
  private static final String MAPS_PACKAGE_NAME = "com.google.android.apps.maps";
  private static final String TAG = "db.Util";

  public static byte[] bitmapToPNGBytes(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    return null;
  }

  public static Bitmap bytes2Bimap(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    return null;
  }

  private static int computeInitialSampleSize(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    double d1 = paramOptions.outWidth;
    double d2 = paramOptions.outHeight;
    int i;
    int j;
    if (paramInt2 == -1)
    {
      i = 1;
      if (paramInt1 != -1)
        break label60;
      j = 128;
      label31: if (j >= i)
        break label84;
    }
    label60: label84: 
    do
    {
      return i;
      i = (int)Math.ceil(Math.sqrt(d1 * d2 / paramInt2));
      break;
      j = (int)Math.min(Math.floor(d1 / paramInt1), Math.floor(d2 / paramInt1));
      break label31;
      if ((paramInt2 == -1) && (paramInt1 == -1))
        return 1;
    }
    while (paramInt1 == -1);
    return j;
  }

  private static int computeSampleSize(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int i = computeInitialSampleSize(paramOptions, paramInt1, paramInt2);
    if (i <= 8)
    {
      j = 1;
      while (j < i)
        j <<= 1;
    }
    int j = 8 * ((i + 7) / 8);
    return j;
  }

  private static int computeSampleSize(InputStream paramInputStream, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeStream(paramInputStream, null, localOptions);
    int i = paramInt1 * paramInt2;
    return computeSampleSize(localOptions, Math.min(paramInt1, paramInt2) / 2, i);
  }

  public static Bitmap creatBitmapSafty(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    while (true)
      try
      {
        Bitmap localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
        localBitmap1 = localBitmap2;
        return localBitmap1;
      }
      catch (Throwable localThrowable)
      {
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        Bitmap localBitmap1 = null;
        if (paramConfig != localConfig)
          continue;
        paramConfig = Bitmap.Config.RGB_565;
      }
  }

  public static Bitmap createFromUri(Context paramContext, Uri paramUri, int paramInt1, int paramInt2)
  {
    if (paramUri == null)
      return null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    try
    {
      localOptions.inSampleSize = computeSampleSize(new BufferedInputStream(paramContext.getContentResolver().openInputStream(paramUri), 16384), paramInt1, paramInt2);
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramContext.getContentResolver().openInputStream(paramUri), 16384);
      localOptions.inDither = false;
      localOptions.inJustDecodeBounds = false;
      Bitmap localBitmap = BitmapFactory.decodeStream(localBufferedInputStream, null, localOptions);
      return localBitmap;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return null;
  }

  public static Bitmap decodeBitmap(String paramString, int paramInt1, int paramInt2, Bitmap.Config[] paramArrayOfConfig)
  {
    BitmapFactory.Options localOptions = getDefaultBitmapOptions();
    if ((paramArrayOfConfig != null) && (paramArrayOfConfig.length > 0))
      localOptions.inPreferredConfig = paramArrayOfConfig[0];
    if ((paramInt1 == 0) && (paramInt2 == 0))
      return BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    int k = getResizedDimension(paramInt1, paramInt2, i, j);
    int m = getResizedDimension(paramInt2, paramInt1, j, i);
    localOptions.inJustDecodeBounds = false;
    localOptions.inSampleSize = findBestSampleSize(i, j, k, m);
    return BitmapFactory.decodeFile(paramString, localOptions);
  }

  public static Bitmap decodeBitmap(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Bitmap.Config[] paramArrayOfConfig)
  {
    if (paramArrayOfByte == null)
      return null;
    BitmapFactory.Options localOptions = getDefaultBitmapOptions();
    if ((paramArrayOfConfig != null) && (paramArrayOfConfig.length > 0))
      localOptions.inPreferredConfig = paramArrayOfConfig[0];
    if ((paramInt1 == 0) && (paramInt2 == 0))
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    int k = getResizedDimension(paramInt1, paramInt2, i, j);
    int m = getResizedDimension(paramInt2, paramInt1, j, i);
    localOptions.inJustDecodeBounds = false;
    localOptions.inSampleSize = findBestSampleSize(i, j, k, m);
    return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
  }

  public static Bitmap decodeBitmapFromDrawble(Drawable paramDrawable, Bitmap.Config[] paramArrayOfConfig)
  {
    if ((paramDrawable == null) || (paramDrawable.getIntrinsicWidth() <= 0) || (paramDrawable.getIntrinsicHeight() <= 0))
      return null;
    Bitmap.Config localConfig;
    if ((paramArrayOfConfig != null) && (paramArrayOfConfig.length > 0))
      localConfig = paramArrayOfConfig[0];
    Bitmap localBitmap;
    while (true)
    {
      localBitmap = creatBitmapSafty(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), localConfig);
      if (localBitmap != null)
        break;
      return null;
      if (paramDrawable.getOpacity() != -1)
      {
        localConfig = Bitmap.Config.ARGB_8888;
        continue;
      }
      localConfig = Bitmap.Config.RGB_565;
    }
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
    paramDrawable.draw(localCanvas);
    return localBitmap;
  }

  public static Bitmap decodeResource(Resources paramResources, int paramInt, Bitmap.Config[] paramArrayOfConfig)
  {
    if (paramResources == null)
      return null;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      if ((paramArrayOfConfig != null) && (paramArrayOfConfig.length > 0))
        localOptions.inPreferredConfig = paramArrayOfConfig[0];
      Bitmap localBitmap = BitmapFactory.decodeResource(paramResources, paramInt, localOptions);
      return localBitmap;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static Bitmap drawableToBitmap(Drawable paramDrawable, Bitmap.Config[] paramArrayOfConfig)
  {
    Bitmap localBitmap;
    if ((paramDrawable == null) || (paramDrawable.getIntrinsicWidth() <= 0) || (paramDrawable.getIntrinsicHeight() <= 0))
      localBitmap = null;
    do
    {
      return localBitmap;
      if (!(paramDrawable instanceof BitmapDrawable))
        break;
      localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
    }
    while ((localBitmap != null) && (!localBitmap.isRecycled()));
    return decodeBitmapFromDrawble(paramDrawable, paramArrayOfConfig);
  }

  private static int findBestSampleSize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d = Math.min(paramInt1 / paramInt3, paramInt2 / paramInt4);
    float f = 1.0F;
    while (f * 2.0F <= d)
      f *= 2.0F;
    return (int)f;
  }

  private static BitmapFactory.Options getDefaultBitmapOptions()
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    Context localContext = GlobalConfig.getAppContext();
    if (localContext != null)
      if (((ActivityManager)localContext.getSystemService("activity")).getMemoryClass() >= 64)
      {
        localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        if (!SystemUtil.aboveApiLevel(11))
          break label80;
      }
    label80: for (localOptions.inPurgeable = false; ; localOptions.inPurgeable = true)
    {
      localOptions.inInputShareable = true;
      return localOptions;
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
      break;
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
      break;
    }
  }

  public static ImageUtil.ImageSize getImageSize(String paramString)
  {
    ImageUtil.ImageSize localImageSize = new ImageUtil.ImageSize();
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localImageSize.width = localOptions.outWidth;
    localImageSize.height = localOptions.outHeight;
    return localImageSize;
  }

  private static int getResizedDimension(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramInt1 = paramInt3;
    double d;
    do
    {
      do
      {
        return paramInt1;
        if (paramInt1 == 0)
          return (int)(paramInt2 / paramInt4 * paramInt3);
      }
      while (paramInt2 == 0);
      d = paramInt4 / paramInt3;
    }
    while (d * paramInt1 <= paramInt2);
    return (int)(paramInt2 / d);
  }

  public static Bitmap rotate(Bitmap paramBitmap, int paramInt)
  {
    Matrix localMatrix;
    if ((paramInt != 0) && (paramBitmap != null))
    {
      localMatrix = new Matrix();
      localMatrix.setRotate(paramInt, paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
    }
    try
    {
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
      if (paramBitmap != localBitmap)
        paramBitmap = localBitmap;
      return paramBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
    return paramBitmap;
  }

  // ERROR //
  public static boolean savePicToPath(Bitmap paramBitmap, java.io.File paramFile, Bitmap.CompressFormat paramCompressFormat)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: aload_1
    //   5: ifnonnull +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: ldc_w 272
    //   13: invokestatic 278	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   16: invokevirtual 284	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   19: ifeq -11 -> 8
    //   22: aload_1
    //   23: invokevirtual 290	java/io/File:getParentFile	()Ljava/io/File;
    //   26: invokevirtual 293	java/io/File:exists	()Z
    //   29: ifne +11 -> 40
    //   32: aload_1
    //   33: invokevirtual 290	java/io/File:getParentFile	()Ljava/io/File;
    //   36: invokevirtual 296	java/io/File:mkdirs	()Z
    //   39: pop
    //   40: aconst_null
    //   41: astore_3
    //   42: new 298	java/io/FileOutputStream
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 301	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   50: astore 4
    //   52: aload_0
    //   53: aload_2
    //   54: bipush 90
    //   56: aload 4
    //   58: invokevirtual 35	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   61: istore 7
    //   63: aload 4
    //   65: invokevirtual 304	java/io/FileOutputStream:flush	()V
    //   68: aload 4
    //   70: invokestatic 310	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   73: iload 7
    //   75: ireturn
    //   76: astore 8
    //   78: aload_3
    //   79: invokestatic 310	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   82: iconst_0
    //   83: ireturn
    //   84: astore 6
    //   86: aconst_null
    //   87: astore 4
    //   89: aload 4
    //   91: invokestatic 310	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   94: aload 6
    //   96: athrow
    //   97: astore 6
    //   99: goto -10 -> 89
    //   102: astore 5
    //   104: aload 4
    //   106: astore_3
    //   107: goto -29 -> 78
    //
    // Exception table:
    //   from	to	target	type
    //   42	52	76	java/lang/Throwable
    //   42	52	84	finally
    //   52	68	97	finally
    //   52	68	102	java/lang/Throwable
  }

  public static Bitmap scaleDown(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return scaleDown(paramBitmap, paramInt1, paramInt2, true);
  }

  public static Bitmap scaleDown(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBitmap == null)
      return null;
    float f;
    if (paramBitmap.getWidth() < paramBitmap.getHeight())
      f = paramInt1 / paramBitmap.getWidth();
    while (true)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(f, f);
      return transform(localMatrix, paramBitmap, paramInt1, paramInt2, false);
      f = paramInt2 / paramBitmap.getHeight();
    }
  }

  public static Bitmap scaleUp(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return scaleUp(paramBitmap, paramInt1, paramInt2, true);
  }

  public static Bitmap scaleUp(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBitmap == null)
      return null;
    float f;
    if (paramBitmap.getWidth() < paramBitmap.getHeight())
      f = paramInt1 / paramBitmap.getWidth();
    while (true)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(f, f);
      return transform(localMatrix, paramBitmap, paramInt1, paramInt2, true);
      f = paramInt2 / paramBitmap.getHeight();
    }
  }

  // ERROR //
  public static void setWallpaper(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 286	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 333	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: aconst_null
    //   10: astore_3
    //   11: new 335	java/io/FileInputStream
    //   14: dup
    //   15: aload_2
    //   16: invokespecial 336	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: astore 4
    //   21: aload_0
    //   22: invokestatic 342	android/app/WallpaperManager:getInstance	(Landroid/content/Context;)Landroid/app/WallpaperManager;
    //   25: aload 4
    //   27: invokevirtual 346	android/app/WallpaperManager:setStream	(Ljava/io/InputStream;)V
    //   30: aload 4
    //   32: invokevirtual 348	java/io/FileInputStream:close	()V
    //   35: return
    //   36: astore 11
    //   38: aconst_null
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull -8 -> 35
    //   46: aload 4
    //   48: invokevirtual 348	java/io/FileInputStream:close	()V
    //   51: return
    //   52: astore 6
    //   54: return
    //   55: astore 8
    //   57: aload_3
    //   58: ifnull +7 -> 65
    //   61: aload_3
    //   62: invokevirtual 348	java/io/FileInputStream:close	()V
    //   65: aload 8
    //   67: athrow
    //   68: astore 10
    //   70: return
    //   71: astore 9
    //   73: goto -8 -> 65
    //   76: astore 7
    //   78: aload 4
    //   80: astore_3
    //   81: aload 7
    //   83: astore 8
    //   85: goto -28 -> 57
    //   88: astore 5
    //   90: goto -49 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   11	21	36	java/io/IOException
    //   46	51	52	java/io/IOException
    //   11	21	55	finally
    //   30	35	68	java/io/IOException
    //   61	65	71	java/io/IOException
    //   21	30	76	finally
    //   21	30	88	java/io/IOException
  }

  public static Bitmap toRoundBitmap(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f4;
    float f8;
    float f6;
    int k;
    int m;
    float f7;
    float f5;
    float f9;
    if (i <= j)
    {
      float f10 = i / 2;
      f4 = i;
      f8 = f4;
      f6 = f10;
      k = i;
      m = i;
      f7 = f4;
      f5 = 0.0F;
      f9 = f4;
    }
    Bitmap localBitmap;
    while (true)
    {
      localBitmap = creatBitmapSafty(m, k, Bitmap.Config.ARGB_8888);
      if (localBitmap != null)
        break;
      return paramBitmap;
      float f1 = j / 2;
      float f2 = (i - j) / 2;
      float f3 = i - f2;
      f4 = j;
      f5 = f2;
      k = j;
      m = j;
      f6 = f1;
      f7 = f4;
      f8 = f3;
      f9 = f4;
    }
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect1 = new Rect((int)f5, 0, (int)f8, (int)f7);
    Rect localRect2 = new Rect(0, 0, (int)f9, (int)f4);
    RectF localRectF = new RectF(localRect2);
    localPaint.setAntiAlias(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-12434878);
    localCanvas.drawRoundRect(localRectF, f6, f6, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect1, localRect2, localPaint);
    return localBitmap;
  }

  public static Bitmap toRoundedCornerBitmap(Bitmap paramBitmap, int paramInt)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    float f = paramInt;
    localPaint.setAntiAlias(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-12434878);
    localCanvas.drawRoundRect(localRectF, f, f, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    return localBitmap;
  }

  public static Bitmap transform(Matrix paramMatrix, Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramBitmap.getWidth() - paramInt1;
    int j = paramBitmap.getHeight() - paramInt2;
    if ((!paramBoolean) && ((i < 0) || (j < 0)))
    {
      Bitmap localBitmap = creatBitmapSafty(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      if (localBitmap == null)
        return paramBitmap;
      Canvas localCanvas = new Canvas(localBitmap);
      int i2 = Math.max(0, i / 2);
      int i3 = Math.max(0, j / 2);
      Rect localRect = new Rect(i2, i3, i2 + Math.min(paramInt1, paramBitmap.getWidth()), i3 + Math.min(paramInt2, paramBitmap.getHeight()));
      int i4 = (paramInt1 - localRect.width()) / 2;
      int i5 = (paramInt2 - localRect.height()) / 2;
      localCanvas.drawBitmap(paramBitmap, localRect, new Rect(i4, i5, paramInt1 - i4, paramInt2 - i5), null);
      return localBitmap;
    }
    float f1 = paramBitmap.getWidth();
    float f2 = paramBitmap.getHeight();
    Matrix localMatrix;
    if (f1 / f2 > paramInt1 / paramInt2)
    {
      float f4 = paramInt2 / f2;
      if (f4 >= 0.9F)
      {
        boolean bool2 = f4 < 1.0F;
        localMatrix = null;
        if (!bool2);
      }
      else
      {
        paramMatrix.setScale(f4, f4);
        localMatrix = paramMatrix;
      }
    }
    while (true)
    {
      if (localMatrix != null)
      {
        int n = paramBitmap.getWidth();
        int i1 = paramBitmap.getHeight();
        paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, n, i1, localMatrix, true);
      }
      int k = Math.max(0, paramBitmap.getWidth() - paramInt1);
      int m = Math.max(0, paramBitmap.getHeight() - paramInt2);
      return Bitmap.createBitmap(paramBitmap, k / 2, m / 2, paramInt1, paramInt2);
      float f3 = paramInt1 / f1;
      if (f3 >= 0.9F)
      {
        boolean bool1 = f3 < 1.0F;
        localMatrix = null;
        if (!bool1)
          continue;
      }
      paramMatrix.setScale(f3, f3);
      localMatrix = paramMatrix;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ImageUtil
 * JD-Core Version:    0.6.0
 */