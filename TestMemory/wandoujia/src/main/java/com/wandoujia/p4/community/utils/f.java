package com.wandoujia.p4.community.utils;

import com.wandoujia.p4.community.http.a.g;
import com.wandoujia.p4.community.http.model.CommunityImageSize;
import com.wandoujia.p4.configs.Config;
import java.util.concurrent.ExecutionException;

final class f
  implements Runnable
{
  f(String paramString)
  {
  }

  public final void run()
  {
    g localg = new g(this.a);
    try
    {
      CommunityImageSize localCommunityImageSize = (CommunityImageSize)com.wandoujia.p4.a.b().execute(localg);
      Config.b(localCommunityImageSize.getS());
      Config.c(localCommunityImageSize.getM());
      return;
    }
    catch (ExecutionException localExecutionException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.f
 * JD-Core Version:    0.6.0
 */