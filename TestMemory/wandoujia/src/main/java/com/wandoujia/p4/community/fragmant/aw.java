package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import com.wandoujia.p4.community.http.a.c;
import com.wandoujia.p4.community.http.model.CommunityActivityListModel;
import java.util.concurrent.ExecutionException;

final class aw extends AsyncTask<Void, Void, CommunityActivityListModel>
{
  private aw(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  private CommunityActivityListModel a()
  {
    try
    {
      c localc = new c(CommunityTopicListTabFragment.g(this.a));
      CommunityActivityListModel localCommunityActivityListModel = (CommunityActivityListModel)com.wandoujia.p4.a.b().execute(localc);
      return localCommunityActivityListModel;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.aw
 * JD-Core Version:    0.6.0
 */