package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import aom;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.e;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;

@a
public final class r
{
  final Object a = new Object();
  Context b;
  public final com.google.android.gms.ads.internal.gmsg.t c = new s(this);

  public final void a(Context paramContext, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean, e parame, String paramString1, String paramString2)
  {
    int j;
    if (parame == null)
      j = 1;
    while (j == 0)
    {
      return;
      long l1 = parame.a;
      long l2 = bc.a().i.a() - l1;
      d locald = m.aF;
      if (l2 > ((Long)bc.a().n.a(locald)).longValue());
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) && (parame.d))
          break label93;
        j = 1;
        break;
      }
      label93: j = 0;
    }
    if (paramContext == null)
    {
      c.e("Context not provided to fetch application settings");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      c.e("App settings could not be fetched. Required parameters missing");
      return;
    }
    this.b = paramContext;
    n localn = bc.a().e.a(paramContext, paramVersionInfoParcel);
    y.a.post(new t(this, localn, paramString1, paramString2, paramBoolean, paramContext));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.r
 * JD-Core Version:    0.6.0
 */