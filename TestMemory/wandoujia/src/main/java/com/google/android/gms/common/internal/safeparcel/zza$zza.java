package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class zza$zza extends RuntimeException
{
  public zza$zza(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.zza.zza
 * JD-Core Version:    0.6.0
 */