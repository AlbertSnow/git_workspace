package com.google.android.gms.ads.internal;

import anw;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.v;
import dh;
import java.lang.ref.WeakReference;

final class z
  implements Runnable
{
  z(y paramy, AdRequestParcel paramAdRequestParcel)
  {
  }

  public final void run()
  {
    synchronized (this.b.n)
    {
      y localy = this.b;
      an localan = new an(localy.a, localy.m, AdSizeParcel.a(), localy.j, localy.c, localy.k);
      this.b.l = new WeakReference(localan);
      v localv = this.b.d;
      anw.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
      localan.d.s = localv;
      com.google.android.gms.ads.internal.formats.client.y localy1 = this.b.e;
      anw.b("setOnContentAdLoadedListener must be called on the main UI thread.");
      localan.d.t = localy1;
      dh localdh1 = this.b.f;
      anw.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
      localan.d.v = localdh1;
      localan.a(this.b.b);
      dh localdh2 = this.b.g;
      anw.b("setOnCustomClickListener must be called on the main UI thread.");
      localan.d.u = localdh2;
      localan.a(this.b.c());
      NativeAdOptionsParcel localNativeAdOptionsParcel = this.b.h;
      anw.b("setNativeAdOptions must be called on the main UI thread.");
      localan.d.w = localNativeAdOptionsParcel;
      localan.a(this.b.i);
      localan.a(this.a);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.z
 * JD-Core Version:    0.6.0
 */