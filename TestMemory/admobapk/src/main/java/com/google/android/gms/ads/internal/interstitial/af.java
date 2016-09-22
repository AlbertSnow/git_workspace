package com.google.android.gms.ads.internal.interstitial;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import aom;
import com.google.android.gms.ads.internal.ab;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.g;

final class af
{
  ab a;
  AdRequestParcel b;
  b c;
  long d;
  boolean e;
  boolean f;

  af(ae paramae, a parama)
  {
    String str = paramae.c;
    this.a = new ab(parama.a.getApplicationContext(), new AdSizeParcel(), str, parama.b, parama.c, parama.d);
    this.c = new b();
    b localb = this.c;
    ab localab = this.a;
    localab.a(new c(localb));
    localab.a(new i(localb));
    localab.a(new k(localb));
    localab.a(new m(localb));
    localab.a(new o(localb));
    localab.a(new q(localb));
  }

  af(ae paramae, a parama, AdRequestParcel paramAdRequestParcel)
  {
    this(paramae, parama);
    this.b = paramAdRequestParcel;
  }

  final void a()
  {
    if (this.e)
      return;
    if (this.b != null);
    for (AdRequestParcel localAdRequestParcel1 = this.b; ; localAdRequestParcel1 = this.g.b)
    {
      Parcel localParcel = Parcel.obtain();
      localAdRequestParcel1.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      AdRequestParcel localAdRequestParcel2 = g.a(localParcel);
      localParcel.recycle();
      Bundle localBundle = ac.a(localAdRequestParcel2);
      if (localBundle == null)
      {
        localBundle = new Bundle();
        localAdRequestParcel2.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", localBundle);
      }
      localBundle.putBoolean("_skipMediation", true);
      this.f = this.a.a(localAdRequestParcel2);
      this.e = true;
      this.d = bc.a().i.a();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.af
 * JD-Core Version:    0.6.0
 */