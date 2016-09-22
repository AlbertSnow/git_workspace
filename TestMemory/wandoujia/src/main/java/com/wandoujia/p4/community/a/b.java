package com.wandoujia.p4.community.a;

import com.wandoujia.account.listener.IAccountListener.LoginType;
import com.wandoujia.p4.community.http.a.v;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.concurrent.ExecutionException;

final class b
  implements Runnable
{
  b(IAccountListener.LoginType paramLoginType)
  {
  }

  public final void run()
  {
    v localv;
    if (this.a == IAccountListener.LoginType.LOGIN)
      localv = new v();
    try
    {
      CommunityResponseInfo localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localv);
      if (localCommunityResponseInfo != null)
        "true".equals(localCommunityResponseInfo.getMsg());
      return;
    }
    catch (ExecutionException localExecutionException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.a.b
 * JD-Core Version:    0.6.0
 */