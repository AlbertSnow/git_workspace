package com.wandoujia.p4.community.card.a;

import android.app.Activity;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.community.card.b.j;
import com.wandoujia.p4.community.card.view.CommunityReplyCardView;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

public final class h
  implements BaseController<CommunityReplyCardView, j>
{
  private Activity a;
  private CommunityTopicModel b;
  private j c;

  public h(CommunityTopicModel paramCommunityTopicModel, Activity paramActivity)
  {
    this.a = paramActivity;
    this.b = paramCommunityTopicModel;
  }

  public final void a(String paramString)
  {
    if ((this.b != null) && (this.b.getGroup() != null))
      this.b.getGroup().setCurUserRole(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.a.h
 * JD-Core Version:    0.6.0
 */