package com.wandoujia.p4.app_launcher.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static Bitmap a(List<String> paramList)
  {
    Context localContext = GlobalConfig.getAppContext();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (b.a(str))
      {
        localArrayList.add(b.b());
        continue;
      }
      localArrayList.add(c.a(localContext, str));
    }
    return android.support.v4.app.b.a(localContext, localArrayList, 2130838112, 2130838408);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.f.a
 * JD-Core Version:    0.6.0
 */