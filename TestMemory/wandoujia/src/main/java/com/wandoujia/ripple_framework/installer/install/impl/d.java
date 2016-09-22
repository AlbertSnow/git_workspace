package com.wandoujia.ripple_framework.installer.install.impl;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionParams;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.m;
import com.wandoujia.ripple_framework.installer.install.n;
import de.greenrobot.event.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

@TargetApi(21)
public final class d extends m
{
  private static int a(OutputStream paramOutputStream, InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[65536];
    int i = 0;
    while (true)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, j);
      i += j;
    }
    return i;
  }

  private IntentSender a(int paramInt, n paramn)
  {
    PackageInstallerAdvancedImpl.2 local2 = new PackageInstallerAdvancedImpl.2(this, paramInt, paramn);
    String str = "com.android.vending.INTENT_PACKAGE_INSTALL_COMMIT." + String.valueOf(paramInt);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction(str);
    null.registerReceiver(local2, localIntentFilter);
    return PendingIntent.getBroadcast(null, paramInt, new Intent(str), 1207959552).getIntentSender();
  }

  private static PackageInstaller.Session a(int paramInt)
  {
    PackageInstaller.Session localSession = (PackageInstaller.Session)null.get(Integer.valueOf(paramInt));
    if (localSession == null)
    {
      localSession = null.openSession(paramInt);
      null.put(Integer.valueOf(paramInt), localSession);
    }
    return localSession;
  }

  private static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  private static int b(String paramString)
  {
    PackageInstaller.SessionParams localSessionParams = new PackageInstaller.SessionParams(1);
    if (!TextUtils.isEmpty(paramString))
      localSessionParams.setAppPackageName(paramString);
    return null.createSession(localSessionParams);
  }

  private static String b(int paramInt)
  {
    e locale = (e)null.get(Integer.valueOf(paramInt));
    if (locale == null)
      return "";
    return locale.a();
  }

  public final void a(String paramString)
  {
    try
    {
      int j = b(paramString);
      i = j;
      null.uninstall(paramString, a(i, null));
      ((c)i.k().a("event_bus")).d(paramString);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        int i = 0;
    }
  }

  public final void a(String paramString, n paramn)
  {
    a(paramString, b.M(paramString), paramn);
  }

  // ERROR //
  public final void a(String paramString1, String paramString2, n paramn)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 180	com/wandoujia/ripple_framework/installer/install/impl/d:b	(Ljava/lang/String;)I
    //   4: istore 5
    //   6: aconst_null
    //   7: iload 5
    //   9: invokestatic 84	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   12: new 174	com/wandoujia/ripple_framework/installer/install/impl/e
    //   15: dup
    //   16: aload_2
    //   17: iconst_0
    //   18: invokespecial 215	com/wandoujia/ripple_framework/installer/install/impl/e:<init>	(Ljava/lang/String;B)V
    //   21: invokeinterface 101 3 0
    //   26: pop
    //   27: iload 5
    //   29: invokestatic 217	com/wandoujia/ripple_framework/installer/install/impl/d:a	(I)Landroid/content/pm/PackageInstaller$Session;
    //   32: astore 13
    //   34: aload 13
    //   36: new 31	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   43: iload 5
    //   45: invokestatic 42	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   48: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_1
    //   52: invokevirtual 222	java/lang/String:hashCode	()I
    //   55: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   58: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: lconst_0
    //   62: ldc2_w 226
    //   65: invokevirtual 231	android/content/pm/PackageInstaller$Session:openWrite	(Ljava/lang/String;JJ)Ljava/io/OutputStream;
    //   68: astore 14
    //   70: aload 14
    //   72: astore 8
    //   74: new 233	java/io/FileInputStream
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 234	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   82: astore 15
    //   84: aload 8
    //   86: aload 15
    //   88: invokestatic 236	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/OutputStream;Ljava/io/InputStream;)I
    //   91: pop
    //   92: aload 13
    //   94: aload 8
    //   96: invokevirtual 240	android/content/pm/PackageInstaller$Session:fsync	(Ljava/io/OutputStream;)V
    //   99: aload 15
    //   101: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   104: aload 8
    //   106: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   109: iload 5
    //   111: invokestatic 217	com/wandoujia/ripple_framework/installer/install/impl/d:a	(I)Landroid/content/pm/PackageInstaller$Session;
    //   114: aload_0
    //   115: iload 5
    //   117: aload_3
    //   118: invokespecial 182	com/wandoujia/ripple_framework/installer/install/impl/d:a	(ILcom/wandoujia/ripple_framework/installer/install/n;)Landroid/content/IntentSender;
    //   121: invokevirtual 246	android/content/pm/PackageInstaller$Session:commit	(Landroid/content/IntentSender;)V
    //   124: return
    //   125: aload 11
    //   127: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   130: aload 12
    //   132: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   135: goto -26 -> 109
    //   138: aload 9
    //   140: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   143: aload 8
    //   145: invokestatic 242	com/wandoujia/ripple_framework/installer/install/impl/d:a	(Ljava/io/Closeable;)V
    //   148: aload 7
    //   150: athrow
    //   151: astore 7
    //   153: aconst_null
    //   154: astore 9
    //   156: goto -18 -> 138
    //   159: astore 7
    //   161: aload 15
    //   163: astore 9
    //   165: goto -27 -> 138
    //   168: astore 18
    //   170: aload 8
    //   172: astore 12
    //   174: aconst_null
    //   175: astore 11
    //   177: goto -52 -> 125
    //   180: astore 16
    //   182: aload 15
    //   184: astore 11
    //   186: aload 8
    //   188: astore 12
    //   190: goto -65 -> 125
    //   193: astore 10
    //   195: aconst_null
    //   196: astore 11
    //   198: aconst_null
    //   199: astore 12
    //   201: goto -76 -> 125
    //   204: astore 4
    //   206: return
    //   207: astore 7
    //   209: aconst_null
    //   210: astore 8
    //   212: aconst_null
    //   213: astore 9
    //   215: goto -77 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   74	84	151	finally
    //   84	99	159	finally
    //   74	84	168	java/io/IOException
    //   84	99	180	java/io/IOException
    //   27	70	193	java/io/IOException
    //   0	27	204	java/io/IOException
    //   99	109	204	java/io/IOException
    //   109	124	204	java/io/IOException
    //   125	135	204	java/io/IOException
    //   138	151	204	java/io/IOException
    //   27	70	207	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.d
 * JD-Core Version:    0.6.0
 */