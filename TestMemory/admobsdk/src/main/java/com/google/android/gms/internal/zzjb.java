package com.google.android.gms.internal;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.zzr;
import java.util.concurrent.Callable;

@zzhb
public class zzjb
{
  public static <T> T zzb(Callable<T> paramCallable)
  {
    StrictMode.ThreadPolicy localThreadPolicy1 = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.ThreadPolicy localThreadPolicy2 = new StrictMode.ThreadPolicy.Builder(localThreadPolicy1).permitDiskReads().permitDiskWrites().build();
      StrictMode.setThreadPolicy(localThreadPolicy2);
      localObject1 = paramCallable.call();
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      zzin.zzb("Unexpected exception.", localThrowable);
      zzr.zzbF().zzb(localThrowable, true);
      Object localObject1 = null;
      return localObject1;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy1);
    }
    throw localObject2;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjb
 * JD-Core Version:    0.6.0
 */