package com.sina.weibo.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  private String a;
  private String b;
  private int c;

  public e(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      if ((localJSONObject.has("error")) || (localJSONObject.has("error_code")))
      {
        b.b();
        return;
      }
      this.b = localJSONObject.optString("sdk_url", "");
      this.a = localJSONObject.optString("sdk_push", "");
      this.c = localJSONObject.optInt("version_code");
      return;
    }
    catch (JSONException localJSONException)
    {
      b.b();
      new StringBuilder("parse NotificationInfo error: ").append(localJSONException.getMessage());
    }
  }

  public final boolean a()
  {
    return !TextUtils.isEmpty(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.e
 * JD-Core Version:    0.6.0
 */