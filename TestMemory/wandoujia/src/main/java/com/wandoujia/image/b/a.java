package com.wandoujia.image.b;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.os.Build.VERSION;
import android.provider.MediaStore.Video.Media;
import android.provider.MediaStore.Video.Thumbnails;
import android.text.TextUtils;
import com.android.volley.toolbox.b;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.base.utils.SystemUtil;
import java.io.File;

public final class a
{
  private final Context a;
  private final b b;

  public a(Context paramContext, b paramb)
  {
    this.a = paramContext;
    this.b = paramb;
  }

  // ERROR //
  private static byte[] a(java.io.InputStream paramInputStream, b paramb, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: iload_2
    //   3: iconst_1
    //   4: invokestatic 25	android/support/v4/app/b:a	(Lcom/android/volley/toolbox/b;Ljava/io/InputStream;IZ)[B
    //   7: astore 5
    //   9: aload 5
    //   11: areturn
    //   12: astore 4
    //   14: aconst_null
    //   15: areturn
    //   16: astore_3
    //   17: aload_3
    //   18: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	12	com/android/volley/ServerError
    //   0	9	16	finally
  }

  @TargetApi(15)
  public final Bitmap a(String paramString)
  {
    PackageManager localPackageManager = this.a.getPackageManager();
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(paramString, 128);
      Resources localResources = localPackageManager.getResourcesForApplication(localApplicationInfo);
      Drawable localDrawable2;
      if (SystemUtil.aboveApiLevel(15))
        localDrawable2 = localResources.getDrawableForDensity(localApplicationInfo.icon, 320);
      Drawable localDrawable1;
      for (localObject = localDrawable2; ; localObject = localDrawable1)
      {
        Bitmap localBitmap = null;
        if (localObject != null)
          localBitmap = ImageUtil.drawableToBitmap((Drawable)localObject, new Bitmap.Config[0]);
        return localBitmap;
        localDrawable1 = localResources.getDrawable(localApplicationInfo.icon);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        Object localObject = null;
    }
  }

  // ERROR //
  public final Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: new 86	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 89	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore 4
    //   10: aload 4
    //   12: invokevirtual 93	java/io/File:exists	()Z
    //   15: istore 11
    //   17: iload 11
    //   19: ifne +9 -> 28
    //   22: aconst_null
    //   23: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   26: aconst_null
    //   27: areturn
    //   28: new 101	java/io/FileInputStream
    //   31: dup
    //   32: aload_1
    //   33: invokespecial 102	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   36: astore 6
    //   38: aload 6
    //   40: aload_0
    //   41: getfield 17	com/wandoujia/image/b/a:b	Lcom/android/volley/toolbox/b;
    //   44: aload 4
    //   46: invokevirtual 106	java/io/File:length	()J
    //   49: l2i
    //   50: invokestatic 108	com/wandoujia/image/b/a:a	(Ljava/io/InputStream;Lcom/android/volley/toolbox/b;I)[B
    //   53: iload_2
    //   54: iload_3
    //   55: iconst_0
    //   56: anewarray 67	android/graphics/Bitmap$Config
    //   59: invokestatic 112	com/wandoujia/base/utils/ImageUtil:decodeBitmap	([BII[Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   62: astore 15
    //   64: aload 6
    //   66: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   69: aload 15
    //   71: areturn
    //   72: astore 10
    //   74: aconst_null
    //   75: astore 6
    //   77: aload 6
    //   79: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   82: aconst_null
    //   83: areturn
    //   84: astore 9
    //   86: aconst_null
    //   87: astore 6
    //   89: aload 6
    //   91: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   94: aconst_null
    //   95: areturn
    //   96: astore 8
    //   98: aconst_null
    //   99: astore 6
    //   101: aload 6
    //   103: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   106: aconst_null
    //   107: areturn
    //   108: astore 5
    //   110: aconst_null
    //   111: astore 6
    //   113: aload 5
    //   115: astore 7
    //   117: aload 6
    //   119: invokestatic 99	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   122: aload 7
    //   124: athrow
    //   125: astore 7
    //   127: goto -10 -> 117
    //   130: astore 14
    //   132: goto -31 -> 101
    //   135: astore 13
    //   137: goto -48 -> 89
    //   140: astore 12
    //   142: goto -65 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	72	java/io/FileNotFoundException
    //   28	38	72	java/io/FileNotFoundException
    //   0	17	84	java/lang/InterruptedException
    //   28	38	84	java/lang/InterruptedException
    //   0	17	96	java/io/IOException
    //   28	38	96	java/io/IOException
    //   0	17	108	finally
    //   28	38	108	finally
    //   38	64	125	finally
    //   38	64	130	java/io/IOException
    //   38	64	135	java/lang/InterruptedException
    //   38	64	140	java/io/FileNotFoundException
  }

  public final Bitmap b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      File localFile = new File(paramString);
      PackageManager localPackageManager = this.a.getPackageManager();
      PackageInfo localPackageInfo = localPackageManager.getPackageArchiveInfo(localFile.getAbsolutePath(), 0);
      if (localPackageInfo == null)
        return null;
      if (localPackageInfo.applicationInfo != null)
      {
        localPackageInfo.applicationInfo.sourceDir = localFile.getAbsolutePath();
        localPackageInfo.applicationInfo.publicSourceDir = localFile.getAbsolutePath();
        Bitmap localBitmap = ((BitmapDrawable)localPackageInfo.applicationInfo.loadIcon(localPackageManager)).getBitmap();
        return localBitmap;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final Bitmap c(String paramString)
  {
    String str = paramString.replace("'", "''");
    Cursor localCursor = this.a.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[] { "_id" }, "_data='" + str + "'", null, null);
    if ((localCursor != null) && (localCursor.moveToFirst()));
    while (true)
    {
      long l1;
      try
      {
        long l2 = localCursor.getLong(localCursor.getColumnIndex("_id"));
        l1 = l2;
        if (localCursor == null)
          continue;
        localCursor.close();
        if (Build.VERSION.SDK_INT >= 8)
        {
          localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 2);
          if (localBitmap == null)
            continue;
          localBitmap = ThumbnailUtils.extractThumbnail(localBitmap, 240, 240);
          return localBitmap;
        }
      }
      finally
      {
        if (localCursor == null)
          continue;
        localCursor.close();
      }
      Bitmap localBitmap = MediaStore.Video.Thumbnails.getThumbnail(this.a.getContentResolver(), l1, 2, null);
      if (localBitmap != null)
      {
        return ImageUtil.scaleDown(localBitmap, 240, 240, true);
        l1 = -1L;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.b.a
 * JD-Core Version:    0.6.0
 */