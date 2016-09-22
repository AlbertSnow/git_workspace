package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.File;

public class ImageObject extends BaseMediaObject
{
  public static final Parcelable.Creator<ImageObject> CREATOR = new b();
  public byte[] b;
  public String c;

  public ImageObject()
  {
  }

  public ImageObject(Parcel paramParcel)
  {
    this.b = paramParcel.createByteArray();
    this.c = paramParcel.readString();
  }

  protected final BaseMediaObject a(String paramString)
  {
    return this;
  }

  public final boolean a()
  {
    if ((this.b == null) && (this.c == null));
    while (true)
    {
      return false;
      if (((this.b != null) && (this.b.length > 2097152)) || ((this.c != null) && (this.c.length() > 512)))
        continue;
      File localFile;
      if (this.c != null)
        localFile = new File(this.c);
      try
      {
        if ((!localFile.exists()) || (localFile.length() == 0L))
          continue;
        long l = localFile.length();
        if (l <= 10485760L)
          return true;
      }
      catch (SecurityException localSecurityException)
      {
      }
    }
    return false;
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
    paramParcel.writeByteArray(this.b);
    paramParcel.writeString(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.ImageObject
 * JD-Core Version:    0.6.0
 */