package com.alipay.ut.c;

import android.content.Context;
import android.support.v4.app.b;
import android.telephony.TelephonyManager;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static final Pattern a = Pattern.compile("[\\s0-]{0,15}");

  private static String a()
  {
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = (int)System.nanoTime();
    int k = new Random().nextInt();
    int m = new Random().nextInt();
    byte[] arrayOfByte1 = b.a(i);
    byte[] arrayOfByte2 = b.a(j);
    byte[] arrayOfByte3 = b.a(k);
    byte[] arrayOfByte4 = b.a(m);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 0, 4);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, 4, 4);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte5, 8, 4);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, 12, 4);
    return com.alipay.ut.a.a.a.a.a.a(arrayOfByte5);
  }

  public static String a(Context paramContext)
  {
    Object localObject = null;
    if (paramContext != null);
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null)
      {
        String str1 = localTelephonyManager.getDeviceId();
        str2 = str1;
        localObject = str2;
        if ((b.i((String)localObject)) || (a.matcher((CharSequence)localObject).matches()) || (((String)localObject).contains("|")))
          localObject = a();
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject = null;
        continue;
        String str2 = null;
      }
    }
  }

  public static String b(Context paramContext)
  {
    Object localObject = null;
    if (paramContext != null);
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null)
      {
        String str1 = localTelephonyManager.getSubscriberId();
        str2 = str1;
        localObject = str2;
        if ((b.i((String)localObject)) || (a.matcher((CharSequence)localObject).matches()) || (((String)localObject).contains("|")))
          localObject = a();
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject = null;
        continue;
        String str2 = null;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.c.a
 * JD-Core Version:    0.6.0
 */