package com.wandoujia.base.utils;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameUtil
{
  private static final char EXTENSION_SEPARATOR = '.';
  private static final Pattern ILLEGAL_GEGX_PATTERN = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\]\\ <>/?~！@#￥%……&*（）/——+|{}【】‘；：”“’。，、？]");
  private static final String ILLEGAL_REGX = "[`~!@#$%^&*()+=|{}':;',\\[\\]\\ <>/?~！@#￥%……&*（）/——+|{}【】‘；：”“’。，、？]";
  private static final char LINUX_SEPARATOR = '/';

  public static String getBaseName(String paramString)
  {
    return removeExtension(getFileName(paramString));
  }

  public static String getExtension(String paramString)
  {
    if (paramString == null)
      return null;
    int i = indexOfExtension(paramString);
    if (i == -1)
      return "";
    return paramString.substring(i + 1);
  }

  public static String getFileName(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    return paramString.substring(1 + indexOfLastSeparator(paramString));
  }

  public static int getFirstSeparatorPos(String paramString, char paramChar)
  {
    if (TextUtils.isEmpty(paramString))
      return -1;
    return paramString.indexOf(paramChar);
  }

  public static String getFullPath(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    return paramString.substring(0, 1 + indexOfLastSeparator(paramString));
  }

  public static int indexOfExtension(String paramString)
  {
    if (paramString == null);
    int i;
    do
    {
      return -1;
      i = paramString.lastIndexOf('.');
    }
    while (indexOfLastSeparator(paramString) > i);
    return i;
  }

  private static int indexOfLastSeparator(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return -1;
    return paramString.lastIndexOf('/');
  }

  public static String removeExtension(String paramString)
  {
    if (paramString == null)
      paramString = null;
    int i;
    do
    {
      return paramString;
      i = indexOfExtension(paramString);
    }
    while (i == -1);
    return paramString.substring(0, i);
  }

  public static String removeIllegalChars(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    return ILLEGAL_GEGX_PATTERN.matcher(paramString).replaceAll("_").trim();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.FileNameUtil
 * JD-Core Version:    0.6.0
 */