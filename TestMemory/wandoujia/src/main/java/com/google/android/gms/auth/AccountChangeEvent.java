package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new a();
  final int a;
  final long b;
  final String c;
  final int d;
  final int e;
  final String f;

  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = ((String)d.a(paramString1));
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (true)
    {
      return true;
      if (!(paramObject instanceof AccountChangeEvent))
        break;
      AccountChangeEvent localAccountChangeEvent = (AccountChangeEvent)paramObject;
      if ((this.a != localAccountChangeEvent.a) || (this.b != localAccountChangeEvent.b) || (!p.a(this.c, localAccountChangeEvent.c)) || (this.d != localAccountChangeEvent.d) || (this.e != localAccountChangeEvent.e) || (!p.a(this.f, localAccountChangeEvent.f)))
        return false;
    }
    return false;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = Integer.valueOf(this.e);
    arrayOfObject[5] = this.f;
    return Arrays.hashCode(arrayOfObject);
  }

  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.d)
    {
    default:
    case 1:
    case 2:
    case 4:
    case 3:
    }
    while (true)
    {
      return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEvent
 * JD-Core Version:    0.6.0
 */