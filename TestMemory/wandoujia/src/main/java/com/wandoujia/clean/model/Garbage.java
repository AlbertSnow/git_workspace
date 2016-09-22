package com.wandoujia.clean.model;

import com.wandoujia.image.ImageUri;
import java.io.Serializable;

public abstract interface Garbage extends Serializable
{
  public abstract String getAlertInfo();

  public abstract int getContentTypeId();

  public abstract String getDescription();

  public abstract long getGarbageSize();

  public abstract GarbageType getGarbageType();

  public abstract ImageUri getIconURI();

  public abstract long getId();

  public abstract String getRelativeFilePath();

  public abstract String getSubTitle();

  public abstract String getTitle();

  public abstract boolean showAction();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.model.Garbage
 * JD-Core Version:    0.6.0
 */