package com.wandoujia.p4.community.views;

import android.os.AsyncTask;
import com.wandoujia.p4.community.http.a.ak;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.concurrent.ExecutionException;

final class f extends AsyncTask<Void, Void, CommunityResponseInfo>
{
  f(e parame)
  {
  }

  private static CommunityResponseInfo a()
  {
    ak localak = new ak();
    try
    {
      CommunityResponseInfo localCommunityResponseInfo = (CommunityResponseInfo)com.wandoujia.p4.a.b().execute(localak);
      return localCommunityResponseInfo;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.f
 * JD-Core Version:    0.6.0
 */