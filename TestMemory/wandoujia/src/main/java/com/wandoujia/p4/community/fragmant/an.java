package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import com.wandoujia.launcher.d.a.d;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.concurrent.ExecutionException;

final class an extends AsyncTask<Void, Void, CommunityTopicModel>
{
  private an(CommunityTopicDetailFragment paramCommunityTopicDetailFragment)
  {
  }

  private CommunityTopicModel a()
  {
    d locald = new d(CommunityTopicDetailFragment.f(this.a));
    try
    {
      CommunityTopicModel localCommunityTopicModel = (CommunityTopicModel)com.wandoujia.p4.a.b().execute(locald);
      return localCommunityTopicModel;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.an
 * JD-Core Version:    0.6.0
 */