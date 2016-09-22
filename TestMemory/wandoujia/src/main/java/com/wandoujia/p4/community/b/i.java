package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

final class i
  implements Runnable
{
  private i(f paramf)
  {
  }

  public final void run()
  {
    CommunityEvent.Type localType;
    if ((f.b(this.a) instanceof com.wandoujia.p4.community.http.a.f))
      localType = CommunityEvent.Type.DELETE_TOPIC;
    try
    {
      while (true)
      {
        localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(f.b(this.a));
        if (localCommunityResponseInfo == null)
          break label150;
        if (!localCommunityResponseInfo.isDataValid())
          break;
        b.O().d(new CommunityEvent(localType, true, f.c(this.a)));
        str = f.d(this.a).getString(2131625620);
        new Handler(Looper.getMainLooper()).post(new j(this, str));
        return;
        localType = CommunityEvent.Type.DELETE_REPLY;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        CommunityResponseInfo localCommunityResponseInfo = null;
        continue;
        b.O().d(new CommunityEvent(localType, false, f.c(this.a)));
        String str = localCommunityResponseInfo.getMsg();
        continue;
        label150: b.O().d(new CommunityEvent(localType, false, f.c(this.a)));
        str = f.d(this.a).getString(2131624443);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.i
 * JD-Core Version:    0.6.0
 */