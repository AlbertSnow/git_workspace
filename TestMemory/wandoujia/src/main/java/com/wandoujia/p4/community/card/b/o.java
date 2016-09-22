package com.wandoujia.p4.community.card.b;

import android.app.Activity;
import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.b.an;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

final class o extends b
{
  private final CommunityTopicModel a;

  public o(CommunityTopicModel paramCommunityTopicModel)
  {
    this.a = paramCommunityTopicModel;
  }

  public final Action b(View paramView)
  {
    return new an(this.a.getId(), (Activity)paramView.getContext());
  }

  public final CharSequence g()
  {
    String str = this.a.getMessage();
    if (str != null)
      return str.replaceAll("\n", "");
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.o
 * JD-Core Version:    0.6.0
 */