package com.wandoujia.p4.community.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.g;
import com.wandoujia.p4.community.http.d.e;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

final class l
  implements Runnable
{
  l(k paramk)
  {
  }

  public final void run()
  {
    try
    {
      g localg = new g();
      ((e)localg.getRequestBuilder()).a(k.b(this.a)).a(k.a(this.a));
      localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localg);
      if (localCommunityResponseInfo != null)
        if (localCommunityResponseInfo.isDataValid())
        {
          b.O().d(new CommunityEvent(CommunityEvent.Type.FEATURE_TOPIC, true, null));
          Context localContext = com.wandoujia.p4.a.a();
          if (k.b(this.a))
          {
            i = 2131624451;
            str = localContext.getString(i);
            new Handler(Looper.getMainLooper()).post(new m(str));
            return;
          }
        }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo = null;
        continue;
        int i = 2131624450;
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.FEATURE_TOPIC, false, localCommunityResponseInfo.getMsg()));
        String str = localCommunityResponseInfo.getMsg();
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.FEATURE_TOPIC, false, null));
        str = com.wandoujia.p4.a.a().getString(2131625232);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.l
 * JD-Core Version:    0.6.0
 */