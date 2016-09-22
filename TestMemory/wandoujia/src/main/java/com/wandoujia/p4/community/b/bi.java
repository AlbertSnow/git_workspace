package com.wandoujia.p4.community.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.ay;
import com.wandoujia.p4.community.http.d.af;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

final class bi
  implements Runnable
{
  bi(bf parambf)
  {
  }

  public final void run()
  {
    try
    {
      ay localay = new ay();
      ((af)localay.getRequestBuilder()).b(bf.c(this.a)).c("GROUP_MEMBER").a(bf.b(this.a));
      localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localay);
      if (localCommunityResponseInfo != null)
        if (localCommunityResponseInfo.isDataValid())
        {
          b.O().d(new CommunityEvent(CommunityEvent.Type.RESIGN_ADMIN, true, null));
          str = com.wandoujia.p4.a.a().getString(2131624527);
          new Handler(Looper.getMainLooper()).post(new bj(str));
          return;
        }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo = null;
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.RESIGN_ADMIN, false, localCommunityResponseInfo.getMsg()));
        String str = localCommunityResponseInfo.getMsg();
        continue;
        b.O().d(new CommunityEvent(CommunityEvent.Type.RESIGN_ADMIN, false, null));
        str = com.wandoujia.p4.a.a().getString(2131624525);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.bi
 * JD-Core Version:    0.6.0
 */