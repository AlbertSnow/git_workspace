package com.sina.weibo.sdk.component;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private int a = -2;
  private String b;

  public static f a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    f localf = new f();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localf.a = localJSONObject.optInt("code", -2);
      localf.b = localJSONObject.optString("data", "");
      return localf;
    }
    catch (JSONException localJSONException)
    {
    }
    return localf;
  }

  public final int a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.f
 * JD-Core Version:    0.6.0
 */