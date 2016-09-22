package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class StatisticsPackage$Builder extends Message.Builder<StatisticsPackage>
{
  public String id;

  public StatisticsPackage$Builder()
  {
  }

  public StatisticsPackage$Builder(StatisticsPackage paramStatisticsPackage)
  {
    super(paramStatisticsPackage);
    if (paramStatisticsPackage == null)
      return;
    this.id = paramStatisticsPackage.id;
  }

  public final StatisticsPackage build()
  {
    return new StatisticsPackage(this, null);
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.StatisticsPackage.Builder
 * JD-Core Version:    0.6.0
 */