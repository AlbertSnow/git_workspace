package com.google.android.gms.ads.internal.mediation.client;

import com.google.ads.mediation.h;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.report.client.a;
import ga;
import gb;
import gc;
import java.util.Date;
import java.util.HashSet;
import mi;
import mj;

@a
public final class ad
{
  public static int a(ga paramga)
  {
    switch (ae.a[paramga.ordinal()])
    {
    default:
      return 0;
    case 2:
      return 1;
    case 3:
      return 2;
    case 4:
    }
    return 3;
  }

  public static h a(AdRequestParcel paramAdRequestParcel)
  {
    HashSet localHashSet;
    Date localDate;
    int i;
    if (paramAdRequestParcel.e != null)
    {
      localHashSet = new HashSet(paramAdRequestParcel.e);
      localDate = new Date(paramAdRequestParcel.b);
      switch (paramAdRequestParcel.d)
      {
      default:
        i = gb.a;
      case 2:
      case 1:
      }
    }
    while (true)
    {
      return new h(localDate, i, localHashSet, paramAdRequestParcel.f, paramAdRequestParcel.k);
      localHashSet = null;
      break;
      i = gb.c;
      continue;
      i = gb.b;
    }
  }

  public static gc a(AdSizeParcel paramAdSizeParcel)
  {
    int i = 0;
    gc[] arrayOfgc = new gc[6];
    arrayOfgc[0] = gc.b;
    arrayOfgc[1] = gc.c;
    arrayOfgc[2] = gc.d;
    arrayOfgc[3] = gc.e;
    arrayOfgc[4] = gc.f;
    arrayOfgc[5] = gc.g;
    while (i < 6)
    {
      if ((arrayOfgc[i].a.i == paramAdSizeParcel.f) && (arrayOfgc[i].a.j == paramAdSizeParcel.c))
        return arrayOfgc[i];
      i++;
    }
    return new gc(mj.a(paramAdSizeParcel.f, paramAdSizeParcel.c, paramAdSizeParcel.b));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.ad
 * JD-Core Version:    0.6.0
 */