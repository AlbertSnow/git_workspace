package com.wandoujia.push.protocol;

import com.wandoujia.gson.c;
import java.io.Serializable;

public class NotificationModel
  implements Serializable
{
  private NotificationModel.Content content;
  private NotificationModel.Icon icon;
  private String id;
  private NotificationModel.ImageView imageView;
  private NotificationModel.Button negativeButton;
  private NotificationModel.Button positiveButton;
  private NotificationModel.ViewType viewType;

  public NotificationModel.Content getContent()
  {
    return this.content;
  }

  public NotificationModel.Icon getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public NotificationModel.ImageView getImageView()
  {
    return this.imageView;
  }

  public NotificationModel.Button getNegativeButton()
  {
    return this.negativeButton;
  }

  public NotificationModel.Button getPositiveButton()
  {
    return this.positiveButton;
  }

  public NotificationModel.ViewType getViewType()
  {
    return this.viewType;
  }

  public String toJson()
  {
    return new c().a(this, new a().getType());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.NotificationModel
 * JD-Core Version:    0.6.0
 */