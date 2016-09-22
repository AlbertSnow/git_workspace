package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import aod;
import apj;
import apk;
import apn;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@com.google.android.gms.ads.internal.report.client.a
public final class GInAppPurchaseManagerInfoParcel extends AbstractSafeParcelable
{
  public static final a CREATOR = new a();
  public final int a;
  public final n b;
  public final com.google.android.gms.ads.internal.purchase.client.a c;
  public final Context d;
  public final m e;

  GInAppPurchaseManagerInfoParcel(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    this.a = paramInt;
    this.b = ((n)apn.a(apk.a(paramIBinder1)));
    this.c = ((com.google.android.gms.ads.internal.purchase.client.a)apn.a(apk.a(paramIBinder2)));
    this.d = ((Context)apn.a(apk.a(paramIBinder3)));
    this.e = ((m)apn.a(apk.a(paramIBinder4)));
  }

  public GInAppPurchaseManagerInfoParcel(Context paramContext, n paramn, com.google.android.gms.ads.internal.purchase.client.a parama, m paramm)
  {
    this.a = 2;
    this.d = paramContext;
    this.b = paramn;
    this.c = parama;
    this.e = paramm;
  }

  public static GInAppPurchaseManagerInfoParcel a(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      localBundle.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
      GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = (GInAppPurchaseManagerInfoParcel)localBundle.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      return localGInAppPurchaseManagerInfoParcel;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void a(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 3, apn.a(this.b).asBinder(), false);
    aod.a(paramParcel, 4, apn.a(this.c).asBinder(), false);
    aod.a(paramParcel, 5, apn.a(this.d).asBinder(), false);
    aod.a(paramParcel, 6, apn.a(this.e).asBinder(), false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel
 * JD-Core Version:    0.6.0
 */