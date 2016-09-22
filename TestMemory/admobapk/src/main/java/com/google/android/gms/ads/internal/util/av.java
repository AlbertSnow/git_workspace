package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.future.g;
import ey;
import fy;
import java.util.Map;

@a
public final class av
{
  public static ey a;
  private static final Object b = new Object();

  static
  {
    new aw();
  }

  public av(Context paramContext)
  {
    a(paramContext);
  }

  private static ey a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
        a = fy.a(paramContext.getApplicationContext(), null);
      ey localey = a;
      return localey;
    }
  }

  public final g a(int paramInt, String paramString, Map paramMap, byte[] paramArrayOfByte)
  {
    bc localbc = new bc(this);
    ay localay = new ay(this, paramInt, paramString, localbc, new ax(this, paramString, localbc), paramArrayOfByte, paramMap);
    a.a(localay);
    return localbc;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.av
 * JD-Core Version:    0.6.0
 */