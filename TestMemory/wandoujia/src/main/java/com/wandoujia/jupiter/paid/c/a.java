package com.wandoujia.jupiter.paid.c;

import android.net.Uri;
import android.net.Uri.Builder;
import com.wandoujia.jupiter.paid.model.ChannelInfo;
import com.wandoujia.ripple_framework.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a extends com.wandoujia.ripple_framework.a.a<ChannelInfo>
{
  public a()
  {
    super(t(), ChannelInfo.class, new b(), new c(), new com.wandoujia.gson.c());
  }

  private static String t()
  {
    i.k().a("api_context");
    Map localMap = com.wandoujia.nirvana.framework.network.a.b();
    if (localMap.isEmpty())
      return "http://startpage.wandoujia.com/five/v3/channel";
    Uri localUri = Uri.parse("http://startpage.wandoujia.com/five/v3/channel");
    Uri.Builder localBuilder = localUri.buildUpon();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localUri.getQueryParameter((String)localEntry.getKey()) != null)
        continue;
      localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.c.a
 * JD-Core Version:    0.6.0
 */