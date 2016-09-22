package com.alipay.android.app.pay;

import android.support.v4.app.b;

public final class d
{
  String a;
  String b;
  String c;

  public d(String paramString)
  {
    int i;
    int j;
    do
      try
      {
        String[] arrayOfString = paramString.split(";");
        i = arrayOfString.length;
        j = 0;
        continue;
        String str = arrayOfString[j];
        if (str.startsWith("resultStatus"))
          this.a = a(str, "resultStatus");
        if (str.startsWith("result"))
          this.b = a(str, "result");
        if (str.startsWith("memo"))
          this.c = a(str, "memo");
        j++;
      }
      catch (Exception localException)
      {
        b.b(localException);
        return;
      }
    while (j < i);
  }

  private static String a(String paramString1, String paramString2)
  {
    String str = paramString2 + "={";
    return paramString1.substring(paramString1.indexOf(str) + str.length(), paramString1.indexOf("}"));
  }

  public final String toString()
  {
    return "resultStatus : " + this.a + ", result = " + this.b + ", memo = " + this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.d
 * JD-Core Version:    0.6.0
 */