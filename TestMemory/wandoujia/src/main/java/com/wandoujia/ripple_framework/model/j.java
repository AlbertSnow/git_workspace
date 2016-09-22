package com.wandoujia.ripple_framework.model;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j
{
  private static final Map<String, String> a;
  private static final List<Pair<String, String>> b;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("/explore/startpage/home", "/explore");
    a.put("/explore/category/home", "/categories");
    a.put("/explore/nux/home", "/essential");
    a.put("/explore/tops/home", "/tops");
    a.put("/explore/app/topic", "/topics/apps");
    a.put("/explore/animas/home", "/acg");
    a.put("/explore/app/home", "/apps/explore");
    a.put("/explore/app/category", "/apps/categories");
    a.put("/explore/app/ranking", "/apps/top");
    a.put("/explore/app/must_have", "/apps/essential");
    a.put("/explore/app/award", "/apps/award");
    a.put("/explore/app/gift", "/apps/gifts");
    a.put("/explore/game/home", "/games/explore");
    a.put("/explore/game/online", "/games/online_game");
    a.put("/explore/game/video", "/games/videos");
    a.put("/explore/game/gift", "/games/gifts");
    a.put("/explore/game/category", "/games/categories");
    a.put("/explore/game/ranking", "/games/top");
    a.put("/explore/game/must_have", "/games/essential");
    a.put("/explore/follow/home", "/follow");
    a.put("/explore/follow/onboard", "/follow/onboard");
    a.put("/explore/subscribe/explore", "/follow/categories");
    a.put("/detail/subscribe/top_app", "/follow/top");
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    localArrayList.add(new Pair("/explore/common", "/list"));
    b.add(new Pair("/detail/topic/app/", "/topics/apps/"));
    b.add(new Pair("/detail/topic/game/", "/topics/games/"));
    b.add(new Pair("/detail/subscribe/topic/", "/topics/follow/"));
    b.add(new Pair("/explore/app/detail_category/", "/apps/categories/"));
    b.add(new Pair("/explore/app/detail_tag/", "/apps/tags/"));
    b.add(new Pair("/detail/app/", "/apps/"));
    b.add(new Pair("/explore/game/online/", "/games/online_game/"));
    b.add(new Pair("/explore/game/detail_category/", "/games/categories/"));
    b.add(new Pair("/detail/game/", "/games/"));
    b.add(new Pair("/detail/subscribe/publisher/", "/follow/"));
    b.add(new Pair("/explore/subscribe/explore/", "/follow/categories/"));
    b.add(new Pair("/detail/subscribe/top_app", "/follow/top"));
    b.add(new Pair("/explore/search/home", "/search/result"));
    b.add(new Pair("/explore/search/hot", "/search/hot"));
    b.add(new Pair("/explore/search/campaign", "/search/ias"));
    b.add(new Pair("/explore/search/history", "/search/history"));
    b.add(new Pair("/detail/video/", "/videos/"));
  }

  public static final String a(String paramString)
  {
    if ((paramString == null) || (!paramString.startsWith("wdj:/")));
    String str1;
    Pair localPair;
    do
    {
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        return paramString;
        str1 = paramString.substring(5);
        String str2 = (String)a.get(str1);
        if (str2 != null)
          return "wdj:/" + str2;
        localIterator = b.iterator();
      }
      localPair = (Pair)localIterator.next();
    }
    while (!str1.startsWith((String)localPair.first));
    return "wdj:/" + (String)localPair.second + str1.substring(((String)localPair.first).length());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.j
 * JD-Core Version:    0.6.0
 */