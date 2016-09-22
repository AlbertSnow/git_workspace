package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new c();
  final int a;
  final List<AccountChangeEvent> b;

  AccountChangeEventsResponse(int paramInt, List<AccountChangeEvent> paramList)
  {
    this.a = paramInt;
    this.b = ((List)d.a(paramList));
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEventsResponse
 * JD-Core Version:    0.6.0
 */