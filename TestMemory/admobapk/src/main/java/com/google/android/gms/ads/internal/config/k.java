package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.bj;

@a
public final class k
{
  final Object a = new Object();
  boolean b = false;
  SharedPreferences c = null;

  public final Object a(d paramd)
  {
    synchronized (this.a)
    {
      if (!this.b)
      {
        Object localObject3 = paramd.b;
        return localObject3;
      }
      return bj.a(new l(this, paramd));
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.k
 * JD-Core Version:    0.6.0
 */