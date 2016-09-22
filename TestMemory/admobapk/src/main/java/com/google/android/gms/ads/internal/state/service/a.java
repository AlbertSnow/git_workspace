package com.google.android.gms.ads.internal.state.service;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.y;
import java.math.BigInteger;
import java.util.Locale;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  private static final Object a = new Object();
  private static String b;

  public static String a()
  {
    synchronized (a)
    {
      String str = b;
      return str;
    }
  }

  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    while (true)
    {
      int i;
      synchronized (a)
      {
        if (b != null)
          continue;
        boolean bool = TextUtils.isEmpty(paramString1);
        if (bool)
          continue;
        BigInteger localBigInteger2;
        try
        {
          ClassLoader localClassLoader = paramContext.createPackageContext(paramString2, 3).getClassLoader();
          Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
          BigInteger localBigInteger1 = new BigInteger(new byte[1]);
          String[] arrayOfString = paramString1.split(",");
          localBigInteger2 = localBigInteger1;
          i = 0;
          if (i >= arrayOfString.length)
            continue;
          if (!y.a(localClassLoader, localClass, arrayOfString[i]))
            break label160;
          localBigInteger2 = localBigInteger2.setBit(i);
        }
        catch (Throwable localThrowable)
        {
          b = "err";
        }
        String str = b;
        return str;
        b = String.format(Locale.US, "%X", new Object[] { localBigInteger2 });
      }
      label160: i++;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.service.a
 * JD-Core Version:    0.6.0
 */