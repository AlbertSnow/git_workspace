package com.wandoujia.base.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PathAdjustUtil
{
  private static final String SDCARD_EMULATED = "storage/emulated/";
  private static final String SDCARD_REAL = "storage/sdcard";

  public static String adjustSdcardPathForAdb(String paramString)
  {
    if (Pattern.compile("^/storage/emulated/\\d{1,2}").matcher(paramString).find())
      paramString = paramString.replace("storage/emulated/", "storage/sdcard");
    return paramString;
  }

  public static String adjustSdcardPathForApp(String paramString)
  {
    if (Pattern.compile("^/storage/sdcard\\d{1,2}").matcher(paramString).find())
      paramString = paramString.replace("storage/sdcard", "storage/emulated/");
    return paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.PathAdjustUtil
 * JD-Core Version:    0.6.0
 */