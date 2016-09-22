package com.google.android.gms.common.api;

import aim;
import aiv;
import aiz;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import anu;
import anv;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable
  implements aiv
{
  public static final Parcelable.Creator CREATOR;
  public static final Status a = new Status(0);
  public static final Status b;
  public static final Status c;
  public static final Status d;
  final int e;
  final int f;
  final String g;
  final PendingIntent h;

  static
  {
    new Status(14);
    b = new Status(8);
    c = new Status(15);
    d = new Status(16);
    new Status(17);
    new Status(18);
    CREATOR = new aiz();
  }

  public Status(int paramInt)
  {
    this(paramInt, null);
  }

  public Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramString;
    this.h = paramPendingIntent;
  }

  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }

  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }

  public final Status a()
  {
    return this;
  }

  public final boolean b()
  {
    return this.f <= 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status));
    Status localStatus;
    do
    {
      return false;
      localStatus = (Status)paramObject;
    }
    while ((this.e != localStatus.e) || (this.f != localStatus.f) || (!anu.a(this.g, localStatus.g)) || (!anu.a(this.h, localStatus.h)));
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.e);
    arrayOfObject[1] = Integer.valueOf(this.f);
    arrayOfObject[2] = this.g;
    arrayOfObject[3] = this.h;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    anv localanv = anu.a(this);
    if (this.g != null);
    for (String str = this.g; ; str = aim.a(this.f))
      return localanv.a("statusCode", str).a("resolution", this.h).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.f);
    aod.a(paramParcel, 2, this.g, false);
    aod.a(paramParcel, 3, this.h, paramInt, false);
    aod.a(paramParcel, 1000, this.e);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.6.0
 */