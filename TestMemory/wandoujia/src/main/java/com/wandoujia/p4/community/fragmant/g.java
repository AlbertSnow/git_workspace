package com.wandoujia.p4.community.fragmant;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.wandoujia.p4.community.http.a.c;
import com.wandoujia.p4.community.http.d.f;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import java.util.concurrent.ExecutionException;

final class g extends AsyncTask<Void, Void, CommunityTopicLikedUsersInfo>
{
  private g(CommunityBallotStatusFragment paramCommunityBallotStatusFragment)
  {
  }

  private CommunityTopicLikedUsersInfo a()
  {
    if (TextUtils.isEmpty(CommunityBallotStatusFragment.a(this.a)))
      return null;
    try
    {
      c localc = new c();
      ((f)localc.getRequestBuilder()).a(CommunityBallotStatusFragment.a(this.a));
      CommunityTopicLikedUsersInfo localCommunityTopicLikedUsersInfo = (CommunityTopicLikedUsersInfo)com.wandoujia.p4.a.b().execute(localc);
      return localCommunityTopicLikedUsersInfo;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.g
 * JD-Core Version:    0.6.0
 */