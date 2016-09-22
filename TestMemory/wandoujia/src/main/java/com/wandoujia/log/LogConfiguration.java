package com.wandoujia.log;

import android.content.Context;
import java.util.Map;

public abstract interface LogConfiguration
{
  public abstract Map<String, String> buildHeaderParams(Context paramContext);

  public abstract Map<String, String> buildStableCommonParams(Context paramContext);

  public abstract Map<String, String> buildVolatileCommonParams(Context paramContext);

  public abstract String getKeyVersion();

  public abstract String getLogVersion();

  public abstract LogSender.SenderPolicyModel getMobileSendPolicy();

  public abstract String getProfileName();

  public abstract LogSender.SenderPolicyModel getWifiSendPolicy();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogConfiguration
 * JD-Core Version:    0.6.0
 */