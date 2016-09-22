package com.wandoujia.p4.community.utils;

import com.wandoujia.appmanager.AppManager;
import com.wandoujia.p4.community.card.b.c;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class i
  implements Comparator<c>
{
  private static boolean a(CommunityGroupModel paramCommunityGroupModel)
  {
    if (paramCommunityGroupModel != null)
    {
      List localList = paramCommunityGroupModel.getSubjectIds();
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (AppManager.a().h(str))
            return true;
        }
      }
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.i
 * JD-Core Version:    0.6.0
 */