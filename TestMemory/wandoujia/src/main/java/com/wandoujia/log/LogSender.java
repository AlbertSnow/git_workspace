package com.wandoujia.log;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;

public class LogSender
{
  private static final long AUTO_TRIGGERSEND_DELAY = 10L;
  private static final long AUTO_TRIGGERSEND_INITIAL_DELAY = 5L;
  private static final int BUFFER_SIZE = 1024;
  private static final long LOG_SENDER_THREAD_CACHE_TIME = 600000L;
  private static final String LOG_SENDER_THREAD_NAME = "log-sender-thread";
  private static final String MUCE_URL_RAW = b.a;
  private static final String MUCE_URL_RAW_DEBUG = "http://10.0.29.57:8095/muce/data/sink?profile=%1$s&vc=%2$s&vn=%3$s&gzip=true&encrypt=true&key_version=%4$s&log_version=%5$s";
  private static final String PREF_KEY_LAST_SEND_SUCCESS_TIME = "log_sender_last_success_time";
  private static final String PREF_NAME = "log_module";
  private final Context context;
  private String headerLine;
  private HttpClient httpClient;
  private boolean isJustLaunch = true;
  private final LogConfiguration logConfiguration;
  private final i logStorage;
  private final LogSender.SenderPolicyModel mobileSenderPolicy;
  private String muceUrl;
  private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
  private final Executor senderExecutor = new CachedThreadPoolExecutorWithCapacity(1, 600000L, "log-sender-thread");
  private final LogSender.SenderPolicyModel wifiSenderPolicy;

  LogSender(Context paramContext, i parami, LogConfiguration paramLogConfiguration)
  {
    this.logStorage = parami;
    this.logConfiguration = paramLogConfiguration;
    this.wifiSenderPolicy = this.logConfiguration.getWifiSendPolicy();
    this.mobileSenderPolicy = this.logConfiguration.getMobileSendPolicy();
    this.context = paramContext;
    asyncInit();
    this.scheduler.scheduleWithFixedDelay(new e(this), 5L, 10L, TimeUnit.MINUTES);
  }

  private void asyncInit()
  {
    this.senderExecutor.execute(new f(this));
  }

  private String buildHeaderLine()
  {
    Map localMap = this.logConfiguration.buildHeaderParams(this.context);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add((String)localEntry.getKey() + "=" + (String)localEntry.getValue());
    }
    return TextUtils.join(",", localArrayList) + "\n";
  }

  private String buildMuceUrl(String paramString1, String paramString2, String paramString3)
  {
    String str1 = String.valueOf(SystemUtil.getVersionCode(this.context));
    String str2 = SystemUtil.getVersionName(this.context);
    if (GlobalConfig.isDebug())
      return String.format("http://10.0.29.57:8095/muce/data/sink?profile=%1$s&vc=%2$s&vn=%3$s&gzip=true&encrypt=true&key_version=%4$s&log_version=%5$s", new Object[] { paramString1, str1, str2, paramString2, paramString3 });
    return String.format(MUCE_URL_RAW, new Object[] { paramString1, str1, str2, paramString2, paramString3 });
  }

  private boolean checkPolicy()
  {
    if (GlobalConfig.isDebug())
      return true;
    LogSender.SenderPolicyModel localSenderPolicyModel;
    switch (NetworkUtil.getNetworkType())
    {
    default:
      return false;
    case 0:
    case 1:
      for (localSenderPolicyModel = this.mobileSenderPolicy; ; localSenderPolicyModel = this.wifiSenderPolicy)
        switch (g.a[LogSender.SenderPolicyModel.access$600(localSenderPolicyModel).ordinal()])
        {
        default:
          return false;
        case 1:
        case 2:
        case 3:
        case 4:
        }
    case -1:
    }
    return false;
    return false;
    return true;
    if (this.isJustLaunch)
    {
      this.isJustLaunch = false;
      return true;
    }
    return false;
    return LogSender.SenderPolicyModel.access$700(localSenderPolicyModel) + this.context.getSharedPreferences("log_module", 0).getLong("log_sender_last_success_time", 0L) <= System.currentTimeMillis();
  }

  public void triggerSend(boolean paramBoolean)
  {
    if ((paramBoolean) || (checkPolicy()))
      this.senderExecutor.execute(new h(this, 0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogSender
 * JD-Core Version:    0.6.0
 */