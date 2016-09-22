package com.wandoujia.p4.community.http.e;

import com.wandoujia.base.log.Log;
import com.wandoujia.gson.c;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class a extends Thread
{
  private final Queue<String> a = new LinkedList();
  private final Map<String, String> b = new HashMap();
  private b c;
  private int d;

  public a(b paramb)
  {
    this.c = paramb;
    this.d = 0;
  }

  public final void a(String paramString)
  {
    synchronized (this.a)
    {
      this.a.add(paramString);
      return;
    }
  }

  public final void run()
  {
    while (true)
    {
      String str1;
      synchronized (this.a)
      {
        str1 = (String)this.a.poll();
        if (str1 == null)
        {
          if (this.c == null)
            continue;
          b localb = this.c;
          int i = this.d;
          this.a.size();
          localb.a(i);
          return;
        }
      }
      String str2 = CommunityImageUtils.a(str1);
      if (str2 == null)
        str2 = str1;
      HashMap localHashMap1 = new HashMap();
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put("Cookie", "wdj_auth=" + com.wandoujia.account.a.i());
      String str3 = CommunityImageUtils.a("http://group.wandoujia.com/api/v1/file/image", localHashMap1, localHashMap2, new File(str2));
      Log.d("ugc", "upload done loadingPath " + str1 + " cookies " + str3, new Object[0]);
      CommunityResponseInfo localCommunityResponseInfo;
      try
      {
        localCommunityResponseInfo = (CommunityResponseInfo)new c().a(str3, CommunityResponseInfo.class);
        if (!localCommunityResponseInfo.isDataValid())
          break label305;
        if (this.c != null)
          this.c.a(str1, localCommunityResponseInfo.getMsg());
        synchronized (this.b)
        {
          this.b.put(str1, localCommunityResponseInfo.getMsg());
        }
      }
      catch (Exception localException)
      {
        if (this.c != null)
          this.c.a(null);
        this.d = (1 + this.d);
      }
      continue;
      label305: if (this.c != null)
        this.c.a(localCommunityResponseInfo.getMsg());
      this.d = (1 + this.d);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.e.a
 * JD-Core Version:    0.6.0
 */