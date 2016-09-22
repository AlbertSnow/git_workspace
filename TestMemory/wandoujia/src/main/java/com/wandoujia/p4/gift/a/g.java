package com.wandoujia.p4.gift.a;

import android.os.AsyncTask;
import com.wandoujia.p4.gift.http.model.GiftBeanModels.GiftBeanCdKey;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.http.b.s;
import com.wandoujia.p4.http.request.a.d;
import java.util.concurrent.ExecutionException;

final class g extends AsyncTask<Void, Void, GiftBeanModels.GiftBeanCdKey>
{
  private g(c paramc)
  {
  }

  private GiftBeanModels.GiftBeanCdKey a()
  {
    try
    {
      s locals = new s();
      ((d)locals.getRequestBuilder()).a(c.c(this.a).getPackageName()).a(c.c(this.a).getId()).b(com.wandoujia.account.a.t()).c(com.wandoujia.account.a.i());
      GiftBeanModels.GiftBeanCdKey localGiftBeanCdKey = (GiftBeanModels.GiftBeanCdKey)com.wandoujia.p4.a.b().execute(locals);
      return localGiftBeanCdKey;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.g
 * JD-Core Version:    0.6.0
 */