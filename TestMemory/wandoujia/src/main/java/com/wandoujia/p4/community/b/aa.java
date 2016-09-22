package com.wandoujia.p4.community.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.au;
import com.wandoujia.p4.community.http.d.ad;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

final class aa
  implements Runnable
{
  aa(x paramx)
  {
  }

  public final void run()
  {
    try
    {
      au localau = new au();
      ((ad)localau.getRequestBuilder()).a(x.b(this.a));
      localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localau);
      if (localCommunityResponseInfo != null)
        if (localCommunityResponseInfo.isDataValid())
        {
          b.O().d(new CommunityEvent(CommunityEvent.Type.JOIN_GROUP, true, null));
          str = com.wandoujia.p4.a.a().getString(2131624468);
          new Handler(Looper.getMainLooper()).post(new ab(str));
          return;
        }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo = null;
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.JOIN_GROUP, false, localCommunityResponseInfo.getMsg()));
        String str = localCommunityResponseInfo.getMsg();
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.JOIN_GROUP, false, null));
        str = com.wandoujia.p4.a.a().getString(2131624467);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.aa
 * JD-Core Version:    0.6.0
 */