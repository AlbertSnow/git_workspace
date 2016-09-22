package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.os.IInterface;
import apj;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import java.util.List;

public abstract interface e extends IInterface
{
  public abstract apj a();

  public abstract void a(apj paramapj);

  public abstract void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString, h paramh);

  public abstract void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, a parama, String paramString2);

  public abstract void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh);

  public abstract void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList);

  public abstract void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, h paramh);

  public abstract void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh);

  public abstract void a(AdRequestParcel paramAdRequestParcel, String paramString);

  public abstract void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2);

  public abstract void b();

  public abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract boolean g();

  public abstract n h();

  public abstract q i();

  public abstract Bundle j();

  public abstract Bundle k();

  public abstract Bundle l();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.e
 * JD-Core Version:    0.6.0
 */