package com.alipay.mobilesecuritysdk.deviceID;

import android.content.Context;
import android.support.v4.app.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class e
  implements Runnable
{
  e(Context paramContext, Map paramMap)
  {
  }

  public final void run()
  {
    while (true)
    {
      try
      {
        g localg = new g();
        localg.a(this.a, this.b);
        Context localContext = this.a;
        Map localMap = d.a;
        if (localMap == null)
          continue;
        boolean bool1 = localg.a();
        if (!g.a(localMap))
          continue;
        if ((bool1) || (b.d((String)localMap.get("apdid"))) || (b.d((String)localMap.get("time"))))
          continue;
        String str3 = (String)localMap.get("apdid") + (String)localMap.get("time");
        localg.a(str3);
        localg.b(str3);
        String str1 = (String)localMap.get("checkcode");
        String str2 = localg.b();
        if (!localg.c())
          continue;
        if (!b.d(str1))
        {
          if (!b.d(str2))
            continue;
          break label378;
          if (!bool2)
            continue;
          localMap.get("apdid");
          return;
          bool2 = str1.equals(str2);
          continue;
          localg.b(localContext);
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        ArrayList localArrayList = new ArrayList();
        if ((this.b.get("tid") == null) || (((String)this.b.get("tid")).length() <= 20))
          continue;
        localArrayList.add(((String)this.b.get("tid")).substring(0, 20));
        if ((this.b.get("utdid") == null) || (((String)this.b.get("utdid")).length() <= 20))
          continue;
        localArrayList.add(((String)this.b.get("utdid")).substring(0, 20));
        localArrayList.add(i.a(localThrowable));
        i.a(localArrayList);
        return;
      }
      label378: boolean bool2 = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.e
 * JD-Core Version:    0.6.0
 */