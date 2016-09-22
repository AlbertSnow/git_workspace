package com.wandoujia.p4.app_launcher.manager;

import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.FunctionInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class d
{
  private static final ExecutorService a;

  static
  {
    new StringBuilder("wdj.").append(d.class.getSimpleName());
    a = new CachedThreadPoolExecutorWithCapacity(1);
  }

  public static ALSuggestion.FunctionInfo a(ALSuggestion paramALSuggestion, String paramString)
  {
    if (!a(paramALSuggestion))
    {
      Iterator localIterator = paramALSuggestion.intentElemList.iterator();
      while (localIterator.hasNext())
      {
        ALSuggestion.FunctionInfo localFunctionInfo = (ALSuggestion.FunctionInfo)localIterator.next();
        if (localFunctionInfo.packageName.equals(paramString))
          return localFunctionInfo;
      }
    }
    return null;
  }

  public static void a(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }

  public static boolean a(ALSuggestion paramALSuggestion)
  {
    return (paramALSuggestion == null) || ((CollectionUtils.isEmpty(paramALSuggestion.appsElemList)) && (CollectionUtils.isEmpty(paramALSuggestion.intentElemList)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.d
 * JD-Core Version:    0.6.0
 */