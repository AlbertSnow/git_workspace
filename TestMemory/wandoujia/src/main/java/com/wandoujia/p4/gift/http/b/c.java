package com.wandoujia.p4.gift.http.b;

import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.c.n;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.util.List;

public final class c extends n<GiftModel>
{
  public c(IAppLiteInfo.AppType paramAppType)
  {
  }

  protected final String a()
  {
    return null;
  }

  protected final List<GiftModel> b()
  {
    com.wandoujia.p4.gift.http.a.a locala = new com.wandoujia.p4.gift.http.a.a(0);
    return (List)com.wandoujia.p4.a.b().execute(locala);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.b.c
 * JD-Core Version:    0.6.0
 */