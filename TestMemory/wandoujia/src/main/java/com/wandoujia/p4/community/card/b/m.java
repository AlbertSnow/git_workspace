package com.wandoujia.p4.community.card.b;

import android.app.Activity;
import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.button.views.i;
import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.b.an;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;
import java.util.List;

final class m extends b
{
  private final CommunityTopicModel a;

  public m(CommunityTopicModel paramCommunityTopicModel)
  {
    this.a = paramCommunityTopicModel;
  }

  public final CharSequence a()
  {
    return this.a.getMessage().replaceAll("\n", "");
  }

  public final Action b(View paramView)
  {
    return new an(this.a.getId(), (Activity)paramView.getContext());
  }

  public final String c()
  {
    CommunityUserModel localCommunityUserModel = this.a.getAuthor();
    if (localCommunityUserModel == null)
      return null;
    return localCommunityUserModel.getAvatar();
  }

  public final List<i> d()
  {
    return null;
  }

  public final CharSequence g()
  {
    return this.a.getAuthor().getNick();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.m
 * JD-Core Version:    0.6.0
 */