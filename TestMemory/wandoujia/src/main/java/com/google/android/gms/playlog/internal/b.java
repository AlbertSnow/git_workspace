package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public final class b
  implements Parcelable.Creator<PlayLoggerContext>
{
  public static PlayLoggerContext a(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int i = android.support.v4.app.b.a(paramParcel);
    boolean bool2 = true;
    String str2 = null;
    String str3 = null;
    int j = 0;
    int k = 0;
    String str4 = null;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default:
        android.support.v4.app.b.b(paramParcel, n);
        break;
      case 1:
        m = android.support.v4.app.b.d(paramParcel, n);
        break;
      case 2:
        str4 = android.support.v4.app.b.j(paramParcel, n);
        break;
      case 3:
        k = android.support.v4.app.b.d(paramParcel, n);
        break;
      case 4:
        j = android.support.v4.app.b.d(paramParcel, n);
        break;
      case 5:
        str3 = android.support.v4.app.b.j(paramParcel, n);
        break;
      case 6:
        str2 = android.support.v4.app.b.j(paramParcel, n);
        break;
      case 7:
        bool2 = android.support.v4.app.b.c(paramParcel, n);
        break;
      case 8:
        str1 = android.support.v4.app.b.j(paramParcel, n);
        break;
      case 9:
        bool1 = android.support.v4.app.b.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    return new PlayLoggerContext(m, str4, k, j, str3, str2, bool2, str1, bool1);
  }

  static void a(PlayLoggerContext paramPlayLoggerContext, Parcel paramParcel)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramPlayLoggerContext.a);
    android.support.v4.app.b.a(paramParcel, 2, paramPlayLoggerContext.b);
    android.support.v4.app.b.a(paramParcel, 3, paramPlayLoggerContext.c);
    android.support.v4.app.b.a(paramParcel, 4, paramPlayLoggerContext.d);
    android.support.v4.app.b.a(paramParcel, 5, paramPlayLoggerContext.e);
    android.support.v4.app.b.a(paramParcel, 6, paramPlayLoggerContext.f);
    android.support.v4.app.b.a(paramParcel, 7, paramPlayLoggerContext.g);
    android.support.v4.app.b.a(paramParcel, 8, paramPlayLoggerContext.h);
    android.support.v4.app.b.a(paramParcel, 9, paramPlayLoggerContext.i);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.playlog.internal.b
 * JD-Core Version:    0.6.0
 */