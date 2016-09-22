package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new a();
  final int a;
  public final String b;
  public final int c;
  public final long d;
  public final byte[] e;
  Bundle f;

  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramLong;
    this.e = paramArrayOfByte;
    this.f = paramBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "ProxyRequest[ url: " + this.b + ", method: " + this.c + " ]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyRequest
 * JD-Core Version:    0.6.0
 */