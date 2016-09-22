package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public final class AdLauncherIntentInfoParcel extends AbstractSafeParcelable
{
  public static final s CREATOR = new s();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final String h;
  public final Intent i;

  public AdLauncherIntentInfoParcel(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramIntent;
  }

  public AdLauncherIntentInfoParcel(Intent paramIntent)
  {
    this(2, null, null, null, null, null, null, null, paramIntent);
  }

  public AdLauncherIntentInfoParcel(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, false);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h, false);
    aod.a(paramParcel, 9, this.i, paramInt, false);
    aod.b(paramParcel, j);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel
 * JD-Core Version:    0.6.0
 */