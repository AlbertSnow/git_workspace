package com.wandoujia.p4.feedback.zendesk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ZendeskModels$Ticket
  implements Serializable
{
  private ZendeskModels.TicketComment comment;
  private List<ZendeskModels.TicketCustomFieldOptionItem> custom_fields;
  private ZendeskModels.TicketRequester requester;
  private String subject;
  private ArrayList<String> tags;

  public void setComment(ZendeskModels.TicketComment paramTicketComment)
  {
    this.comment = paramTicketComment;
  }

  public void setCustom_fields(List<ZendeskModels.TicketCustomFieldOptionItem> paramList)
  {
    this.custom_fields = paramList;
  }

  public void setRequester(ZendeskModels.TicketRequester paramTicketRequester)
  {
    this.requester = paramTicketRequester;
  }

  public void setSubject(String paramString)
  {
    this.subject = paramString;
  }

  public void setTags(ArrayList<String> paramArrayList)
  {
    this.tags = paramArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.ZendeskModels.Ticket
 * JD-Core Version:    0.6.0
 */