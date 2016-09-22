package com.wandoujia.p4.community.b;

import android.os.AsyncTask;
import com.wandoujia.p4.community.http.a.c;
import com.wandoujia.p4.community.http.model.CommunityGroupListModel;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class ay extends AsyncTask<Void, Void, CommunityGroupModel>
{
  ay(ax paramax)
  {
  }

  private CommunityGroupModel a()
  {
    c localc = new c(ax.a(this.a), ax.b(this.a), "");
    try
    {
      CommunityGroupListModel localCommunityGroupListModel = (CommunityGroupListModel)com.wandoujia.p4.a.b().execute(localc);
      if ((localCommunityGroupListModel != null) && (localCommunityGroupListModel.getResult() != null) && (!localCommunityGroupListModel.getResult().isEmpty()))
      {
        CommunityGroupModel localCommunityGroupModel = (CommunityGroupModel)localCommunityGroupListModel.getResult().get(0);
        return localCommunityGroupModel;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      return null;
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ay
 * JD-Core Version:    0.6.0
 */