package com.wandoujia.accessibility.hibernation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HibernationWhitListInfo
  implements Serializable
{
  private static final long serialVersionUID = 1394181098320992145L;
  private ArrayList<HibernationWhitListInfo.WhiteInfo> entity = new ArrayList();

  public Set<String> getSystemApp()
  {
    Iterator localIterator = this.entity.iterator();
    while (localIterator.hasNext())
    {
      HibernationWhitListInfo.WhiteInfo localWhiteInfo = (HibernationWhitListInfo.WhiteInfo)localIterator.next();
      if (localWhiteInfo.getType().equals(HibernationWhitListInfo.Type.SYSTEM.name().toLowerCase()))
        return new HashSet(localWhiteInfo.getPns());
    }
    return null;
  }

  public Set<String> getUserApp()
  {
    Iterator localIterator = this.entity.iterator();
    while (localIterator.hasNext())
    {
      HibernationWhitListInfo.WhiteInfo localWhiteInfo = (HibernationWhitListInfo.WhiteInfo)localIterator.next();
      if (localWhiteInfo.getType().equals(HibernationWhitListInfo.Type.USER.name().toLowerCase()))
        return new HashSet(localWhiteInfo.getPns());
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.HibernationWhitListInfo
 * JD-Core Version:    0.6.0
 */