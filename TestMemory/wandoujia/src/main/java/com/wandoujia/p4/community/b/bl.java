package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.concurrent.ExecutionException;

final class bl
  implements Runnable
{
  bl(bk parambk)
  {
  }

  public final void run()
  {
    com.wandoujia.p4.community.http.a.c localc = new com.wandoujia.p4.community.http.a.c(bk.a(this.a), bk.b(this.a));
    try
    {
      localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localc);
      if (localCommunityResponseInfo != null)
      {
        if (localCommunityResponseInfo.isDataValid())
          b.O().d(new CommunityEvent(CommunityEvent.Type.STICK_TOPIC, true, null));
      }
      else
        return;
    }
    catch (ExecutionException localExecutionException)
    {
      CommunityResponseInfo localCommunityResponseInfo;
      while (true)
        localCommunityResponseInfo = null;
      if (localCommunityResponseInfo.isStickOverflow())
        new Handler(Looper.getMainLooper()).post(new bm(this));
      b.O().d(new CommunityEvent(CommunityEvent.Type.STICK_TOPIC, false, null));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.bl
 * JD-Core Version:    0.6.0
 */