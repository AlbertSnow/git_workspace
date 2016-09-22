package com.wandoujia.p4.community.card.b;

import android.content.Context;
import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.a;
import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.b.ai;
import com.wandoujia.p4.community.b.ao;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;

final class d extends b
{
  private final CommunityGroupModel a;

  public d(CommunityGroupModel paramCommunityGroupModel)
  {
    this.a = paramCommunityGroupModel;
  }

  public final CharSequence a()
  {
    if (this.a.currentGroupBalloting())
    {
      Context localContext = a.a();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.a.getBallotCount());
      return localContext.getString(2131624440, arrayOfObject2);
    }
    int i = this.a.getTotalTopicCount();
    int j = this.a.getMembersCount();
    String str = a.a().getString(2131624439);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(i);
    arrayOfObject1[1] = Integer.valueOf(j);
    return String.format(str, arrayOfObject1);
  }

  public final Action b(View paramView)
  {
    if (this.a.currentGroupBalloting())
      return new ai(this.a.getId(), paramView.getContext());
    return new ao(this.a.getId(), paramView.getContext());
  }

  public final String c()
  {
    CommunityImageInfo localCommunityImageInfo = this.a.getIcon();
    if (localCommunityImageInfo == null)
      return null;
    return localCommunityImageInfo.url;
  }

  public final CharSequence f()
  {
    return this.a.getSlogan();
  }

  public final CharSequence g()
  {
    return this.a.getTitle();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.d
 * JD-Core Version:    0.6.0
 */