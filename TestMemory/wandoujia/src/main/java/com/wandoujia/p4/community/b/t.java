package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.p4.community.http.a.ai;
import com.wandoujia.p4.community.http.d.r;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import java.util.concurrent.ExecutionException;

final class t
  implements Runnable
{
  private String b;

  public t(s params, String paramString)
  {
    this.b = paramString;
  }

  public final void run()
  {
    ai localai = new ai();
    ((r)localai.getRequestBuilder()).a(this.b).setAttachDefaultCookie(true);
    try
    {
      localCommunityTopicLikedUsersInfo = (CommunityTopicLikedUsersInfo)com.wandoujia.p4.a.b().execute(localai);
      if (localCommunityTopicLikedUsersInfo == null)
      {
        new Handler(Looper.getMainLooper()).post(new u());
        return;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      CommunityTopicLikedUsersInfo localCommunityTopicLikedUsersInfo;
      while (true)
        localCommunityTopicLikedUsersInfo = null;
      new Handler(Looper.getMainLooper()).post(new v(this, localCommunityTopicLikedUsersInfo));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.t
 * JD-Core Version:    0.6.0
 */