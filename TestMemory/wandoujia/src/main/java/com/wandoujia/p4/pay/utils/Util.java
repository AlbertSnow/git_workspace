package com.wandoujia.p4.pay.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
  public static String dateTime()
  {
    return dateTime("yyyy-MM-dd HH:mm:ss");
  }

  public static String dateTime(String paramString)
  {
    return new SimpleDateFormat(paramString).format(new Date());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.Util
 * JD-Core Version:    0.6.0
 */