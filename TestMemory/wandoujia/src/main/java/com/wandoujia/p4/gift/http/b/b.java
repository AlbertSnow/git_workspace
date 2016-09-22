package com.wandoujia.p4.gift.http.b;

import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.p4.app.button.model.AppModelWrapper;
import com.wandoujia.p4.c.n;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b extends n<GiftModel>
{
  private Map<String, AppModelWrapper> a;
  private String b;
  private List<IAppLiteInfo> c;

  public b(List<IAppLiteInfo> paramList)
  {
    this.c = paramList;
  }

  protected final String a()
  {
    return null;
  }

  public final List<GiftModel> b()
  {
    com.wandoujia.p4.gift.http.a.a locala = new com.wandoujia.p4.gift.http.a.a();
    if ((this.c != null) && (!this.c.isEmpty()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      this.a = new HashMap(this.c.size());
      Iterator localIterator2 = this.c.iterator();
      while (localIterator2.hasNext())
      {
        IAppLiteInfo localIAppLiteInfo = (IAppLiteInfo)localIterator2.next();
        localStringBuilder.append(localIAppLiteInfo.getAppLitePackageName()).append(",");
        this.a.put(localIAppLiteInfo.getAppLitePackageName(), new AppModelWrapper(android.support.v4.app.b.a(localIAppLiteInfo)));
      }
      this.b = localStringBuilder.toString();
    }
    List localList;
    while (true)
    {
      ((com.wandoujia.p4.gift.http.c.a)locala.getRequestBuilder()).a(this.b).setAttachDefaultCookie(true);
      localList = (List)com.wandoujia.p4.a.b().execute(locala);
      if (localList == null)
        break;
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        GiftModel localGiftModel = (GiftModel)localIterator1.next();
        localGiftModel.setAppModelWrapper((AppModelWrapper)this.a.get(localGiftModel.getPackageName()));
      }
      this.a = new HashMap();
    }
    return localList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.b.b
 * JD-Core Version:    0.6.0
 */