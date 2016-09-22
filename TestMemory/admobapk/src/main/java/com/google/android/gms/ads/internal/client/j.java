package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.internal.report.client.a;
import mc;
import mi;

@a
public final class j
{
  final mi[] a;
  final String b;

  public j(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, mc.a);
    String str1 = localTypedArray.getString(mc.b);
    String str2 = localTypedArray.getString(mc.c);
    int j;
    if (!TextUtils.isEmpty(str1))
    {
      j = i;
      if (TextUtils.isEmpty(str2))
        break label114;
      label58: if ((j == 0) || (i != 0))
        break label119;
    }
    for (this.a = a(str1); ; this.a = a(str2))
    {
      this.b = localTypedArray.getString(mc.d);
      if (!TextUtils.isEmpty(this.b))
        return;
      throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
      j = 0;
      break;
      label114: i = 0;
      break label58;
      label119: if ((j != 0) || (i == 0))
        break label140;
    }
    label140: if (j != 0)
      throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
  }

  private static mi[] a(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\\s*,\\s*");
    mi[] arrayOfmi = new mi[arrayOfString1.length];
    int i = 0;
    if (i < arrayOfString1.length)
    {
      String str3 = arrayOfString1[i].trim();
      String[] arrayOfString2;
      if (str3.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        arrayOfString2 = str3.split("[xX]");
        arrayOfString2[0] = arrayOfString2[0].trim();
        arrayOfString2[1] = arrayOfString2[1].trim();
      }
      while (true)
      {
        String str6;
        try
        {
          if (!"FULL_WIDTH".equals(arrayOfString2[0]))
            continue;
          int j = -1;
          boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
          if (!bool)
            continue;
          int m = -2;
          arrayOfmi[i] = new mi(j, m);
          i++;
          break;
          j = Integer.parseInt(arrayOfString2[0]);
          continue;
          int k = Integer.parseInt(arrayOfString2[1]);
          m = k;
          continue;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          str6 = String.valueOf(str3);
          if (str6.length() == 0);
        }
        for (String str7 = "Could not parse XML attribute \"adSize\": ".concat(str6); ; str7 = new String("Could not parse XML attribute \"adSize\": "))
          throw new IllegalArgumentException(str7);
        if ("BANNER".equals(str3))
        {
          arrayOfmi[i] = mi.a;
          continue;
        }
        if ("LARGE_BANNER".equals(str3))
        {
          arrayOfmi[i] = mi.c;
          continue;
        }
        if ("FULL_BANNER".equals(str3))
        {
          arrayOfmi[i] = mi.b;
          continue;
        }
        if ("LEADERBOARD".equals(str3))
        {
          arrayOfmi[i] = mi.d;
          continue;
        }
        if ("MEDIUM_RECTANGLE".equals(str3))
        {
          arrayOfmi[i] = mi.e;
          continue;
        }
        if ("SMART_BANNER".equals(str3))
        {
          arrayOfmi[i] = mi.g;
          continue;
        }
        if ("WIDE_SKYSCRAPER".equals(str3))
        {
          arrayOfmi[i] = mi.f;
          continue;
        }
        if (!"FLUID".equals(str3))
          break label355;
        arrayOfmi[i] = mi.h;
      }
      label355: String str4 = String.valueOf(str3);
      if (str4.length() != 0);
      for (String str5 = "Could not parse XML attribute \"adSize\": ".concat(str4); ; str5 = new String("Could not parse XML attribute \"adSize\": "))
        throw new IllegalArgumentException(str5);
    }
    if (arrayOfmi.length == 0)
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0);
      for (String str2 = "Could not parse XML attribute \"adSize\": ".concat(str1); ; str2 = new String("Could not parse XML attribute \"adSize\": "))
        throw new IllegalArgumentException(str2);
    }
    return arrayOfmi;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.j
 * JD-Core Version:    0.6.0
 */