package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;
import java.net.URL;

public final class k
{
  private static k a = null;
  private volatile WeakReference<SharedPreferences> b = null;

  public static k a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new k();
      k localk = a;
      return localk;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final String a(Context paramContext, String paramString)
  {
    if ((this.b == null) || (this.b.get() == null))
      this.b = new WeakReference(paramContext.getSharedPreferences("ServerPrefs", 0));
    String str1;
    String str2;
    try
    {
      str1 = new URL(paramString).getHost();
      if (str1 == null)
      {
        f.e("openSDK_LOG.ServerSetting", "Get host error. url=" + paramString);
        return paramString;
      }
      str2 = ((SharedPreferences)this.b.get()).getString(str1, null);
      if ((str2 == null) || (str1.equals(str2)))
      {
        f.a("openSDK_LOG.ServerSetting", "host=" + str1 + ", envHost=" + str2);
        return paramString;
      }
    }
    catch (Exception localException)
    {
      f.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + paramString + "error.: " + localException.getMessage());
      return paramString;
    }
    paramString = paramString.replace(str1, str2);
    f.a("openSDK_LOG.ServerSetting", "return environment url : " + paramString);
    return paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.k
 * JD-Core Version:    0.6.0
 */