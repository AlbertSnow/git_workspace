package com.wandoujia.ripple_framework.log;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Logger$PageParameter
  implements Parcelable
{
  public static final Parcelable.Creator<PageParameter> CREATOR = new f();
  public String a;
  public String b;

  protected Logger$PageParameter(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }

  public Logger$PageParameter(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
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
 * Qualified Name:     com.wandoujia.ripple_framework.log.Logger.PageParameter
 * JD-Core Version:    0.6.0
 */