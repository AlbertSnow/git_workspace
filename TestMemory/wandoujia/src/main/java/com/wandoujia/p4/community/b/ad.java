package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.p4.community.http.d.t;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class ad
  implements Runnable
{
  ad(ac paramac, boolean paramBoolean)
  {
  }

  public final void run()
  {
    com.wandoujia.p4.community.http.a.ac localac = new com.wandoujia.p4.community.http.a.ac();
    ((t)localac.getRequestBuilder()).a(ac.a(this.b).getId());
    try
    {
      localList = (List)com.wandoujia.p4.a.b().execute(localac);
      ac.a(this.b).setCurUserPermissions(localList);
      new Handler(Looper.getMainLooper()).post(new ae(this));
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
        List localList = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ad
 * JD-Core Version:    0.6.0
 */