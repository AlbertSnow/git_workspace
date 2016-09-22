package com.tencent.open.a;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class b
{
  private String a = "Tracer.File";
  private int b = 4096;
  private File c;
  private int d = 10;

  static
  {
    android.support.v4.app.b.m("yy.MM.dd.HH");
  }

  public b(File paramFile, int paramInt, String paramString)
  {
    this.c = paramFile;
    this.b = paramInt;
    this.a = paramString;
    this.d = 10;
  }

  private File a(long paramLong)
  {
    File localFile1 = this.c;
    localFile1.mkdirs();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    String str1 = new SimpleDateFormat("yy.MM.dd.HH").format(localCalendar.getTime());
    String str2 = "com.tencent.mobileqq_connectSdk." + str1 + ".log";
    try
    {
      File localFile2 = new File(localFile1, str2);
      return localFile2;
    }
    catch (Throwable localThrowable)
    {
    }
    return localFile1;
  }

  public final File a()
  {
    return a(System.currentTimeMillis());
  }

  public final String b()
  {
    return this.a;
  }

  public final int c()
  {
    return this.b;
  }

  public final int d()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.b
 * JD-Core Version:    0.6.0
 */