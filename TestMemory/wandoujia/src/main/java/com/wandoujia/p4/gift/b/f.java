package com.wandoujia.p4.gift.b;

import android.os.AsyncTask;
import com.wandoujia.p4.gift.http.model.GiftBeanModels.GiftBeanCdKey;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class f extends AsyncTask<List<com.wandoujia.p4.gift.view.model.a>, Void, List<com.wandoujia.p4.gift.view.model.a>>
{
  private List<com.wandoujia.p4.gift.view.model.a> a;

  private f(a parama)
  {
  }

  private List<com.wandoujia.p4.gift.view.model.a> a(List<com.wandoujia.p4.gift.view.model.a>[] paramArrayOfList)
  {
    if (paramArrayOfList != null)
    {
      this.a = paramArrayOfList[0];
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramArrayOfList[0].iterator();
      while (localIterator.hasNext())
      {
        com.wandoujia.p4.gift.view.model.a locala = (com.wandoujia.p4.gift.view.model.a)localIterator.next();
        try
        {
          com.wandoujia.p4.http.b.a locala1 = new com.wandoujia.p4.http.b.a();
          ((com.wandoujia.p4.http.request.a.a)locala1.getRequestBuilder()).a(locala.b().getCdkeyId()).b(com.wandoujia.account.a.t()).c(com.wandoujia.account.a.i());
          GiftBeanModels.GiftBeanCdKey localGiftBeanCdKey = (GiftBeanModels.GiftBeanCdKey)com.wandoujia.p4.a.b().execute(locala1);
          if ((localGiftBeanCdKey == null) || (!"0".equals(localGiftBeanCdKey.getError())))
            continue;
          localArrayList.add(locala);
        }
        catch (ExecutionException localExecutionException)
        {
        }
      }
      return localArrayList;
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.b.f
 * JD-Core Version:    0.6.0
 */