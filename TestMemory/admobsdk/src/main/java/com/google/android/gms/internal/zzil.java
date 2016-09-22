package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.math.BigInteger;
import java.util.Locale;

@zzhb
public final class zzil
{
  private static final Object zzqy = new Object();
  private static String zzLL;

  public static String zza(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (zzqy)
    {
      if ((zzLL == null) && (!TextUtils.isEmpty(paramString1)))
        zzb(paramContext, paramString1, paramString2);
      return zzLL;
    }
  }

  public static String zzhm()
  {
    synchronized (zzqy)
    {
      return zzLL;
    }
  }

  private static void zzb(Context paramContext, String paramString1, String paramString2)
  {
    ClassLoader localClassLoader;
    Class localClass;
    try
    {
      Context localContext = paramContext.createPackageContext(paramString2, 3);
      localClassLoader = localContext.getClassLoader();
      localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
    }
    catch (Throwable localThrowable)
    {
      zzLL = "err";
      return;
    }
    BigInteger localBigInteger = new BigInteger(new byte[1]);
    String[] arrayOfString = paramString1.split(",");
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if (!zzr.zzbC().zza(localClassLoader, localClass, arrayOfString[i]))
        continue;
      localBigInteger = localBigInteger.setBit(i);
    }
    zzLL = String.format(Locale.US, "%X", new Object[] { localBigInteger });
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzil
 * JD-Core Version:    0.6.0
 */