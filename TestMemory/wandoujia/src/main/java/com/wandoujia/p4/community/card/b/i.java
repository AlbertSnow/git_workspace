package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.http.model.CommunityRankingModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

final class i extends b
{
  i(h paramh)
  {
  }

  public final String c()
  {
    return h.a(this.a).getUser().getAvatar();
  }

  public final CharSequence f()
  {
    return String.valueOf(h.a(this.a).getLikesCount());
  }

  public final CharSequence g()
  {
    return h.a(this.a).getUser().getNick();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.i
 * JD-Core Version:    0.6.0
 */