package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.wandoujia.appmanager.a.b;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import java.util.concurrent.ExecutionException;

final class f extends AsyncTask<String, Void, CommunityGroupModel>
{
  private f(CommunityBallotStatusFragment paramCommunityBallotStatusFragment)
  {
  }

  private CommunityGroupModel a()
  {
    if (TextUtils.isEmpty(CommunityBallotStatusFragment.a(this.a)))
      return null;
    b localb = new b(CommunityBallotStatusFragment.a(this.a));
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
 * Qualified Name:     com.wandoujia.p4.community.fragmant.f
 * JD-Core Version:    0.6.0
 */