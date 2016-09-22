package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import anu;
import anv;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import ov;

public final class ConnectionResult extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final ConnectionResult a = new ConnectionResult(0);
  final int b;
  public final int c;
  public final PendingIntent d;
  final String e;

  static
  {
    CREATOR = new ov();
  }

  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }

  public ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramPendingIntent;
    this.e = paramString;
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }

  private ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, null);
  }

  public final boolean a()
  {
    return (this.c != 0) && (this.d != null);
  }

  public final boolean b()
  {
    return this.c == 0;
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
    while ((this.c == localConnectionResult.c) && (anu.a(this.d, localConnectionResult.d)) && (anu.a(this.e, localConnectionResult.e)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.c);
    arrayOfObject[1] = this.d;
    arrayOfObject[2] = this.e;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    anv localanv = anu.a(this);
    int i = this.c;
    String str;
    switch (i)
    {
    default:
      str = 31 + "UNKNOWN_ERROR_CODE(" + i + ")";
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
    case 19:
    case 20:
    case 21:
    case 42:
    case 1500:
    case 99:
    case -1:
    }
    while (true)
    {
      return localanv.a("statusCode", str).a("resolution", this.d).a("message", this.e).toString();
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
      continue;
      str = "SERVICE_MISSING_PERMISSION";
      continue;
      str = "RESTRICTED_PROFILE";
      continue;
      str = "API_VERSION_UPDATE_REQUIRED";
      continue;
      str = "UPDATE_ANDROID_WEAR";
      continue;
      str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
      continue;
      str = "UNFINISHED";
      continue;
      str = "UNKNOWN";
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.b);
    aod.a(paramParcel, 2, this.c);
    aod.a(paramParcel, 3, this.d, paramInt, false);
    aod.a(paramParcel, 4, this.e, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.6.0
 */