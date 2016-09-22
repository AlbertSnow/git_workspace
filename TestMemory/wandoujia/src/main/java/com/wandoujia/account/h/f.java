package com.wandoujia.account.h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;

public final class f
{
  private static Handler a = new Handler(Looper.getMainLooper());

  public static Intent a(Uri paramUri)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", 1);
    localIntent.putExtra("aspectY", 1);
    localIntent.putExtra("outputX", 120);
    localIntent.putExtra("outputY", 120);
    localIntent.putExtra("return-data", true);
    return localIntent;
  }

  public static Bitmap a(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
      paramBitmap = null;
    int i;
    int j;
    do
    {
      return paramBitmap;
      i = paramBitmap.getHeight();
      j = paramBitmap.getWidth();
    }
    while ((i < 300) && (j < 300));
    return Bitmap.createScaledBitmap(paramBitmap, 300, 300, false);
  }

  // ERROR //
  public static String a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 84	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 89	java/io/File:length	()J
    //   13: ldc2_w 90
    //   16: lcmp
    //   17: ifgt +38 -> 55
    //   20: aload_0
    //   21: invokestatic 97	com/wandoujia/base/utils/ImageUtil:getImageSize	(Ljava/lang/String;)Lcom/wandoujia/base/utils/ImageUtil$ImageSize;
    //   24: astore 16
    //   26: aload 16
    //   28: ifnull +25 -> 53
    //   31: aload 16
    //   33: getfield 103	com/wandoujia/base/utils/ImageUtil$ImageSize:width	I
    //   36: sipush 300
    //   39: if_icmpge +16 -> 55
    //   42: aload 16
    //   44: getfield 106	com/wandoujia/base/utils/ImageUtil$ImageSize:height	I
    //   47: sipush 300
    //   50: if_icmpge +5 -> 55
    //   53: aload_0
    //   54: areturn
    //   55: aload_0
    //   56: sipush 150
    //   59: sipush 150
    //   62: iconst_0
    //   63: anewarray 108	android/graphics/Bitmap$Config
    //   66: invokestatic 112	com/wandoujia/base/utils/ImageUtil:decodeBitmap	(Ljava/lang/String;II[Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   69: astore_2
    //   70: aload_2
    //   71: ifnull -18 -> 53
    //   74: invokestatic 118	com/wandoujia/base/utils/SystemUtil:isExternalSDCardMounted	()Z
    //   77: ifeq +108 -> 185
    //   80: new 120	java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   87: invokestatic 126	com/wandoujia/base/utils/SystemUtil:getDeviceExternalCacheDir	()Ljava/io/File;
    //   90: invokevirtual 130	java/io/File:getPath	()Ljava/lang/String;
    //   93: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 136
    //   98: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: astore_3
    //   105: new 84	java/io/File
    //   108: dup
    //   109: aload_3
    //   110: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   113: astore 4
    //   115: aload 4
    //   117: invokevirtual 142	java/io/File:exists	()Z
    //   120: ifne +11 -> 131
    //   123: aload 4
    //   125: invokevirtual 145	java/io/File:mkdirs	()Z
    //   128: ifeq -75 -> 53
    //   131: new 84	java/io/File
    //   134: dup
    //   135: aload 4
    //   137: aload_0
    //   138: invokestatic 150	com/wandoujia/base/utils/FileUtil:getFileName	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokespecial 153	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   144: astore 5
    //   146: new 155	java/io/FileOutputStream
    //   149: dup
    //   150: aload 5
    //   152: invokespecial 158	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   155: astore 6
    //   157: aload_2
    //   158: getstatic 164	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   161: bipush 90
    //   163: aload 6
    //   165: invokevirtual 168	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   168: pop
    //   169: aload 6
    //   171: invokevirtual 173	java/io/OutputStream:flush	()V
    //   174: aload 6
    //   176: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   179: aload 5
    //   181: invokevirtual 130	java/io/File:getPath	()Ljava/lang/String;
    //   184: areturn
    //   185: ldc 136
    //   187: astore_3
    //   188: goto -83 -> 105
    //   191: astore 15
    //   193: aconst_null
    //   194: astore 6
    //   196: aload 6
    //   198: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   201: aconst_null
    //   202: areturn
    //   203: astore 14
    //   205: aconst_null
    //   206: astore 6
    //   208: aload 6
    //   210: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   213: aconst_null
    //   214: areturn
    //   215: astore 13
    //   217: aconst_null
    //   218: astore 6
    //   220: aload 6
    //   222: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   225: aconst_null
    //   226: areturn
    //   227: astore 11
    //   229: aload_1
    //   230: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   233: aload 11
    //   235: athrow
    //   236: astore 10
    //   238: aload 6
    //   240: astore_1
    //   241: aload 10
    //   243: astore 11
    //   245: goto -16 -> 229
    //   248: astore 9
    //   250: goto -30 -> 220
    //   253: astore 8
    //   255: goto -47 -> 208
    //   258: astore 7
    //   260: goto -64 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   146	157	191	java/io/FileNotFoundException
    //   146	157	203	java/io/IOException
    //   146	157	215	java/lang/OutOfMemoryError
    //   146	157	227	finally
    //   157	174	236	finally
    //   157	174	248	java/lang/OutOfMemoryError
    //   157	174	253	java/io/IOException
    //   157	174	258	java/io/FileNotFoundException
  }

  public static void a(Bitmap paramBitmap, String paramString, k paramk)
  {
    new Thread(new g(paramString, paramBitmap, paramk)).start();
  }

  public static Intent b(Uri paramUri)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      Intent localIntent1 = new Intent("android.intent.action.OPEN_DOCUMENT");
      localIntent1.addCategory("android.intent.category.OPENABLE");
      localIntent1.setType("image/*");
      return localIntent1;
    }
    Intent localIntent2 = new Intent("android.intent.action.GET_CONTENT");
    localIntent2.setType("image/*");
    localIntent2.putExtra("crop", "true");
    localIntent2.putExtra("aspectX", 1);
    localIntent2.putExtra("aspectY", 1);
    localIntent2.putExtra("outputX", 120);
    localIntent2.putExtra("outputY", 120);
    localIntent2.putExtra("return-data", false);
    localIntent2.putExtra("output", paramUri);
    localIntent2.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent2.putExtra("noFaceDetection", false);
    return localIntent2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.h.f
 * JD-Core Version:    0.6.0
 */