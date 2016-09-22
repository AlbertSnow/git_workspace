package com.unionpay.pboctransaction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AppIdentification
  implements Parcelable, Comparable<AppIdentification>
{
  public static final Parcelable.Creator<AppIdentification> CREATOR = new a();
  private String a;
  private String b;

  private AppIdentification()
  {
    this.a = "";
    this.b = "";
  }

  public AppIdentification(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.a.substring(14, 16);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof AppIdentification)));
    AppIdentification localAppIdentification;
    do
    {
      return false;
      localAppIdentification = (AppIdentification)paramObject;
    }
    while ((!this.a.equalsIgnoreCase(localAppIdentification.a)) || (!this.b.equalsIgnoreCase(localAppIdentification.b)));
    return true;
  }

  public int hashCode()
  {
    return 31 * (31 + this.a.hashCode()) + this.b.hashCode();
  }

  public String toString()
  {
    return "{appId:" + this.a + ", appVersion:" + this.b + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.AppIdentification
 * JD-Core Version:    0.6.0
 */