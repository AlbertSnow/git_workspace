package com.sina.weibo.sdk.auth;

import android.os.Bundle;
import android.text.TextUtils;

public final class b
{
  private String a = "";
  private String b = "";
  private String c = "";
  private long d = 0L;

  public b()
  {
  }

  public b(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.d = System.currentTimeMillis();
    if (paramString2 != null)
      this.d += 1000L * Long.parseLong(paramString2);
  }

  public static b a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      b localb = new b();
      localb.a = a(paramBundle, "uid", "");
      localb.b = a(paramBundle, "access_token", "");
      String str = a(paramBundle, "expires_in", "");
      if ((!TextUtils.isEmpty(str)) && (!str.equals("0")))
        localb.d = (System.currentTimeMillis() + 1000L * Long.parseLong(str));
      localb.c = a(paramBundle, "refresh_token", "");
      return localb;
    }
    return null;
  }

  private static String a(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramBundle != null)
    {
      String str = paramBundle.getString(paramString1);
      if (str != null)
        paramString2 = str;
    }
    return paramString2;
  }

  public final boolean a()
  {
    return !TextUtils.isEmpty(this.b);
  }

  public final String b()
  {
    return this.b;
  }

  public final String toString()
  {
    return "uid: " + this.a + ", access_token: " + this.b + ", refresh_token: " + this.c + ", expires_in: " + Long.toString(this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.b
 * JD-Core Version:    0.6.0
 */