package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.p4.community.http.a.ac;
import com.wandoujia.p4.community.http.d.t;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class aq
  implements Runnable
{
  aq(ap paramap)
  {
  }

  public final void run()
  {
    ac localac = new ac();
    ((t)localac.getRequestBuilder()).a(ap.a(this.a).getId());
    try
    {
      localList = (List)com.wandoujia.p4.a.b().execute(localac);
      ap.a(this.a).setCurUserPermissions(localList);
      new Handler(Looper.getMainLooper()).post(new ar(this));
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
 * Qualified Name:     com.wandoujia.p4.community.b.aq
 * JD-Core Version:    0.6.0
 */