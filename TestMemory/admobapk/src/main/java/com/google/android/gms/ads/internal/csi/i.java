package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;

final class i extends f
{
  private static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    int i;
    int j;
    do
    {
      return paramString;
      i = 0;
      j = paramString.length();
      while ((i < paramString.length()) && (paramString.charAt(i) == ','))
        i++;
      while ((j > 0) && (paramString.charAt(j - 1) == ','))
        j--;
    }
    while ((i == 0) && (j == paramString.length()));
    return paramString.substring(i, j);
  }

  public final String a(String paramString1, String paramString2)
  {
    String str1 = a(paramString1);
    String str2 = a(paramString2);
    if (TextUtils.isEmpty(str1))
      return str2;
    if (TextUtils.isEmpty(str2))
      return str1;
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "," + str2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.csi.i
 * JD-Core Version:    0.6.0
 */