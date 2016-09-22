package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.wandoujia.p4.community.http.a.ae;
import com.wandoujia.p4.community.http.d.u;
import com.wandoujia.p4.community.http.model.CommunityUserStatModel;
import java.util.concurrent.ExecutionException;

final class bb extends AsyncTask<Void, Void, CommunityUserStatModel>
{
  private bb(CommunityUserInfoListFragment paramCommunityUserInfoListFragment)
  {
  }

  private static CommunityUserStatModel a()
  {
    if ((com.wandoujia.account.a.z()) && (!TextUtils.isEmpty(com.wandoujia.account.a.t())))
    {
      ae localae = new ae();
      ((u)localae.getRequestBuilder()).a(com.wandoujia.account.a.t());
      try
      {
        CommunityUserStatModel localCommunityUserStatModel = (CommunityUserStatModel)com.wandoujia.p4.a.b().execute(localae);
        return localCommunityUserStatModel;
      }
      catch (ExecutionException localExecutionException)
      {
      }
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.bb
 * JD-Core Version:    0.6.0
 */