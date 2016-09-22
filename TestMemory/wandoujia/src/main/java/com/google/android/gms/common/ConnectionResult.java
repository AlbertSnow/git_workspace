package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionResult> CREATOR;
  public static final ConnectionResult a = new ConnectionResult(0, null);
  final int b;
  private final int c;
  private final PendingIntent d;

  static
  {
    CREATOR = new c();
  }

  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramPendingIntent;
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramPendingIntent);
  }

  public final void a(Activity paramActivity, int paramInt)
  {
    if (!a())
      return;
    paramActivity.startIntentSenderForResult(this.d.getIntentSender(), paramInt, null, 0, 0, 0);
  }

  public final boolean a()
  {
    return (this.c != 0) && (this.d != null);
  }

  public final boolean b()
  {
    return this.c == 0;
  }

  public final int c()
  {
    return this.c;
  }

  public final PendingIntent d()
  {
    return this.d;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ConnectionResult localConnectionResult;
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult))
        return false;
      localConnectionResult = (ConnectionResult)paramObject;
    }
    while ((this.c == localConnectionResult.c) && (p.a(this.d, localConnectionResult.d)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.c);
    arrayOfObject[1] = this.d;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    q localq = p.a(this);
    int i = this.c;
    String str;
    switch (i)
    {
    case 12:
    default:
      str = "UNKNOWN_ERROR_CODE(" + i + ")";
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    }
    while (true)
    {
      return localq.a("statusCode", str).a("resolution", this.d).toString();
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
      continue;
      str = "CANCELED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "API_UNAVAILABLE";
      continue;
      str = "SIGN_IN_FAILED";
      continue;
      str = "SERVICE_UPDATING";
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.6.0
 */