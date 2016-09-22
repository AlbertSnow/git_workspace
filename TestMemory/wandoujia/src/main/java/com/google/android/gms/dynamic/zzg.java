package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import android.support.v4.app.d;
import com.google.android.gms.common.a;

public abstract class zzg<T>
{
  private final String a;
  private T b;

  protected zzg(String paramString)
  {
    this.a = paramString;
  }

  protected final T a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      d.a(paramContext);
      Context localContext = a.c(paramContext);
      if (localContext == null)
        throw new zzg.zza("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new zzg.zza("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new zzg.zza("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new zzg.zza("Could not access creator.", localIllegalAccessException);
  }

  protected abstract T a(IBinder paramIBinder);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzg
 * JD-Core Version:    0.6.0
 */