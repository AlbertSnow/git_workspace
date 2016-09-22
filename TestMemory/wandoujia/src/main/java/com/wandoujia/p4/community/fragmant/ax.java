package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import com.wandoujia.appmanager.a.b;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import java.util.concurrent.ExecutionException;

final class ax extends AsyncTask<String, Void, CommunityGroupModel>
{
  private ax(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  private CommunityGroupModel a()
  {
    b localb = new b(CommunityTopicListTabFragment.g(this.a));
    try
    {
      CommunityGroupModel localCommunityGroupModel = (CommunityGroupModel)com.wandoujia.p4.a.b().execute(localb);
      return localCommunityGroupModel;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.ax
 * JD-Core Version:    0.6.0
 */