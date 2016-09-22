package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TabPackage$Builder extends Message.Builder<TabPackage>
{
  public String name;
  public String unread_num;

  public TabPackage$Builder()
  {
  }

  public TabPackage$Builder(TabPackage paramTabPackage)
  {
    super(paramTabPackage);
    if (paramTabPackage == null)
      return;
    this.name = paramTabPackage.name;
    this.unread_num = paramTabPackage.unread_num;
  }

  public final TabPackage build()
  {
    return new TabPackage(this, null);
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder unread_num(String paramString)
  {
    this.unread_num = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TabPackage.Builder
 * JD-Core Version:    0.6.0
 */