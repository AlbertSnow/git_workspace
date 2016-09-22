package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.report.client.a;
import java.lang.ref.WeakReference;

@a
public final class s extends aa
{
  private final WeakReference a;

  public s(i parami)
  {
    this.a = new WeakReference(parami);
  }

  public final void a(AdResponseParcel paramAdResponseParcel)
  {
    i locali = (i)this.a.get();
    if (locali != null)
      locali.a(paramAdResponseParcel);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.s
 * JD-Core Version:    0.6.0
 */