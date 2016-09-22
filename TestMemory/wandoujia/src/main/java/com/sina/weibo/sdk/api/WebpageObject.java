package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class WebpageObject extends BaseMediaObject
{
  public static final Parcelable.Creator<WebpageObject> CREATOR = new g();
  private String b;

  public WebpageObject()
  {
  }

  public WebpageObject(Parcel paramParcel)
  {
    super(paramParcel);
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
    return super.a();
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
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.WebpageObject
 * JD-Core Version:    0.6.0
 */