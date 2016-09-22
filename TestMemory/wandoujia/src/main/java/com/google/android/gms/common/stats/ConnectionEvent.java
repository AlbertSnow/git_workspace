package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();
  final int a;
  private final long b;
  private int c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final long j;
  private final long k;

  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong2;
    this.k = paramLong3;
  }

  public final long a()
  {
    return this.b;
  }

  public final int b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final String d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.f;
  }

  public final String f()
  {
    return this.g;
  }

  public final String g()
  {
    return this.h;
  }

  public final String h()
  {
    return this.i;
  }

  public final long i()
  {
    return this.k;
  }

  public final long j()
  {
    return this.j;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEvent
 * JD-Core Version:    0.6.0
 */