package com.wandoujia.push.protocol;

import java.io.Serializable;
import java.util.List;

public class PushEntityV1$Intent
  implements Serializable
{
  private String action;
  private String category;
  private String component;
  private String data;
  private List<PushEntityV1.Intent.Extra> extras;
  private String packageName;
  private String target;
  private String type;

  public String getAction()
  {
    return this.action;
  }

  public String getCategory()
  {
    return this.category;
  }

  public String getComponent()
  {
    return this.component;
  }

  public String getData()
  {
    return this.data;
  }

  public List<PushEntityV1.Intent.Extra> getExtras()
  {
    return this.extras;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getTarget()
  {
    return this.target;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAction(String paramString)
  {
    this.action = paramString;
  }

  public void setCategory(String paramString)
  {
    this.category = paramString;
  }

  public void setComponent(String paramString)
  {
    this.component = paramString;
  }

  public void setData(String paramString)
  {
    this.data = paramString;
  }

  public void setExtras(List<PushEntityV1.Intent.Extra> paramList)
  {
    this.extras = paramList;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setTarget(String paramString)
  {
    this.target = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public String toString()
  {
    return "[action is " + this.action + ", component is " + this.component + ", target is " + this.target + ", category is " + this.category + ", data is " + this.data + ", type is " + this.type + ", packageName is " + this.packageName + ", extras is " + this.extras + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.Intent
 * JD-Core Version:    0.6.0
 */