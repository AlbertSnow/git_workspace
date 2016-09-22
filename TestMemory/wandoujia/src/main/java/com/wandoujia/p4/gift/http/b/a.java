package com.wandoujia.p4.gift.http.b;

import android.content.Context;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.util.List;

public final class a extends com.wandoujia.p4.c.a<GiftModel>
{
  private com.wandoujia.p4.app.b.a.a a;
  private int b;

  public a()
  {
    this.a = new com.wandoujia.p4.app.b.a.a(com.wandoujia.p4.a.a().getString(2131625219));
    this.b = 0;
  }

  public a(IAppLiteInfo.AppType paramAppType)
  {
    if (paramAppType != null);
    for (this.a = new com.wandoujia.p4.app.b.a.a(com.wandoujia.p4.a.a().getString(2131625219), paramAppType); ; this.a = new com.wandoujia.p4.app.b.a.a(com.wandoujia.p4.a.a().getString(2131625219)))
    {
      this.b = 0;
      return;
    }
  }

  protected final String a()
  {
    return getClass().getName();
  }

  protected final List<GiftModel> a(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.b)
      this.b = paramInt1;
    List localList = this.a.a(this.b, paramInt2);
    this.b = (paramInt2 + this.b);
    if ((localList != null) && (localList.size() > 0))
      return new b(localList).b();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.b.a
 * JD-Core Version:    0.6.0
 */