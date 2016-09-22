package com.unipay.d;

import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;

  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
  }

  public final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("packageName", this.a);
      localJSONObject.put("androidos", this.b);
      localJSONObject.put("softversion", this.c);
      localJSONObject.put("root", this.d);
      localJSONObject.put("open", this.e);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONObject;
  }

  public final String b()
  {
    return this.e;
  }

  public final String c()
  {
    return this.a;
  }

  public final String d()
  {
    return this.b;
  }

  public final String e()
  {
    return this.c;
  }

  public final String f()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.d.d
 * JD-Core Version:    0.6.0
 */