package com.wandoujia.p4.community.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.p4.community.http.a.aq;
import com.wandoujia.p4.community.http.d.ab;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.concurrent.ExecutionException;

final class q
  implements Runnable
{
  q(n paramn)
  {
  }

  public final void run()
  {
    try
    {
      aq localaq = new aq();
      ((ab)localaq.getRequestBuilder()).b(n.b(this.a));
      localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localaq);
      if (localCommunityResponseInfo != null)
        if (localCommunityResponseInfo.isDataValid())
        {
          str = com.wandoujia.p4.a.a().getString(2131624458);
          new Handler(Looper.getMainLooper()).post(new r(this, str));
          return;
        }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo = null;
        continue;
        String str = localCommunityResponseInfo.getMsg();
        continue;
        str = com.wandoujia.p4.a.a().getString(2131624456);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.q
 * JD-Core Version:    0.6.0
 */