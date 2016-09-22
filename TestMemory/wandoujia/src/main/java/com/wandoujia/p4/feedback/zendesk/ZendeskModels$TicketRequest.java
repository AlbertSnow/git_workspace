package com.wandoujia.p4.feedback.zendesk;

import java.io.Serializable;

public class ZendeskModels$TicketRequest
  implements Serializable
{
  private ZendeskModels.Ticket ticket;

  public ZendeskModels.Ticket getTicket()
  {
    return this.ticket;
  }

  public void setTicket(ZendeskModels.Ticket paramTicket)
  {
    this.ticket = paramTicket;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.ZendeskModels.TicketRequest
 * JD-Core Version:    0.6.0
 */