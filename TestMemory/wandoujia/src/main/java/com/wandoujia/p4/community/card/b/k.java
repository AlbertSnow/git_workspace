package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

final class k extends b
{
  private final CommunityReplyModel a;

  public k(CommunityReplyModel paramCommunityReplyModel)
  {
    this.a = paramCommunityReplyModel;
  }

  public final CharSequence a()
  {
    return this.a.getMessage();
  }

  public final String c()
  {
    CommunityUserModel localCommunityUserModel = this.a.getAuthor();
    if (localCommunityUserModel == null)
      return null;
    return localCommunityUserModel.getAvatar();
  }

  public final CharSequence f()
  {
    return this.a.getMessage();
  }

  public final CharSequence g()
  {
    CommunityUserModel localCommunityUserModel = this.a.getAuthor();
    if (localCommunityUserModel == null)
      return null;
    return localCommunityUserModel.getNick();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.k
 * JD-Core Version:    0.6.0
 */