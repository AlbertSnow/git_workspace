package com.alipay.squareup.picasso;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.provider.ContactsContract.Contacts;
import java.io.File;
import java.io.InputStream;
import java.util.List;

final class p
{
  private static final String[] a = { "orientation" };

  // ERROR //
  static int a(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic 14	com/alipay/squareup/picasso/p:a	[Ljava/lang/String;
    //   5: aconst_null
    //   6: aconst_null
    //   7: aconst_null
    //   8: invokevirtual 23	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   11: astore 6
    //   13: aload 6
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull +16 -> 33
    //   20: aload_3
    //   21: invokeinterface 29 1 0
    //   26: istore 9
    //   28: iload 9
    //   30: ifne +19 -> 49
    //   33: aload_3
    //   34: ifnull +9 -> 43
    //   37: aload_3
    //   38: invokeinterface 32 1 0
    //   43: iconst_0
    //   44: istore 7
    //   46: iload 7
    //   48: ireturn
    //   49: aload_3
    //   50: iconst_0
    //   51: invokeinterface 36 2 0
    //   56: istore 10
    //   58: iload 10
    //   60: istore 7
    //   62: aload_3
    //   63: ifnull -17 -> 46
    //   66: aload_3
    //   67: invokeinterface 32 1 0
    //   72: iload 7
    //   74: ireturn
    //   75: astore 4
    //   77: aconst_null
    //   78: astore 5
    //   80: aload 5
    //   82: ifnull +10 -> 92
    //   85: aload 5
    //   87: invokeinterface 32 1 0
    //   92: iconst_0
    //   93: ireturn
    //   94: astore_2
    //   95: aconst_null
    //   96: astore_3
    //   97: aload_3
    //   98: ifnull +9 -> 107
    //   101: aload_3
    //   102: invokeinterface 32 1 0
    //   107: aload_2
    //   108: athrow
    //   109: astore_2
    //   110: goto -13 -> 97
    //   113: astore 8
    //   115: aload_3
    //   116: astore 5
    //   118: goto -38 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   0	13	75	java/lang/IllegalArgumentException
    //   0	13	94	finally
    //   20	28	109	finally
    //   49	58	109	finally
    //   20	28	113	java/lang/IllegalArgumentException
    //   49	58	113	java/lang/IllegalArgumentException
  }

  static int a(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = paramBitmap.getByteCount(); i < 0; i = paramBitmap.getRowBytes() * paramBitmap.getHeight())
      throw new IllegalStateException("Negative size: " + paramBitmap);
    return i;
  }

  static int a(File paramFile)
  {
    StatFs localStatFs = new StatFs(paramFile.getAbsolutePath());
    return Math.max(Math.min(localStatFs.getBlockCount() * localStatFs.getBlockSize() / 50, 52428800), 5242880);
  }

  static int a(String paramString)
  {
    switch (new ExifInterface(paramString).getAttributeInt("Orientation", 1))
    {
    case 4:
    case 5:
    case 7:
    default:
      return 0;
    case 6:
      return 90;
    case 3:
      return 180;
    case 8:
    }
    return 270;
  }

  static Loader a(Context paramContext)
  {
    try
    {
      Class.forName("com.alipay.squareup.okhttp.OkHttpClient");
      d locald = new d(paramContext);
      return locald;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return new o(paramContext);
  }

  static String a(Uri paramUri, int paramInt, List<Transformation> paramList)
  {
    StringBuilder localStringBuilder2;
    if (paramUri != null)
    {
      String str = paramUri.toString();
      localStringBuilder2 = new StringBuilder(50 + str.length());
      localStringBuilder2.append(str);
    }
    StringBuilder localStringBuilder1;
    for (Object localObject = localStringBuilder2; ; localObject = localStringBuilder1)
    {
      ((StringBuilder)localObject).append('\n');
      if (paramList == null)
        break;
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        ((StringBuilder)localObject).append(((Transformation)paramList.get(j)).key());
        ((StringBuilder)localObject).append('\n');
      }
      localStringBuilder1 = new StringBuilder(50);
      localStringBuilder1.append(paramInt);
    }
    return (String)((StringBuilder)localObject).toString();
  }

  static String a(Request paramRequest)
  {
    return a(paramRequest.b, paramRequest.c, null);
  }

  static void a(g paramg)
  {
    int i = paramg.outHeight;
    int j = paramg.outWidth;
    int k = 1;
    int m;
    if ((i > 0) || (j > 0))
    {
      k = Math.round(i / 0.0F);
      m = Math.round(j / 0.0F);
      if (k >= m)
        break label54;
    }
    while (true)
    {
      paramg.inSampleSize = k;
      paramg.inJustDecodeBounds = false;
      return;
      label54: k = m;
    }
  }

  static File b(Context paramContext)
  {
    File localFile = new File(paramContext.getApplicationContext().getCacheDir(), "picasso-cache");
    if (!localFile.exists())
      localFile.mkdirs();
    return localFile;
  }

  public static InputStream b(ContentResolver paramContentResolver, Uri paramUri)
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if (paramUri.toString().startsWith(ContactsContract.Contacts.CONTENT_LOOKUP_URI.toString()))
        paramUri = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
      return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri);
    }
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }

  static boolean b(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return false;
      String[] arrayOfString = paramString.split(" ", 2);
      if ("CACHE".equals(arrayOfString[0]))
        return true;
      if (arrayOfString.length == 1)
        continue;
      try
      {
        if (!"CONDITIONAL_CACHE".equals(arrayOfString[0]))
          continue;
        int i = Integer.parseInt(arrayOfString[1]);
        if (i == 304)
          return true;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    }
    return false;
  }

  static int c(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    int i;
    int j;
    if ((0x100000 & paramContext.getApplicationInfo().flags) != 0)
    {
      i = 1;
      j = localActivityManager.getMemoryClass();
      if ((i == 0) || (Build.VERSION.SDK_INT < 11))
        break label71;
    }
    label71: for (int k = localActivityManager.getLargeMemoryClass(); ; k = j)
    {
      return Math.min(k * 1048576 / 7, 20971520);
      i = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.p
 * JD-Core Version:    0.6.0
 */