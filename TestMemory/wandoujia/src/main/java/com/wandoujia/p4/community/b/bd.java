package com.wandoujia.p4.community.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.aw;
import com.wandoujia.p4.community.http.d.ae;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

final class bd
  implements Runnable
{
  bd(ba paramba)
  {
  }

  public final void run()
  {
    try
    {
      aw localaw = new aw();
      ((ae)localaw.getRequestBuilder()).a(ba.b(this.a));
      CommunityResponseInfo localCommunityResponseInfo2 = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localaw);
      localCommunityResponseInfo1 = localCommunityResponseInfo2;
      if (localCommunityResponseInfo1 != null)
        if (localCommunityResponseInfo1.isDataValid())
        {
          str = com.wandoujia.p4.a.a().getString(2131624511);
          b.O().d(new CommunityEvent(CommunityEvent.Type.QUIT_GROUP, true, null));
          new Handler(Looper.getMainLooper()).post(new be(str));
          return;
        }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo1 = null;
        continue;
        String str = localCommunityResponseInfo1.getMsg();
        b.O().d(new CommunityEvent(CommunityEvent.Type.QUIT_GROUP, false, localCommunityResponseInfo1.getMsg()));
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.QUIT_GROUP, false, null));
        str = com.wandoujia.p4.a.a().getString(2131624509);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.bd
 * JD-Core Version:    0.6.0
 */