package com.tencent.connect.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private static e a = null;
  private Map<String, f> b = Collections.synchronizedMap(new HashMap());

  private e()
  {
    if (this.b == null)
      this.b = Collections.synchronizedMap(new HashMap());
  }

  public static e a()
  {
    if (a == null)
      a = new e();
    return a;
  }

  public final com.tencent.tauth.b a(String paramString)
  {
    if (paramString == null)
    {
      com.tencent.open.a.f.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
      return null;
    }
    f localf;
    synchronized (this.b)
    {
      localf = (f)this.b.get(paramString);
      this.b.remove(paramString);
      if (localf == null)
        return null;
    }
    return localf.a;
  }

  public final Object a(int paramInt, com.tencent.tauth.b paramb)
  {
    String str = android.support.v4.app.b.k(paramInt);
    if (str == null)
    {
      com.tencent.open.a.f.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + paramInt);
      return null;
    }
    f localf;
    synchronized (this.b)
    {
      localf = (f)this.b.put(str, new f(paramb));
      if (localf == null)
        return null;
    }
    return localf.a;
  }

  public final Object a(String paramString, com.tencent.tauth.b paramb)
  {
    if (android.support.v4.app.b.n(paramString) == -1)
    {
      com.tencent.open.a.f.e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + paramString);
      return null;
    }
    f localf;
    synchronized (this.b)
    {
      localf = (f)this.b.put(paramString, new f(paramb));
      if (localf == null)
        return null;
    }
    return localf.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.common.e
 * JD-Core Version:    0.6.0
 */