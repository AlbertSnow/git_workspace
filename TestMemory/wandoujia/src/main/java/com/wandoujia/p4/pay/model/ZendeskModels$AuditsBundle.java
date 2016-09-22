package com.wandoujia.p4.pay.model;

import java.io.Serializable;
import java.util.List;

public class ZendeskModels$AuditsBundle
  implements Serializable
{
  private List<ZendeskModels.Audits> audits;
  private boolean isClosed;

  public List<ZendeskModels.Audits> getAudits()
  {
    return this.audits;
  }

  public boolean isClosed()
  {
    return this.isClosed;
  }

  public void setAudits(List<ZendeskModels.Audits> paramList)
  {
    this.audits = paramList;
  }

  public void setClosed(boolean paramBoolean)
  {
    this.isClosed = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.ZendeskModels.AuditsBundle
 * JD-Core Version:    0.6.0
 */