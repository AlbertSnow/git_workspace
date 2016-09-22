package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import aod;
import apj;
import apk;
import apn;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@com.google.android.gms.ads.internal.report.client.a
public final class AdOverlayInfoParcel extends AbstractSafeParcelable
{
  public static final aj CREATOR = new aj();
  public final int a;
  public final AdLauncherIntentInfoParcel b;
  public final com.google.android.gms.ads.internal.client.a c;
  public final ak d;
  public final com.google.android.gms.ads.internal.webview.b e;
  public final com.google.android.gms.ads.internal.gmsg.b f;
  public final String g;
  public final boolean h;
  public final String i;
  public final bc j;
  public final int k;
  public final int l;
  public final String m;
  public final VersionInfoParcel n;
  public final ab o;
  public final String p;
  public final InterstitialAdParameterParcel q;

  AdOverlayInfoParcel(int paramInt1, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt2, int paramInt3, String paramString3, VersionInfoParcel paramVersionInfoParcel, IBinder paramIBinder6, String paramString4, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.a = paramInt1;
    this.b = paramAdLauncherIntentInfoParcel;
    this.c = ((com.google.android.gms.ads.internal.client.a)apn.a(apk.a(paramIBinder1)));
    this.d = ((ak)apn.a(apk.a(paramIBinder2)));
    this.e = ((com.google.android.gms.ads.internal.webview.b)apn.a(apk.a(paramIBinder3)));
    this.f = ((com.google.android.gms.ads.internal.gmsg.b)apn.a(apk.a(paramIBinder4)));
    this.g = paramString1;
    this.h = paramBoolean;
    this.i = paramString2;
    this.j = ((bc)apn.a(apk.a(paramIBinder5)));
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramString3;
    this.n = paramVersionInfoParcel;
    this.o = ((ab)apn.a(apk.a(paramIBinder6)));
    this.p = paramString4;
    this.q = paramInterstitialAdParameterParcel;
  }

  public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a parama, ak paramak, com.google.android.gms.ads.internal.gmsg.b paramb, bc parambc, com.google.android.gms.ads.internal.webview.b paramb1, boolean paramBoolean, int paramInt, String paramString, VersionInfoParcel paramVersionInfoParcel, ab paramab)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramak;
    this.e = paramb1;
    this.f = paramb;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = parambc;
    this.k = paramInt;
    this.l = 3;
    this.m = paramString;
    this.n = paramVersionInfoParcel;
    this.o = paramab;
    this.p = null;
    this.q = null;
  }

  public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a parama, ak paramak, com.google.android.gms.ads.internal.gmsg.b paramb, bc parambc, com.google.android.gms.ads.internal.webview.b paramb1, boolean paramBoolean, int paramInt, String paramString1, String paramString2, VersionInfoParcel paramVersionInfoParcel, ab paramab)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramak;
    this.e = paramb1;
    this.f = paramb;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = paramString1;
    this.j = parambc;
    this.k = paramInt;
    this.l = 3;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = paramab;
    this.p = null;
    this.q = null;
  }

  public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a parama, ak paramak, bc parambc, com.google.android.gms.ads.internal.webview.b paramb, int paramInt, VersionInfoParcel paramVersionInfoParcel, String paramString, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramak;
    this.e = paramb;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = parambc;
    this.k = paramInt;
    this.l = 1;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = paramString;
    this.q = paramInterstitialAdParameterParcel;
  }

  public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a parama, ak paramak, bc parambc, com.google.android.gms.ads.internal.webview.b paramb, boolean paramBoolean, int paramInt, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramak;
    this.e = paramb;
    this.f = null;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = parambc;
    this.k = paramInt;
    this.l = 2;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = null;
    this.q = null;
  }

  public AdOverlayInfoParcel(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, com.google.android.gms.ads.internal.client.a parama, ak paramak, bc parambc, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = 4;
    this.b = paramAdLauncherIntentInfoParcel;
    this.c = parama;
    this.d = paramak;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = parambc;
    this.k = -1;
    this.l = 4;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = null;
    this.q = null;
  }

  public static AdOverlayInfoParcel a(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      localBundle.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      AdOverlayInfoParcel localAdOverlayInfoParcel = (AdOverlayInfoParcel)localBundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return localAdOverlayInfoParcel;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void a(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.a(paramParcel, 3, apn.a(this.c).asBinder(), false);
    aod.a(paramParcel, 4, apn.a(this.d).asBinder(), false);
    aod.a(paramParcel, 5, apn.a(this.e).asBinder(), false);
    aod.a(paramParcel, 6, apn.a(this.f).asBinder(), false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h);
    aod.a(paramParcel, 9, this.i, false);
    aod.a(paramParcel, 10, apn.a(this.j).asBinder(), false);
    aod.a(paramParcel, 11, this.k);
    aod.a(paramParcel, 12, this.l);
    aod.a(paramParcel, 13, this.m, false);
    aod.a(paramParcel, 14, this.n, paramInt, false);
    aod.a(paramParcel, 15, apn.a(this.o).asBinder(), false);
    aod.a(paramParcel, 16, this.p, false);
    aod.a(paramParcel, 17, this.q, paramInt, false);
    aod.b(paramParcel, i1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
 * JD-Core Version:    0.6.0
 */