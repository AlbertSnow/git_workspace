package com.wandoujia.p4.community.b;

import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

final class ae
  implements Runnable
{
  ae(ad paramad)
  {
  }

  public final void run()
  {
    if (!ac.a(this.a.b).currentUserCanVote())
    {
      p.a(ac.b(this.a.b), 2131624490, p.b).a();
      return;
    }
    ac.a(this.a.b, this.a.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ae
 * JD-Core Version:    0.6.0
 */