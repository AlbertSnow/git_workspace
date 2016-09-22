package com.wandoujia.base.utils;

import java.util.List;

public class StringUtil
{
  public static boolean isLowerCase(char paramChar)
  {
    return (paramChar >= 'a') && (paramChar <= 'z');
  }

  public static String join(List<String> paramList, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramList.size(); i++)
    {
      String str = (String)paramList.get(i);
      if (str != null)
        localStringBuilder.append(str);
      if (i >= -1 + paramList.size())
        continue;
      localStringBuilder.append(paramString);
    }
    return localStringBuilder.toString();
  }

  public static char toUpperCase(char paramChar)
  {
    if (isLowerCase(paramChar))
      paramChar = (char)(paramChar & 0x5F);
    return paramChar;
  }

  public static String toUpperCase(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    for (int j = 0; j < i; j++)
      localStringBuilder.append(toUpperCase(paramString.charAt(j)));
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.StringUtil
 * JD-Core Version:    0.6.0
 */