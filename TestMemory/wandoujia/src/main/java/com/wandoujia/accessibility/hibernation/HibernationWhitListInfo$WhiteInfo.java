package com.wandoujia.accessibility.hibernation;

import java.io.Serializable;
import java.util.ArrayList;

class HibernationWhitListInfo$WhiteInfo
  implements Serializable
{
  private static final long serialVersionUID = 1195134435525963942L;
  private ArrayList<String> pns;
  private String type;

  private HibernationWhitListInfo$WhiteInfo(HibernationWhitListInfo paramHibernationWhitListInfo)
  {
  }

  public ArrayList<String> getPns()
  {
    return this.pns;
  }

  public String getType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.HibernationWhitListInfo.WhiteInfo
 * JD-Core Version:    0.6.0
 */