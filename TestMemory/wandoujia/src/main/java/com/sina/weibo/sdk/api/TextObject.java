package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class TextObject extends BaseMediaObject
{
  public static final Parcelable.Creator<TextObject> CREATOR = new d();
  public String b;

  public TextObject()
  {
  }

  public TextObject(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
  }

  protected final BaseMediaObject a(String paramString)
  {
    return this;
  }

  public final boolean a()
  {
    return (this.b != null) && (this.b.length() != 0) && (this.b.length() <= 1024);
  }

  protected final String b()
  {
    return "";
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.TextObject
 * JD-Core Version:    0.6.0
 */