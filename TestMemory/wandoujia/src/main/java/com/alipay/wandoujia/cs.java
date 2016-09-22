package com.alipay.wandoujia;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.image.c.a;

public final class cs
{
  private static String a = "#@";
  private static String b = "@#";

  public static String a(String paramString1, String paramString2)
  {
    int i = paramString1.indexOf(a);
    if (i <= 0)
      return paramString1;
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString1.lastIndexOf(b);
    String str = paramString1.substring(0, i);
    if (!TextUtils.isEmpty(str))
      localStringBuilder.append(str);
    localStringBuilder.append(" " + paramString2);
    if ((j > 0) && (paramString1.length() > j + b.length()))
      localStringBuilder.append(paramString1.substring(j + b.length()));
    return localStringBuilder.toString();
  }

  public static String[] a(String paramString)
  {
    String[] arrayOfString = paramString.substring(1 + paramString.indexOf('('), paramString.lastIndexOf(')')).replaceAll("'", "").replaceAll("\"", "").split(",");
    if (arrayOfString != null);
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfString.length)
        return arrayOfString;
      if (TextUtils.isEmpty(arrayOfString[i]))
        continue;
      arrayOfString[i] = arrayOfString[i].trim();
      arrayOfString[i].replace("'", "");
    }
  }

  public static void b(String paramString)
  {
    String[] arrayOfString = a(paramString);
    if (arrayOfString.length != 3);
    Context localContext;
    ac localac;
    do
    {
      do
        return;
      while (!TextUtils.equals("tid", arrayOfString[0]));
      localContext = a.a().b();
      localac = ac.e();
    }
    while ((TextUtils.isEmpty(arrayOfString[1])) || (TextUtils.isEmpty(arrayOfString[2])));
    localac.a(arrayOfString[1]);
    localac.b(arrayOfString[2]);
    localac.a(localContext);
  }

  public static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return null;
    while ((!paramString.contains(a)) && (!paramString.contains(b)));
    return paramString.substring(paramString.indexOf(a) + a.length(), paramString.lastIndexOf(b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cs
 * JD-Core Version:    0.6.0
 */