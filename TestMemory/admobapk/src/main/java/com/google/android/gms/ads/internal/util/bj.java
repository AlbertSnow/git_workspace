package com.google.android.gms.ads.internal.util;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.h;
import java.util.concurrent.Callable;

@a
public final class bj
{
  public static Object a(Callable paramCallable)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(localThreadPolicy).permitDiskReads().permitDiskWrites().build());
      Object localObject2 = paramCallable.call();
      return localObject2;
    }
    catch (Throwable localThrowable)
    {
      c.b("Unexpected exception.", localThrowable);
      bc.a().h.a(localThrowable, true);
      return null;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    throw localObject1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.bj
 * JD-Core Version:    0.6.0
 */