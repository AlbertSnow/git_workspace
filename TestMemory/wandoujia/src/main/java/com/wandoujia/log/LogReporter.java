package com.wandoujia.log;

import android.content.Context;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.config.GlobalConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

@Deprecated
public class LogReporter
{
  private static final String LOG_REPORTER_THREAD = "log-reporter-thread";
  private static final long LOG_REPORTER_THREAD_CACHE_TIME = 600000L;
  private static final String TAG = LogReporter.class.getSimpleName();
  private final Map<String, String> commonParams = new HashMap();
  private final Context context;
  private final LogConfiguration logConfiguration;
  private final LogSender logSender;
  private final i logStorage;
  private final Executor reporterExecutor;

  LogReporter(Context paramContext, i parami, LogConfiguration paramLogConfiguration, LogSender paramLogSender)
  {
    this.context = paramContext;
    this.reporterExecutor = new CachedThreadPoolExecutorWithCapacity(1, 600000L, "log-reporter-thread");
    this.logStorage = parami;
    this.logConfiguration = paramLogConfiguration;
    this.logSender = paramLogSender;
    asyncInit(paramContext, paramLogConfiguration);
  }

  private void addCommonParams(Map<String, String> paramMap)
  {
    this.commonParams.putAll(this.logConfiguration.buildVolatileCommonParams(this.context));
    paramMap.putAll(this.commonParams);
  }

  private void asyncInit(Context paramContext, LogConfiguration paramLogConfiguration)
  {
    this.reporterExecutor.execute(new c(this, paramLogConfiguration, paramContext));
  }

  private String buildEventName(String paramString1, String paramString2, String paramString3)
  {
    return paramString1 + "." + paramString2 + "." + paramString3;
  }

  private void onEvent(String paramString, Map<String, String> paramMap, LogEventModel.Priority paramPriority)
  {
    if (paramMap == null)
      paramMap = new HashMap();
    LogEventModel localLogEventModel = new LogEventModel(paramString, new HashMap(paramMap), System.currentTimeMillis(), paramPriority);
    this.reporterExecutor.execute(new d(this, localLogEventModel, 0));
    if (GlobalConfig.isDebug())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[event:").append(paramString).append("]");
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append("[").append((String)localEntry.getKey()).append(":").append((String)localEntry.getValue()).append("]");
      }
    }
  }

  public void onEvent(String paramString)
  {
    onEvent(paramString, null);
  }

  public void onEvent(String paramString1, String paramString2, String paramString3)
  {
    onEvent(paramString1, paramString2, paramString3, null);
  }

  public void onEvent(String paramString1, String paramString2, String paramString3, Map<String, String> paramMap)
  {
    onEvent(buildEventName(paramString1, paramString2, paramString3), paramMap, LogEventModel.Priority.NORMAL);
  }

  public void onEvent(String paramString, Map<String, String> paramMap)
  {
    onEvent(paramString, paramMap, LogEventModel.Priority.NORMAL);
  }

  public void onEventRealTime(String paramString)
  {
    onEvent(paramString, null, LogEventModel.Priority.REAL_TIME);
  }

  public void onEventRealTime(String paramString1, String paramString2, String paramString3)
  {
    onEvent(buildEventName(paramString1, paramString2, paramString3), null, LogEventModel.Priority.REAL_TIME);
  }

  public void onEventRealTime(String paramString1, String paramString2, String paramString3, Map<String, String> paramMap)
  {
    onEvent(buildEventName(paramString1, paramString2, paramString3), paramMap, LogEventModel.Priority.REAL_TIME);
  }

  public void onEventRealTime(String paramString, Map<String, String> paramMap)
  {
    onEvent(paramString, paramMap, LogEventModel.Priority.REAL_TIME);
  }

  public void onEventSync(String paramString, Map<String, String> paramMap, LogEventModel.Priority paramPriority)
  {
    if (paramMap == null)
      paramMap = new HashMap();
    new d(this, new LogEventModel(paramString, new HashMap(paramMap), System.currentTimeMillis(), paramPriority), 0).run();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogReporter
 * JD-Core Version:    0.6.0
 */