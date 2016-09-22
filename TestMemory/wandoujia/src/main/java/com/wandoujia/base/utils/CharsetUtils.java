package com.wandoujia.base.utils;

import android.os.Build;
import java.nio.charset.Charset;

public final class CharsetUtils
{
  private static final String VENDOR_DOCOMO = "docomo";

  public static Charset charsetForVendor(String paramString)
  {
    return charsetForVendor(paramString, getDefaultVendor());
  }

  public static Charset charsetForVendor(String paramString1, String paramString2)
  {
    return Charset.forName(nameForVendor(paramString1, paramString2));
  }

  private static String getDefaultVendor()
  {
    return Build.BRAND;
  }

  private static boolean isShiftJis(String paramString)
  {
    if (paramString == null);
    int i;
    do
    {
      return false;
      i = paramString.length();
    }
    while (((i != 4) && (i != 9)) || ((!paramString.equalsIgnoreCase("shift_jis")) && (!paramString.equalsIgnoreCase("shift-jis")) && (!paramString.equalsIgnoreCase("sjis"))));
    return true;
  }

  public static String nameForDefaultVendor(String paramString)
  {
    return nameForVendor(paramString, getDefaultVendor());
  }

  public static String nameForVendor(String paramString1, String paramString2)
  {
    if ((paramString2.equalsIgnoreCase("docomo")) && (isShiftJis(paramString1)))
      paramString1 = "docomo-shift_jis-2007";
    return paramString1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.CharsetUtils
 * JD-Core Version:    0.6.0
 */