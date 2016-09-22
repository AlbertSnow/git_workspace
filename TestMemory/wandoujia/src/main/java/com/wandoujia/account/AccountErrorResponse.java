package com.wandoujia.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.wandoujia.account.dto.WandouResponse;

public class AccountErrorResponse
  implements Parcelable
{
  public static final Parcelable.Creator<AccountErrorResponse> CREATOR = new h();
  private int a;
  private String b;

  private AccountErrorResponse(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
  }

  public final WandouResponse a()
  {
    return new WandouResponse(this.a, this.b);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.AccountErrorResponse
 * JD-Core Version:    0.6.0
 */