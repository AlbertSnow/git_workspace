package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.lang.reflect.Method;

@a
public final class b
{
  Object a;
  private final Context b;
  private final boolean c;

  public b(Context paramContext)
  {
    this(paramContext, true);
  }

  public b(Context paramContext, boolean paramBoolean)
  {
    this.b = paramContext;
    this.c = paramBoolean;
  }

  public final int a(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      Method localMethod = localClass.getDeclaredMethod("isBillingSupported", arrayOfClass);
      Object localObject = localClass.cast(this.a);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      int i = ((Integer)localMethod.invoke(localObject, arrayOfObject)).intValue();
      return i;
    }
    catch (Exception localException)
    {
      if (this.c)
        c.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return 5;
  }

  public final int a(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      Method localMethod = localClass.getDeclaredMethod("consumePurchase", arrayOfClass);
      Object localObject = localClass.cast(this.a);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      int i = ((Integer)localMethod.invoke(localObject, arrayOfObject)).intValue();
      return i;
    }
    catch (Exception localException)
    {
      if (this.c)
        c.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return 5;
  }

  public final Bundle a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Class localClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[5];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      arrayOfClass[4] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getBuyIntent", arrayOfClass);
      Object localObject = localClass.cast(this.a);
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      arrayOfObject[3] = "inapp";
      arrayOfObject[4] = paramString3;
      Bundle localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      if (this.c)
        c.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }

  public final void a(IBinder paramIBinder)
  {
    try
    {
      this.a = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { paramIBinder });
      return;
    }
    catch (Exception localException)
    {
      while (!this.c);
      c.e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
    }
  }

  public final Bundle b(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getPurchases", arrayOfClass);
      Object localObject = localClass.cast(this.a);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = "inapp";
      arrayOfObject[3] = paramString2;
      Bundle localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      if (this.c)
        c.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.b
 * JD-Core Version:    0.6.0
 */