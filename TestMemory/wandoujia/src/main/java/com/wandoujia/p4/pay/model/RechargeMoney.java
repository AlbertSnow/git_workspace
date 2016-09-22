package com.wandoujia.p4.pay.model;

public class RechargeMoney
{
  public Long bonusMoney;
  public Boolean check;
  public Long money;
  public String title;

  public String toString()
  {
    return "<" + this.title + "," + this.money + "," + this.bonusMoney + "," + this.check + ">";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.RechargeMoney
 * JD-Core Version:    0.6.0
 */