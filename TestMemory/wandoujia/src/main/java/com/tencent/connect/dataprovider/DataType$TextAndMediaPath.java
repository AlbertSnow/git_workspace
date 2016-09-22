package com.tencent.connect.dataprovider;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DataType$TextAndMediaPath
  implements Parcelable
{
  public static final Parcelable.Creator<TextAndMediaPath> CREATOR = new a();
  private String a;
  private String b;

  private DataType$TextAndMediaPath(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.dataprovider.DataType.TextAndMediaPath
 * JD-Core Version:    0.6.0
 */