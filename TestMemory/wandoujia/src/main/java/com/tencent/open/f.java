package com.tencent.open;

import com.wandoujia.morph.a.d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

public final class f
{
  private HashMap<String, d> a = new HashMap();

  public final void a(d paramd, String paramString)
  {
    this.a.put(paramString, paramd);
  }

  public final void a(String paramString1, String paramString2, List<String> paramList, g paramg)
  {
    com.tencent.open.a.f.a("openSDK_LOG.JsBridge", "getResult---objName = " + paramString1 + " methodName = " + paramString2);
    int i = paramList.size();
    int j = 0;
    while (true)
    {
      if (j < i);
      try
      {
        paramList.set(j, URLDecoder.decode((String)paramList.get(j), "UTF-8"));
        label73: j++;
        continue;
        d locald = (d)this.a.get(paramString1);
        if (locald != null)
        {
          com.tencent.open.a.f.b("openSDK_LOG.JsBridge", "call----");
          locald.a(paramString2, paramList, paramg);
          return;
        }
        com.tencent.open.a.f.b("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
        paramg.b();
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label73;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.f
 * JD-Core Version:    0.6.0
 */