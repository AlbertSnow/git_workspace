package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import java.lang.reflect.Method;

@zzhb
public class zzb
{
  Object zzFz;
  private final Context mContext;
  private final boolean zzFA;

  public zzb(Context paramContext)
  {
    this(paramContext, true);
  }

  public zzb(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.zzFA = paramBoolean;
  }

  public void zzN(IBinder paramIBinder)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub");
      Method localMethod = localClass.getDeclaredMethod("asInterface", new Class[] { IBinder.class });
      this.zzFz = localMethod.invoke(null, new Object[] { paramIBinder });
    }
    catch (Exception localException)
    {
      if (this.zzFA)
        zzin.zzaK("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
    }
  }

  public Bundle zzb(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Method localMethod = localClass.getDeclaredMethod("getBuyIntent", new Class[] { Integer.TYPE, String.class, String.class, String.class, String.class });
      return (Bundle)localMethod.invoke(localClass.cast(this.zzFz), new Object[] { Integer.valueOf(3), paramString1, paramString2, "inapp", paramString3 });
    }
    catch (Exception localException)
    {
      if (this.zzFA)
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }

  public int zzh(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Method localMethod = localClass.getDeclaredMethod("consumePurchase", new Class[] { Integer.TYPE, String.class, String.class });
      return ((Integer)localMethod.invoke(localClass.cast(this.zzFz), new Object[] { Integer.valueOf(3), paramString1, paramString2 })).intValue();
    }
    catch (Exception localException)
    {
      if (this.zzFA)
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return 5;
  }

  public Bundle zzi(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Method localMethod = localClass.getDeclaredMethod("getPurchases", new Class[] { Integer.TYPE, String.class, String.class, String.class });
      return (Bundle)localMethod.invoke(localClass.cast(this.zzFz), new Object[] { Integer.valueOf(3), paramString1, "inapp", paramString2 });
    }
    catch (Exception localException)
    {
      if (this.zzFA)
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }

  public int zzb(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Method localMethod = localClass.getDeclaredMethod("isBillingSupported", new Class[] { Integer.TYPE, String.class, String.class });
      return ((Integer)localMethod.invoke(localClass.cast(this.zzFz), new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 })).intValue();
    }
    catch (Exception localException)
    {
      if (this.zzFA)
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return 5;
  }

  public void destroy()
  {
    this.zzFz = null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzb
 * JD-Core Version:    0.6.0
 */