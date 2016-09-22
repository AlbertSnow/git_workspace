package com.alipay.wandoujia;

import android.text.TextUtils;
import com.alipay.android.app.d;
import com.wandoujia.image.c.a;
import org.json.JSONObject;

public final class u
{
  r a = null;
  private int b = 0;
  private String c = "";
  private long d = 0L;
  private String e = "";
  private String f = null;
  private String g = null;
  private JSONObject h = null;
  private String i;
  private md j = a.a().c().v();
  private boolean k = true;

  private String k()
  {
    try
    {
      Object localObject = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder("resultStatus={").append(this.e).append("}").toString())).append(";").toString())).append("memo={").append(this.g).append("}").toString())).append(";").toString() + "result={" + this.f + "}";
      if (this.f.contains("success=\"true\""))
      {
        int m = this.f.indexOf("call_back_url");
        if (m != -1)
        {
          int n = this.f.indexOf("\"", m);
          String str1 = this.f;
          int i1 = n + 1;
          int i2 = str1.indexOf("\"", i1);
          if ((i1 > 0) && (i2 > i1))
          {
            String str2 = this.f.substring(i1, i2);
            String str3 = localObject + ";callBackUrl={" + str2 + "}";
            localObject = str3;
          }
        }
      }
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return (String)this.f;
  }

  public final r a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
  }

  public final void a(long paramLong)
  {
    this.d = paramLong;
  }

  public final void a(md parammd)
  {
    this.j = parammd;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.h = paramJSONObject;
  }

  public final void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public final void b(String paramString)
  {
    this.e = paramString;
  }

  public final boolean b()
  {
    return this.k;
  }

  public final JSONObject c()
  {
    return this.h;
  }

  public final void c(String paramString)
  {
    this.f = paramString;
  }

  public final long d()
  {
    return this.d;
  }

  public final void d(String paramString)
  {
    this.g = paramString;
  }

  public final void e(String paramString)
  {
    this.i = paramString;
  }

  public final boolean e()
  {
    return !TextUtils.equals(this.e, "0");
  }

  public final String f()
  {
    return k();
  }

  public final String g()
  {
    return this.i;
  }

  public final int h()
  {
    return this.b;
  }

  public final String i()
  {
    return this.c;
  }

  public final md j()
  {
    return this.j;
  }

  public final String toString()
  {
    String str = this.a.toString() + ", code = " + this.b + ", errorMsg = " + this.c + ", timeStamp = " + this.d + ", endCode = " + this.e;
    if (this.h != null)
      str = str + ", reflectedData = " + this.h;
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.u
 * JD-Core Version:    0.6.0
 */