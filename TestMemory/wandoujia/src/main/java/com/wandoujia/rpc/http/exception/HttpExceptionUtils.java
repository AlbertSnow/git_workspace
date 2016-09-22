package com.wandoujia.rpc.http.exception;

import android.text.TextUtils;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class HttpExceptionUtils
{
  private static final String KEY_SERVER_UNAVAILABLE_INFO = "info";
  private static final Set<Integer> STATUS_CODE_BLACK_LIST;
  private static final int STATUS_CODE_SERVER_UNAVAILABLE = 259;
  private static final Set<Integer> STATUS_CODE_WHITE_LIST = new HashSet();

  static
  {
    STATUS_CODE_BLACK_LIST = new HashSet();
  }

  public static boolean canRetry(Throwable paramThrowable)
  {
    Throwable localThrowable = getRealCause(paramThrowable);
    if (localThrowable == null)
      return false;
    if ((localThrowable instanceof HttpException))
    {
      int i = ((HttpException)localThrowable).getStatusCode();
      if (STATUS_CODE_WHITE_LIST.contains(Integer.valueOf(i)))
        return true;
      if (STATUS_CODE_BLACK_LIST.contains(Integer.valueOf(i)))
        return false;
      return (i >= 500) && (i <= 510);
    }
    return false;
  }

  private static String getHttpExceptionMessage(HttpException paramHttpException, String paramString)
  {
    int i = paramHttpException.getStatusCode();
    Object localObject = null;
    switch (i)
    {
    default:
    case 259:
    }
    while (TextUtils.isEmpty((CharSequence)localObject))
    {
      return paramString;
      localObject = getServerUnavailableMessage(paramHttpException.getMessage(), paramString);
    }
    return (String)localObject;
  }

  public static String getMessage(Throwable paramThrowable, String paramString)
  {
    Throwable localThrowable = getRealCause(paramThrowable);
    if (localThrowable == null);
    do
      return paramString;
    while (!(localThrowable instanceof HttpException));
    return getHttpExceptionMessage((HttpException)localThrowable, paramString);
  }

  private static Throwable getRealCause(Throwable paramThrowable)
  {
    while ((paramThrowable != null) && ((paramThrowable instanceof ExecutionException)))
      paramThrowable = paramThrowable.getCause();
    return paramThrowable;
  }

  private static String getServerUnavailableMessage(String paramString1, String paramString2)
  {
    String str;
    try
    {
      str = (String)((HashMap)new c().a(paramString1, new HttpExceptionUtils.1().getType())).get("info");
      boolean bool = TextUtils.isEmpty(str);
      if (bool)
        return paramString2;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      return paramString2;
    }
    return str;
  }

  public static boolean is404NotFound(Throwable paramThrowable)
  {
    Throwable localThrowable = getRealCause(paramThrowable);
    if (localThrowable == null)
      return false;
    if ((localThrowable instanceof HttpException))
      return ((HttpException)localThrowable).getStatusCode() == 404;
    return false;
  }

  public static boolean isServerUnavailable(Throwable paramThrowable)
  {
    Throwable localThrowable = getRealCause(paramThrowable);
    if (localThrowable == null)
      return false;
    if ((localThrowable instanceof HttpException))
      return ((HttpException)localThrowable).getStatusCode() == 259;
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.exception.HttpExceptionUtils
 * JD-Core Version:    0.6.0
 */