package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class BaseMediaObject
  implements Parcelable
{
  public String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private byte[] f;

  public BaseMediaObject()
  {
  }

  public BaseMediaObject(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.createByteArray();
  }

  protected abstract BaseMediaObject a(String paramString);

  protected boolean a()
  {
    if ((this.a == null) || (this.a.length() > 512))
      return false;
    if ((this.c == null) || (this.c.length() > 512))
      return false;
    if ((this.f == null) || (this.f.length > 32768))
    {
      StringBuilder localStringBuilder = new StringBuilder("checkArgs fail, thumbData is invalid,size is ");
      if (this.f != null);
      for (int i = this.f.length; ; i = -1)
      {
        localStringBuilder.append(i).append("! more then 32768.");
        return false;
      }
    }
    if ((this.d == null) || (this.d.length() > 512))
      return false;
    return (this.e != null) && (this.e.length() <= 1024);
  }

  protected abstract String b();

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeByteArray(this.f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.BaseMediaObject
 * JD-Core Version:    0.6.0
 */