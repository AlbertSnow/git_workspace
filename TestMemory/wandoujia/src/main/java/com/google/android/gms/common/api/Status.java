package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class Status
  implements SafeParcelable
{
  public static final Parcelable.Creator<Status> CREATOR;
  private final int a;
  private final int b;
  private final String c;
  private final PendingIntent d;

  static
  {
    new Status(0);
    new Status(14);
    new Status(8);
    new Status(15);
    new Status(16);
    CREATOR = new r();
  }

  public Status(int paramInt)
  {
    this(paramInt, null);
  }

  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    this.d = paramPendingIntent;
  }

  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }

  final PendingIntent a()
  {
    return this.d;
  }

  public final String b()
  {
    return this.c;
  }

  final int c()
  {
    return this.a;
  }

  public final int d()
  {
    return this.b;
  }

  public final int describeContents()
  {
    return 0;
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
    while ((this.a != localStatus.a) || (this.b != localStatus.b) || (!p.a(this.c, localStatus.c)) || (!p.a(this.d, localStatus.d)));
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    q localq = p.a(this);
    String str;
    if (this.c != null)
      str = this.c;
    while (true)
    {
      return localq.a("statusCode", str).a("resolution", this.d).toString();
      int i = this.b;
      switch (i)
      {
      default:
        str = "unknown status code: " + i;
        break;
      case -1:
        str = "SUCCESS_CACHE";
        break;
      case 0:
        str = "SUCCESS";
        break;
      case 1:
        str = "SERVICE_MISSING";
        break;
      case 2:
        str = "SERVICE_VERSION_UPDATE_REQUIRED";
        break;
      case 3:
        str = "SERVICE_DISABLED";
        break;
      case 4:
        str = "SIGN_IN_REQUIRED";
        break;
      case 5:
        str = "INVALID_ACCOUNT";
        break;
      case 6:
        str = "RESOLUTION_REQUIRED";
        break;
      case 7:
        str = "NETWORK_ERROR";
        break;
      case 8:
        str = "INTERNAL_ERROR";
        break;
      case 9:
        str = "SERVICE_INVALID";
        break;
      case 10:
        str = "DEVELOPER_ERROR";
        break;
      case 11:
        str = "LICENSE_CHECK_FAILED";
        break;
      case 13:
        str = "ERROR_OPERATION_FAILED";
        break;
      case 14:
        str = "INTERRUPTED";
        break;
      case 15:
        str = "TIMEOUT";
        break;
      case 16:
        str = "CANCELED";
        break;
      case 3000:
        str = "AUTH_API_INVALID_CREDENTIALS";
        break;
      case 3001:
        str = "AUTH_API_ACCESS_FORBIDDEN";
        break;
      case 3002:
        str = "AUTH_API_CLIENT_ERROR";
        break;
      case 3003:
        str = "AUTH_API_SERVER_ERROR";
        break;
      case 3004:
        str = "AUTH_TOKEN_ERROR";
        break;
      case 3005:
        str = "AUTH_URL_RESOLUTION";
      }
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.6.0
 */