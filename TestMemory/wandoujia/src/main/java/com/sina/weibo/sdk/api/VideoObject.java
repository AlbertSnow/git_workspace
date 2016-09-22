package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoObject extends BaseMediaObject
{
  public static final Parcelable.Creator<VideoObject> CREATOR = new e();
  private String b;
  private String c;
  private String d;
  private String e;
  private int f;

  public VideoObject()
  {
  }

  public VideoObject(Parcel paramParcel)
  {
    super(paramParcel);
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readInt();
  }

  protected final BaseMediaObject a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    try
    {
      this.b = new JSONObject(paramString).optString("extra_key_defaulttext");
      return this;
    }
    catch (JSONException localJSONException)
    {
    }
    return this;
  }

  public final boolean a()
  {
    if (!super.a());
    do
      return false;
    while (((this.d != null) && (this.d.length() > 512)) || ((this.e != null) && (this.e.length() > 512)) || (this.f <= 0));
    return true;
  }

  protected final String b()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      if (!TextUtils.isEmpty(this.b))
        localJSONObject.put("extra_key_defaulttext", this.b);
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return "";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.VideoObject
 * JD-Core Version:    0.6.0
 */