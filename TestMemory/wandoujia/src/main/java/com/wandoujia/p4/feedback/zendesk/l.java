package com.wandoujia.p4.feedback.zendesk;

import com.wandoujia.p4.http.c.d;

final class l extends d<ZendeskModels.ForTicketId>
{
  private ZendeskModels.ForTicketId a(String paramString)
  {
    if (paramString.startsWith("2"))
      paramString = paramString.substring(3);
    return (ZendeskModels.ForTicketId)super.process(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.l
 * JD-Core Version:    0.6.0
 */