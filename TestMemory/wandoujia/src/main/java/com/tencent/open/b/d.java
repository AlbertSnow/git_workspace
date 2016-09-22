package com.tencent.open.b;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.open.utils.o;

public final class d
{
  private static d a;

  public static d a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new d();
      d locald = a;
      return locald;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Long paramLong, String paramString5)
  {
    long l1 = SystemClock.elapsedRealtime() - paramLong.longValue();
    long l2;
    if ((paramLong.longValue() == 0L) || (l1 < 0L))
      l2 = 0L;
    while (true)
    {
      StringBuffer localStringBuffer = new StringBuffer("http://c.isdspeed.qq.com/code.cgi");
      localStringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=").append(paramInt).append("&code=0&time=").append(l2).append("&rate=1&uin=").append(paramString2).append("&data=");
      Bundle localBundle = o.a(String.valueOf(paramInt), "0", String.valueOf(l2), "1", paramString1, paramString2, paramString3, paramString4, paramString5);
      f.a();
      com.tencent.open.utils.l.a(new l(localBundle, localStringBuffer.toString(), "GET"));
      return;
      l2 = l1;
    }
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Bundle localBundle = o.a(paramString1, paramString3, paramString4, paramString5, paramString2, paramString6);
    f.a().a(localBundle, paramString2, true);
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    Bundle localBundle = o.a(paramString1, paramString4, paramString5, paramString3, paramString2, paramString6, paramString7, "", "", paramString8, paramString9, paramString10);
    f.a().a(localBundle, paramString2, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.d
 * JD-Core Version:    0.6.0
 */