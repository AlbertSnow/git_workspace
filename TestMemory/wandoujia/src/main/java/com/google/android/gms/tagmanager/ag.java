package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

final class ag
  implements e
{
  private final Context a;

  public ag(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(Map<String, Object> paramMap)
  {
    Object localObject1 = paramMap.get("gtm.url");
    Object localObject3;
    if (localObject1 == null)
    {
      localObject3 = paramMap.get("gtm");
      if ((localObject3 == null) || (!(localObject3 instanceof Map)));
    }
    for (Object localObject2 = ((Map)localObject3).get("url"); ; localObject2 = localObject1)
    {
      if ((localObject2 == null) || (!(localObject2 instanceof String)));
      String str;
      do
      {
        return;
        str = Uri.parse((String)localObject2).getQueryParameter("referrer");
      }
      while (str == null);
      o.a(this.a, str);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ag
 * JD-Core Version:    0.6.0
 */