package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyResponse> CREATOR = new b();
  final int a;
  public final int b;
  public final PendingIntent c;
  public final int d;
  final Bundle e;
  public final byte[] f;

  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.e = paramBundle;
    this.f = paramArrayOfByte;
    this.c = paramPendingIntent;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyResponse
 * JD-Core Version:    0.6.0
 */