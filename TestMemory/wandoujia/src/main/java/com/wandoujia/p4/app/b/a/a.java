package com.wandoujia.p4.app.b.a;

import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.entities.app.TagAppsInfo;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.http.b.w;
import com.wandoujia.p4.http.request.a.f;
import com.wandoujia.p4.http.request.a.i;
import com.wandoujia.rpc.http.client.DataClientCache.CacheResult;
import java.util.List;

public final class a extends com.wandoujia.p4.c.a<IAppLiteInfo>
{
  private final String a;
  private String b = "superiorFirst";
  private int c = -1;
  private IAppLiteInfo.AppType d;

  public a(String paramString)
  {
    this.a = paramString;
  }

  public a(String paramString, IAppLiteInfo.AppType paramAppType)
  {
    this.a = paramString;
    this.d = paramAppType;
  }

  private w c(int paramInt1, int paramInt2)
  {
    w localw = new w();
    ((f)localw.getRequestBuilder()).b(this.a).a(this.b).a(this.c).a(this.d).b(paramInt1).c(paramInt2);
    return localw;
  }

  protected final String a()
  {
    return this.a + this.b;
  }

  public final List<IAppLiteInfo> a(int paramInt1, int paramInt2)
  {
    w localw = c(paramInt1, paramInt2);
    List localList1 = (List)com.wandoujia.p4.a.b().b(localw);
    if ((localList1 != null) && (!localList1.isEmpty()) && (localList1.get(0) != null))
    {
      List localList2 = ((TagAppsInfo)localList1.get(0)).getApps();
      if (localList2 != null)
        return localList2;
      return null;
    }
    return null;
  }

  protected final k<IAppLiteInfo> b(int paramInt1, int paramInt2)
  {
    w localw = c(paramInt1, paramInt2);
    DataClientCache.CacheResult localCacheResult = com.wandoujia.p4.a.b().a(localw);
    k localk = null;
    List localList;
    if (localCacheResult != null)
    {
      Object localObject1 = localCacheResult.data;
      localk = null;
      if (localObject1 != null)
      {
        boolean bool = ((List)localCacheResult.data).isEmpty();
        localk = null;
        if (!bool)
        {
          Object localObject2 = ((List)localCacheResult.data).get(0);
          localk = null;
          if (localObject2 != null)
          {
            localList = ((TagAppsInfo)((List)localCacheResult.data).get(0)).getApps();
            if (localList == null)
              break label143;
          }
        }
      }
    }
    while (true)
    {
      localk = new k(localList, Long.valueOf(localCacheResult.timestamp), Boolean.valueOf(localCacheResult.isTimeout));
      return localk;
      label143: localList = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.b.a.a
 * JD-Core Version:    0.6.0
 */