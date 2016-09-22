package com.wandoujia.p4.http.request.a;

public final class c extends h
{
  private long a;

  public final c a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }

  protected final String getUrl()
  {
    return "http://android.help.wandoujia.com/zendesk/api/v2/tickets/" + this.a + "/audits.json";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.c
 * JD-Core Version:    0.6.0
 */