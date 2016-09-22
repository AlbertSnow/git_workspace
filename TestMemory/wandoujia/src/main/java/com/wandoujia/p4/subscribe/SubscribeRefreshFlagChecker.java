package com.wandoujia.p4.subscribe;

import android.content.Context;
import android.content.IntentFilter;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.core.h;
import java.util.HashMap;
import java.util.Map;

public final class SubscribeRefreshFlagChecker
{
  private static SubscribeRefreshFlagChecker b;
  private static Map<String, Map<String, Boolean>> c = new HashMap();
  private final Context a;
  private h d = new a();

  private SubscribeRefreshFlagChecker(Context paramContext)
  {
    this.a = paramContext;
  }

  public static SubscribeRefreshFlagChecker a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (b == null)
        b = new SubscribeRefreshFlagChecker(paramContext);
      SubscribeRefreshFlagChecker localSubscribeRefreshFlagChecker = b;
      return localSubscribeRefreshFlagChecker;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static boolean a(String paramString)
  {
    return a(paramString, "SUBSCRIBE");
  }

  public static boolean a(String paramString1, String paramString2)
  {
    if (!c.containsKey(paramString2))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put(paramString1, Boolean.FALSE);
      c.put(paramString2, localHashMap);
      return false;
    }
    Map localMap = (Map)c.get(paramString2);
    boolean bool1 = localMap.containsKey(paramString1);
    boolean bool2 = false;
    if (bool1)
      bool2 = ((Boolean)localMap.get(paramString1)).booleanValue();
    localMap.put(paramString1, Boolean.FALSE);
    return bool2;
  }

  public final void a()
  {
    SubscribeManager.a().a(this.d);
    Context localContext = this.a;
    SubscribeRefreshFlagChecker.AccountReceiver localAccountReceiver = new SubscribeRefreshFlagChecker.AccountReceiver(this);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("pheonix.intent.action.LOGIN_SUCCESS");
    localIntentFilter.addAction("pheonix.intent.action.REGISTER_SUCCESS");
    localIntentFilter.addAction("pheonix.intent.action.LOGOUT_SUCCESS");
    localContext.registerReceiver(localAccountReceiver, localIntentFilter);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker
 * JD-Core Version:    0.6.0
 */