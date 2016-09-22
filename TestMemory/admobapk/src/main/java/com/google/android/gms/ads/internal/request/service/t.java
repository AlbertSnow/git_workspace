package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.WeakHashMap;

@a
public final class t
{
  private WeakHashMap a = new WeakHashMap();

  public final r a(Context paramContext)
  {
    u localu = (u)this.a.get(paramContext);
    int i;
    if (localu != null)
      if (localu.a + ((Long)m.ab.a()).longValue() < bc.a().i.a())
      {
        i = 1;
        if ((i != 0) || (!((Boolean)m.aa.a()).booleanValue()))
          break label113;
      }
    label113: for (r localr = new s(paramContext, localu.b).a(); ; localr = new s(paramContext).a())
    {
      this.a.put(paramContext, new u(this, localr));
      return localr;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.t
 * JD-Core Version:    0.6.0
 */