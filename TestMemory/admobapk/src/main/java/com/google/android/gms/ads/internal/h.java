package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.activeview.i;
import com.google.android.gms.ads.internal.activeview.l;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.state.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class h
  implements t
{
  h(g paramg)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    if (this.a.d.j != null)
    {
      l locall = this.a.f;
      AdSizeParcel localAdSizeParcel = this.a.d.i;
      a locala = this.a.d.j;
      locall.a(localAdSizeParcel, locala, new i(paramb.b(), locala), paramb);
      return;
    }
    c.e("Request to enable ActiveView before adState is available.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.h
 * JD-Core Version:    0.6.0
 */