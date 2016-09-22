package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.csi.e;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.as;
import com.google.android.gms.ads.internal.util.at;
import com.google.android.gms.ads.internal.util.au;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@a
public final class bm
{
  boolean a;
  private final Context b;
  private final String c;
  private final VersionInfoParcel d;
  private final j e;
  private final l f;
  private final as g = new as(new au().a("min_1", 4.9E-324D, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D).a("30_max", 30.0D, 1.7976931348623157E+308D));
  private final long[] h;
  private final String[] i;
  private j j;
  private j k;
  private j l;
  private j m;
  private am n;
  private boolean o;
  private boolean p;
  private long q = -1L;

  public bm(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, l paraml, j paramj)
  {
    this.b = paramContext;
    this.d = paramVersionInfoParcel;
    this.c = paramString;
    this.f = paraml;
    this.e = paramj;
    String str = (String)m.n.a();
    if (str == null)
    {
      this.i = new String[0];
      this.h = new long[0];
      return;
    }
    String[] arrayOfString = TextUtils.split(str, ",");
    this.i = new String[arrayOfString.length];
    this.h = new long[arrayOfString.length];
    int i1 = 0;
    while (i1 < arrayOfString.length)
      try
      {
        this.h[i1] = Long.parseLong(arrayOfString[i1]);
        i1++;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          c.c("Unable to parse frame hash target time number.", localNumberFormatException);
          this.h[i1] = -1L;
        }
      }
  }

  public final void a()
  {
    if ((this.j == null) || (this.k != null))
      return;
    e.a(this.f, this.j, new String[] { "vfr" });
    this.k = e.a(this.f);
  }

  public final void a(am paramam)
  {
    e.a(this.f, this.e, new String[] { "vpc" });
    this.j = e.a(this.f);
    if (this.f != null)
      this.f.a("vpn", paramam.d());
    this.n = paramam;
  }

  public final void b()
  {
    if ((((Boolean)m.m.a()).booleanValue()) && (!this.o))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.c);
      localBundle.putString("player", this.n.d());
      Iterator localIterator = this.g.a().iterator();
      if (localIterator.hasNext())
      {
        at localat = (at)localIterator.next();
        String str4 = String.valueOf("fps_c_");
        String str5 = String.valueOf(localat.a);
        String str6;
        label128: String str7;
        String str8;
        if (str5.length() != 0)
        {
          str6 = str4.concat(str5);
          localBundle.putString(str6, Integer.toString(localat.c));
          str7 = String.valueOf("fps_p_");
          str8 = String.valueOf(localat.a);
          if (str8.length() == 0)
            break label207;
        }
        label207: for (String str9 = str7.concat(str8); ; str9 = new String(str7))
        {
          localBundle.putString(str9, Double.toString(localat.b));
          break;
          str6 = new String(str4);
          break label128;
        }
      }
      for (int i1 = 0; i1 < this.h.length; i1++)
      {
        String str1 = this.i[i1];
        if (str1 == null)
          continue;
        String str2 = String.valueOf("fh_");
        String str3 = String.valueOf(Long.valueOf(this.h[i1]));
        localBundle.putString(0 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + str3, str1);
      }
      bc.a().e.a(this.b, this.d.b, "gmob-apps", localBundle, true);
      this.o = true;
    }
  }

  public final void b(am paramam)
  {
    if ((this.l != null) && (this.m == null))
    {
      e.a(this.f, this.l, new String[] { "vff" });
      e.a(this.f, this.e, new String[] { "vtt" });
      this.m = e.a(this.f);
    }
    long l1 = bc.a().i.c();
    if ((this.a) && (this.p) && (this.q != -1L))
    {
      double d1 = TimeUnit.SECONDS.toNanos(1L) / (l1 - this.q);
      as localas = this.g;
      localas.d = (1 + localas.d);
      for (int i5 = 0; i5 < localas.b.length; i5++)
      {
        if ((localas.b[i5] <= d1) && (d1 < localas.a[i5]))
        {
          int[] arrayOfInt = localas.c;
          arrayOfInt[i5] = (1 + arrayOfInt[i5]);
        }
        if (d1 < localas.b[i5])
          break;
      }
    }
    this.p = this.a;
    this.q = l1;
    long l2 = ((Long)m.o.a()).longValue();
    long l3 = paramam.j();
    for (int i1 = 0; ; i1++)
    {
      if (i1 < this.i.length)
      {
        if ((this.i[i1] != null) || (l2 <= Math.abs(l3 - this.h[i1])))
          continue;
        String[] arrayOfString = this.i;
        Bitmap localBitmap = paramam.getBitmap(8, 8);
        long l4 = 0L;
        long l5 = 63L;
        int i2 = 0;
        while (i2 < 8)
        {
          int i3 = 0;
          long l6 = l4;
          long l7 = l5;
          if (i3 < 8)
          {
            int i4 = localBitmap.getPixel(i3, i2);
            long l8;
            if (Color.blue(i4) + Color.red(i4) + Color.green(i4) > 128)
              l8 = 1L;
            while (true)
            {
              l6 |= l8 << (int)l7;
              i3++;
              l7 -= 1L;
              break;
              l8 = 0L;
            }
          }
          i2++;
          l5 = l7;
          l4 = l6;
        }
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Long.valueOf(l4);
        arrayOfString[i1] = String.format("%016X", arrayOfObject);
      }
      return;
    }
  }

  public final void c()
  {
    this.a = true;
    if ((this.k != null) && (this.l == null))
    {
      e.a(this.f, this.k, new String[] { "vfp" });
      this.l = e.a(this.f);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.bm
 * JD-Core Version:    0.6.0
 */