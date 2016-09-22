package com.android.volley;

import android.util.Log;
import java.util.Locale;

public class n
{
  public static final boolean a = Log.isLoggable("Volley", 2);

  public static void a(String paramString, Object[] paramArrayOfObject)
  {
    if (a)
      e(paramString, paramArrayOfObject);
  }

  public static void b(String paramString, Object[] paramArrayOfObject)
  {
    e(paramString, paramArrayOfObject);
  }

  public static void c(String paramString, Object[] paramArrayOfObject)
  {
    e(paramString, paramArrayOfObject);
  }

  public static void d(String paramString, Object[] paramArrayOfObject)
  {
    e(paramString, paramArrayOfObject);
  }

  private static String e(String paramString, Object[] paramArrayOfObject)
  {
    StackTraceElement[] arrayOfStackTraceElement;
    int i;
    label20: String str4;
    if (paramArrayOfObject == null)
    {
      arrayOfStackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
      i = 2;
      if (i >= arrayOfStackTraceElement.length)
        break label174;
      if (arrayOfStackTraceElement[i].getClass().equals(n.class))
        break label168;
      String str2 = arrayOfStackTraceElement[i].getClassName();
      String str3 = str2.substring(1 + str2.lastIndexOf('.'));
      str4 = str3.substring(1 + str3.lastIndexOf('$'));
    }
    label168: label174: for (String str1 = str4 + "." + arrayOfStackTraceElement[i].getMethodName(); ; str1 = "<unknown>")
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Long.valueOf(Thread.currentThread().getId());
      arrayOfObject[1] = str1;
      arrayOfObject[2] = paramString;
      return String.format(localLocale, "[%d] %s: %s", arrayOfObject);
      paramString = String.format(Locale.US, paramString, paramArrayOfObject);
      break;
      i++;
      break label20;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.n
 * JD-Core Version:    0.6.0
 */