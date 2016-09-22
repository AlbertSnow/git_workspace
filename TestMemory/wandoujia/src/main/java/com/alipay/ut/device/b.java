package com.alipay.ut.device;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class b
{
  static final Object a;
  private static a b = null;
  private static String c = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";

  static
  {
    a = new Object();
  }

  private static int a(String paramString)
  {
    int i = 0;
    if (paramString.length() > 0)
    {
      char[] arrayOfChar = paramString.toCharArray();
      j = 0;
      while (i < arrayOfChar.length)
      {
        j = j * 31 + arrayOfChar[i];
        i++;
      }
    }
    int j = 0;
    return j;
  }

  static long a(a parama)
  {
    if (parama != null)
    {
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = parama.f();
      arrayOfObject[1] = parama.e();
      arrayOfObject[2] = Long.valueOf(parama.b());
      arrayOfObject[3] = parama.d();
      arrayOfObject[4] = parama.c();
      String str = String.format("%s%s%s%s%s", arrayOfObject);
      if (!android.support.v4.app.b.i(str))
      {
        Adler32 localAdler32 = new Adler32();
        localAdler32.reset();
        localAdler32.update(str.getBytes());
        return localAdler32.getValue();
      }
    }
    return 0L;
  }

  static a a(Context paramContext)
  {
    if (paramContext != null)
    {
      com.wandoujia.p4.community.utils.a locala = android.support.v4.app.b.c(paramContext);
      if (locala != null)
      {
        String str1 = locala.a("EI");
        String str2 = locala.a("SI");
        String str3 = locala.a("UTDID");
        String str4 = locala.a("DID");
        long l1 = locala.b("timestamp");
        long l2 = locala.b("S");
        if ((!android.support.v4.app.b.i(str1)) && (!android.support.v4.app.b.i(str2)) && (!android.support.v4.app.b.i(str3)) && (!android.support.v4.app.b.i(str4)))
        {
          a locala1 = new a();
          locala1.c(str4);
          locala1.a(str1);
          locala1.b(str2);
          locala1.d(str3);
          locala1.b(l1);
          locala1.a(l2);
          return locala1;
        }
      }
    }
    return null;
  }

  private static void a(Context paramContext, String paramString)
  {
    byte[] arrayOfByte = com.alipay.ut.a.a.a.a.a.a(paramString);
    String str = new c().a(arrayOfByte);
    Settings.System.putString(paramContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
  }

  static void a(a parama, Context paramContext)
  {
    if ((paramContext != null) && (parama.b() > 0L) && (a(paramContext) == null))
      b(parama, paramContext);
  }

  public static a b(Context paramContext)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (b == null)
          continue;
        if (android.support.v4.app.b.k())
          continue;
        a(paramContext);
        locala = b;
        return locala;
        if (paramContext != null)
        {
          locala = d(paramContext);
          b = locala;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      a locala = null;
    }
  }

  private static void b(a parama, Context paramContext)
  {
    if ((paramContext != null) && (parama != null))
    {
      com.wandoujia.p4.community.utils.a locala = android.support.v4.app.b.c(paramContext);
      if ((locala != null) && (!android.support.v4.app.b.i(parama.c())) && (!android.support.v4.app.b.i(parama.d())) && (!android.support.v4.app.b.i(parama.f())) && (!android.support.v4.app.b.i(parama.e())))
      {
        locala.a();
        locala.a("EI", parama.c());
        locala.a("SI", parama.d());
        locala.a("UTDID", parama.f());
        locala.a("DID", parama.e());
        locala.a("S", a(parama));
        if (parama.b() > 0L)
          locala.a("timestamp", parama.b());
        locala.b();
      }
    }
  }

  private static a c(Context paramContext)
  {
    a locala = new a();
    if (paramContext != null);
    try
    {
      long l = System.currentTimeMillis();
      String str1 = com.alipay.ut.c.a.a(paramContext);
      String str2 = com.alipay.ut.c.a.b(paramContext);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      int i = (int)(System.currentTimeMillis() / 1000L);
      int j = new Random().nextInt();
      byte[] arrayOfByte1 = android.support.v4.app.b.a(i);
      byte[] arrayOfByte2 = android.support.v4.app.b.a(j);
      localByteArrayOutputStream.write(arrayOfByte1, 0, 4);
      localByteArrayOutputStream.write(arrayOfByte2, 0, 4);
      localByteArrayOutputStream.write(1);
      localByteArrayOutputStream.write(0);
      String str3 = com.alipay.ut.c.a.a(paramContext);
      if (android.support.v4.app.b.i(str3))
        str3 = new Random().nextInt();
      localByteArrayOutputStream.write(android.support.v4.app.b.a(a(str3)), 0, 4);
      byte[] arrayOfByte3 = localByteArrayOutputStream.toByteArray();
      String str4 = c;
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(new SecretKeySpec(str4.getBytes(), localMac.getAlgorithm()));
      localByteArrayOutputStream.write(android.support.v4.app.b.a(a(com.alipay.ut.a.a.a.a.a.a(localMac.doFinal(arrayOfByte3)))));
      String str5 = com.alipay.ut.a.a.a.a.a.a(localByteArrayOutputStream.toByteArray());
      locala.c(str1);
      locala.a(str1);
      locala.b(l);
      locala.b(str2);
      locala.d(str5);
      locala.a(a(locala));
      return locala;
    }
    catch (Exception localException)
    {
    }
    return locala;
  }

  private static a d(Context paramContext)
  {
    int i;
    CountDownLatch localCountDownLatch;
    if (paramContext != null)
    {
      String str1 = Settings.System.getString(paramContext.getContentResolver(), "dxCRMxhQkdGePGnp");
      if (!android.support.v4.app.b.i(str1))
      {
        String str2 = new c().a(str1);
        boolean bool = android.support.v4.app.b.i(str2);
        i = 0;
        if (!bool)
        {
          a locala5 = a(paramContext);
          if (locala5 == null)
          {
            locala5 = c(paramContext);
            locala5.d(str2);
            b(locala5, paramContext);
          }
          i = 0;
          if (locala5 != null)
            return locala5;
        }
      }
      else
      {
        i = 1;
      }
      if (Looper.myLooper() == null)
        Looper.prepare();
      a locala1 = a(paramContext);
      if ((locala1 != null) && (locala1.a() != 0L) && (locala1.a() == a(locala1)))
      {
        if (i != 0)
          a(paramContext, locala1.f());
        return locala1;
      }
      if (BFoundIt.a() != null)
      {
        a locala4 = BFoundIt.a();
        b(locala4, paramContext);
        if (i != 0)
          a(paramContext, locala4.f());
        return locala4;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("src", paramContext.getPackageName());
      localIntent.setAction("UT.QueryWhoHasOne");
      paramContext.sendOrderedBroadcast(localIntent, "com.alipay.ut.permission.DEVICE_STATE");
      localCountDownLatch = new CountDownLatch(1);
      BFoundIt.a(localCountDownLatch);
    }
    try
    {
      localCountDownLatch.await(2500L, TimeUnit.MILLISECONDS);
      label243: if (BFoundIt.a() != null)
      {
        a locala3 = BFoundIt.a();
        b(locala3, paramContext);
        if (i != 0)
          a(paramContext, locala3.f());
        return locala3;
      }
      synchronized (a)
      {
        a locala2 = c(paramContext);
        b(locala2, paramContext);
        a(paramContext, locala2.f());
        return locala2;
      }
      return null;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label243;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.device.b
 * JD-Core Version:    0.6.0
 */