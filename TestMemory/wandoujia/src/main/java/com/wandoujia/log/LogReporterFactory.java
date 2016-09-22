package com.wandoujia.log;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class LogReporterFactory
{
  private static Map<String, WeakReference<LogReporter>> logReporterMap;
  private static WeakReference<LogReporter> logReporterRef;

  public static LogReporter getLogReporter()
  {
    monitorenter;
    try
    {
      WeakReference localWeakReference = logReporterRef;
      if (localWeakReference == null);
      for (LogReporter localLogReporter = null; ; localLogReporter = (LogReporter)logReporterRef.get())
        return localLogReporter;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static LogReporter getLogReporter(String paramString)
  {
    monitorenter;
    try
    {
      if ((logReporterMap != null) && (logReporterMap.get(paramString) != null))
      {
        Object localObject2 = ((WeakReference)logReporterMap.get(paramString)).get();
        if (localObject2 != null)
          break label48;
      }
      label48: for (LogReporter localLogReporter = null; ; localLogReporter = (LogReporter)((WeakReference)logReporterMap.get(paramString)).get())
        return localLogReporter;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public static LogReporter newLogReporter(Context paramContext, LogConfiguration paramLogConfiguration)
  {
    monitorenter;
    try
    {
      Context localContext = paramContext.getApplicationContext();
      LogReporter localLogReporter;
      if ((logReporterMap != null) && (logReporterMap.get(paramLogConfiguration.getProfileName()) != null) && (((WeakReference)logReporterMap.get(paramLogConfiguration.getProfileName())).get() != null))
        localLogReporter = (LogReporter)((WeakReference)logReporterMap.get(paramLogConfiguration.getProfileName())).get();
      while (true)
      {
        return localLogReporter;
        String str = paramLogConfiguration.getProfileName();
        i locali = new i(localContext, str);
        localLogReporter = new LogReporter(localContext, locali, paramLogConfiguration, new LogSender(localContext, locali, paramLogConfiguration));
        logReporterRef = new WeakReference(localLogReporter);
        if (logReporterMap == null)
          logReporterMap = new HashMap();
        logReporterMap.put(str, logReporterRef);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogReporterFactory
 * JD-Core Version:    0.6.0
 */