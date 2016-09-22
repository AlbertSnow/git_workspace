package com.wandoujia.jupiter.presenter;

import android.os.AsyncTask;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.p4.gift.http.model.GiftBeanModels.GiftBeanCdKey;
import com.wandoujia.p4.http.b.s;
import com.wandoujia.p4.http.b.u;
import com.wandoujia.p4.http.request.a.e;

final class bu extends AsyncTask<Void, Void, GiftBeanModels.GiftBeanCdKey>
{
  private final boolean a;

  private bu(GiftButtonPresenter paramGiftButtonPresenter, boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private GiftBeanModels.GiftBeanCdKey a()
  {
    try
    {
      u localu;
      if (this.a)
      {
        localu = new u();
        ((e)localu.getRequestBuilder()).a(GiftButtonPresenter.a(this.b).package_name).a(GiftButtonPresenter.a(this.b).id.longValue()).b(com.wandoujia.account.a.t()).c(com.wandoujia.account.a.i());
      }
      s locals;
      for (localGiftBeanCdKey = (GiftBeanModels.GiftBeanCdKey)com.wandoujia.p4.a.b().execute(localu); ; localGiftBeanCdKey = (GiftBeanModels.GiftBeanCdKey)com.wandoujia.p4.a.b().execute(locals))
      {
        com.wandoujia.p4.account.manager.d.a().b("GIFT");
        return localGiftBeanCdKey;
        locals = new s();
        ((com.wandoujia.p4.http.request.a.d)locals.getRequestBuilder()).a(GiftButtonPresenter.a(this.b).package_name).a(GiftButtonPresenter.a(this.b).id.longValue()).b(com.wandoujia.account.a.t()).c(com.wandoujia.account.a.i());
      }
    }
    catch (Exception localException)
    {
      while (true)
        GiftBeanModels.GiftBeanCdKey localGiftBeanCdKey = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bu
 * JD-Core Version:    0.6.0
 */