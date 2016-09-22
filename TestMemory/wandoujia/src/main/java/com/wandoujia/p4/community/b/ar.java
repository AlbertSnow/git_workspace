package com.wandoujia.p4.community.b;

import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.community.activity.CommunityPostContentActivity;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

final class ar
  implements Runnable
{
  ar(aq paramaq)
  {
  }

  public final void run()
  {
    if (!ap.a(this.a.a).currentUserCanAddReply())
    {
      p.a(ap.b(this.a.a), 2131624490, p.b).a();
      return;
    }
    CommunityPostContentActivity.a(ap.b(this.a.a), ap.a(this.a.a), ap.c(this.a.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ar
 * JD-Core Version:    0.6.0
 */