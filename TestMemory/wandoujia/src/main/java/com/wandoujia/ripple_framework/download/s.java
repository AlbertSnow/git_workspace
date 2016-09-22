package com.wandoujia.ripple_framework.download;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.udid.UDIDUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class s
{
  private String a;
  private String b = "";
  private Map<String, String> c = new HashMap();

  public s()
  {
    Context localContext = i.k().g();
    a("udid", UDIDUtil.a(localContext));
    a("v", SystemUtil.getVersionName(localContext));
    a("vc", String.valueOf(SystemUtil.getVersionCode(localContext)));
    if (!TextUtils.isEmpty(a.t()))
      a("uid", a.t());
    a("channel", Config.f());
    a("sdk", String.valueOf(SystemUtil.getSdkVersionInt()));
  }

  private s a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
      this.c.put(paramString1, paramString2);
    return this;
  }

  public final s a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final String a()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalStateException("app packageName should not be empty");
    if (Config.b());
    Uri.Builder localBuilder;
    for (String str = "https://apps.wandoujia.com/download/%s"; ; str = "http://apps.wandoujia.com/download/%s")
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a;
      localBuilder = Uri.parse(String.format(str, arrayOfObject)).buildUpon();
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    localBuilder.appendQueryParameter("detailParam", this.b);
    return localBuilder.build().toString();
  }

  public final s b(String paramString)
  {
    this.b = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.s
 * JD-Core Version:    0.6.0
 */