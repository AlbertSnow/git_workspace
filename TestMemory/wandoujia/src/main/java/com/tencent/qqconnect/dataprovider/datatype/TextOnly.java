package com.tencent.qqconnect.dataprovider.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TextOnly
  implements Parcelable
{
  public static final Parcelable.Creator<TextOnly> CREATOR = new b();
  private String a;

  private TextOnly(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.qqconnect.dataprovider.datatype.TextOnly
 * JD-Core Version:    0.6.0
 */