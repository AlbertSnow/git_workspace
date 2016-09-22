package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<BinderWrapper> CREATOR = new a();
  private IBinder a = null;

  public BinderWrapper()
  {
  }

  private BinderWrapper(Parcel paramParcel)
  {
    this.a = paramParcel.readStrongBinder();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.BinderWrapper
 * JD-Core Version:    0.6.0
 */