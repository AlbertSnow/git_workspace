package com.wandoujia.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AccountCustomParams
  implements Parcelable
{
  public static final Parcelable.Creator<AccountCustomParams> CREATOR = new g();
  private boolean a;
  private boolean b;
  private String c;
  private String d = "";

  private AccountCustomParams(Parcel paramParcel)
  {
    int j;
    if (paramParcel.readByte() == i)
    {
      j = i;
      this.a = j;
      if (paramParcel.readByte() != i)
        break label62;
    }
    while (true)
    {
      this.b = i;
      this.d = paramParcel.readString();
      this.c = paramParcel.readString();
      return;
      j = 0;
      break;
      label62: i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    int j;
    if (this.a)
    {
      j = i;
      paramParcel.writeByte((byte)j);
      if (!this.b)
        break label55;
    }
    while (true)
    {
      paramParcel.writeByte((byte)i);
      paramParcel.writeString(this.d);
      paramParcel.writeString(this.c);
      return;
      j = 0;
      break;
      label55: i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.AccountCustomParams
 * JD-Core Version:    0.6.0
 */