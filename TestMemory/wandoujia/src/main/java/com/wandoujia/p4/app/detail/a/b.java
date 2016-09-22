package com.wandoujia.p4.app.detail.a;

import android.text.TextUtils;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{
  private static b a;
  private Set<GiftModel> b;
  private Map<String, GiftModel> c;

  public static b a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new b();
      b localb = a;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Map<String, GiftModel> b()
  {
    if (this.c == null)
    {
      this.c = new HashMap();
      if (this.b == null)
      {
        String str = Config.a("gift_config");
        this.b = ((Set)new com.wandoujia.gson.c().a(str, new c().getType()));
      }
      Set localSet = this.b;
      if (localSet != null)
      {
        Iterator localIterator = localSet.iterator();
        while (localIterator.hasNext())
        {
          GiftModel localGiftModel = (GiftModel)localIterator.next();
          if (TextUtils.isEmpty(localGiftModel.getPackageName()))
            continue;
          this.c.put(localGiftModel.getPackageName(), localGiftModel);
        }
      }
    }
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.a.b
 * JD-Core Version:    0.6.0
 */