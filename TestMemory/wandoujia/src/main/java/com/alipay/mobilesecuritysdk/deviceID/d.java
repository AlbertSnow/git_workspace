package com.alipay.mobilesecuritysdk.deviceID;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d
{
  public static Map<String, String> a = null;
  private final Context b;

  public d(Context paramContext)
  {
    this.b = paramContext;
    i.a(paramContext);
  }

  private void a(Context paramContext, Map<String, String> paramMap)
  {
    monitorenter;
    try
    {
      new Thread(new e(paramContext, paramMap)).start();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final String a(Map<String, String> paramMap)
  {
    new Thread(new f()).start();
    try
    {
      new g();
      Map localMap = g.a(this.b);
      a = localMap;
      if (localMap == null)
      {
        a(this.b, paramMap);
        return null;
      }
      if (g.a(a))
      {
        str2 = (String)a.get("deviceId");
        try
        {
          a(this.b, paramMap);
          return str2;
        }
        catch (Exception localException2)
        {
          localObject = localException2;
          str1 = str2;
        }
        ArrayList localArrayList = new ArrayList();
        if ((paramMap.get("tid") != null) && (((String)paramMap.get("tid")).length() > 20))
          localArrayList.add(((String)paramMap.get("tid")).substring(0, 20));
        if ((paramMap.get("utdid") != null) && (((String)paramMap.get("utdid")).length() > 20))
          localArrayList.add(((String)paramMap.get("utdid")).substring(0, 20));
        localArrayList.add(i.a((Throwable)localObject));
        i.a(localArrayList);
        return str1;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        Object localObject = localException1;
        String str1 = null;
        continue;
        String str2 = null;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.d
 * JD-Core Version:    0.6.0
 */