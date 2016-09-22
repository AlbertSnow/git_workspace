package com.wandoujia.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ScanItem
  implements Parcelable
{
  public static final Parcelable.Creator<ScanItem> CREATOR = new e();
  private int a;
  private String b;
  private String c;
  private String d;
  private long e;
  private long f;
  private long g;
  private int h;
  private String i;
  private String j;

  private ScanItem(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readLong();
    this.f = paramParcel.readLong();
    this.g = paramParcel.readLong();
    this.h = paramParcel.readInt();
    this.i = paramParcel.readString();
    this.j = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeLong(this.e);
    paramParcel.writeLong(this.f);
    paramParcel.writeLong(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.ScanItem
 * JD-Core Version:    0.6.0
 */