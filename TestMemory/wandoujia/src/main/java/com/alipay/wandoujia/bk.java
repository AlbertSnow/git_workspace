package com.alipay.wandoujia;

import android.support.v4.app.d;

public enum bk
{
  private String e;
  private String f;
  private String g;

  static
  {
    bk[] arrayOfbk = new bk[4];
    arrayOfbk[0] = a;
    arrayOfbk[1] = b;
    arrayOfbk[2] = c;
    arrayOfbk[3] = d;
    h = arrayOfbk;
  }

  private bk(String paramString3, String arg4, String arg5)
  {
    this.e = paramString3;
    Object localObject1;
    this.f = localObject1;
    Object localObject2;
    this.g = localObject2;
  }

  public static bk a(String paramString)
  {
    bk[] arrayOfbk = values();
    int i = arrayOfbk.length;
    for (int j = 0; ; j++)
    {
      bk localbk;
      if (j >= i)
        localbk = c;
      do
      {
        return localbk;
        localbk = arrayOfbk[j];
      }
      while (localbk.a().equalsIgnoreCase(paramString));
    }
  }

  public final String a()
  {
    return this.e;
  }

  public final int b()
  {
    return d.b(this.g);
  }

  public final int c()
  {
    return d.b(this.f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bk
 * JD-Core Version:    0.6.0
 */