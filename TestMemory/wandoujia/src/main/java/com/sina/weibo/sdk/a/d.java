package com.sina.weibo.sdk.a;

import com.sina.weibo.sdk.exception.WeiboException;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private String a;

  public static d a(String paramString)
  {
    d locald = new d();
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject(paramString);
      if ((localJSONObject.has("error")) || (localJSONObject.has("error_code")))
        throw new WeiboException("loadAidFromNet has error !!!");
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder("loadAidFromNet JSONException Msg : ").append(localJSONException.getMessage());
      throw new WeiboException("loadAidFromNet has error !!!");
    }
    locald.a = localJSONObject.optString("aid", "");
    localJSONObject.optString("sub", "");
    return locald;
  }

  public final String a()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.d
 * JD-Core Version:    0.6.0
 */