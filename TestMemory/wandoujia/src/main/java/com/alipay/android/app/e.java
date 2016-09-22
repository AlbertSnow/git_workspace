package com.alipay.android.app;

import java.util.Locale;
import org.json.JSONObject;

public final class e
{
  String a;
  String b;
  String c;
  String d;
  String e;
  String f;
  String g;
  int h = 4000;
  int i = 15;
  String j;

  public e()
  {
    this(null);
  }

  public e(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      return;
    this.a = paramJSONObject.optString("alixtid", "");
    this.b = paramJSONObject.optString("config", "");
    this.c = paramJSONObject.optString("errorMessage", "");
    this.d = paramJSONObject.optString("downloadMessage", "");
    this.e = paramJSONObject.optString("downloadType", "");
    this.f = paramJSONObject.optString("downloadUrl", "");
    this.g = paramJSONObject.optString("downloadVersion", "");
    this.h = paramJSONObject.optInt("state", 4000);
    this.i = paramJSONObject.optInt("timeout", 15);
    this.j = paramJSONObject.optString("url", "");
  }

  public final String toString()
  {
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[10];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = this.g;
    arrayOfObject[7] = Integer.valueOf(this.h);
    arrayOfObject[8] = Integer.valueOf(this.i);
    arrayOfObject[9] = this.j;
    return String.format(localLocale, "alixtid = %s, config = %s, errorMessage = %s, downloadMessage = %s, downloadType = %s, downloadUrl = %s, downloadVersion = %s, state = %d, timeout = %d, url = %s", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.e
 * JD-Core Version:    0.6.0
 */