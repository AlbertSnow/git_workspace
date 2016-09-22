package com.wandoujia.p4.app.upgrade;

import android.util.Pair;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class c extends LocalAppChangedListener
{
  public final void a()
  {
    a.c();
  }

  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    a.c();
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    a.c();
  }

  public final void a(String paramString, LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    a.c();
  }

  public final void a(Map<String, Pair<LocalAppInfo, LocalAppInfo>> paramMap)
  {
    a.c();
    if (!BadgeUtil.d(com.wandoujia.p4.a.a()));
    ArrayList localArrayList;
    do
    {
      return;
      localArrayList = new ArrayList();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)((Pair)localEntry.getValue()).first;
        LocalAppInfo localLocalAppInfo2 = (LocalAppInfo)((Pair)localEntry.getValue()).second;
        if ((localLocalAppInfo1.isUpgradeIgnored() != localLocalAppInfo2.isUpgradeIgnored()) || (!a.a(localLocalAppInfo1.getUpgradeInfo(), localLocalAppInfo2.getUpgradeInfo())))
          continue;
        localArrayList.add(((Pair)localEntry.getValue()).second);
      }
    }
    while (localArrayList.isEmpty());
    a.a(System.currentTimeMillis());
    a.a(localArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.c
 * JD-Core Version:    0.6.0
 */