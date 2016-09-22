package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.community.http.a.m;
import com.wandoujia.p4.community.http.d.j;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class av
  implements Runnable
{
  private av(as paramas)
  {
  }

  public final void run()
  {
    m localm;
    if (!as.b(this.a).currentUserCanAddTopic())
    {
      localm = new m();
      ((j)localm.getRequestBuilder()).a(as.b(this.a).getId());
    }
    try
    {
      localList = (List)com.wandoujia.p4.a.b().execute(localm);
      if (localList != null)
      {
        Log.d("ugc", "update user Permissions : " + localList, new Object[0]);
        as.b(this.a).setCurUserPermissions(localList);
      }
      new Handler(Looper.getMainLooper()).post(new aw(this));
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
 * Qualified Name:     com.wandoujia.p4.community.b.av
 * JD-Core Version:    0.6.0
 */