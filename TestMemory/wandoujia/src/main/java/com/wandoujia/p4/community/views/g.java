package com.wandoujia.p4.community.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.b.ao;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

final class g
  implements View.OnClickListener
{
  g(CommunityTopicDetailBannerView paramCommunityTopicDetailBannerView)
  {
  }

  public final void onClick(View paramView)
  {
    if ((this.a.getContext() != null) && (CommunityTopicDetailBannerView.a(this.a).getGroup() != null))
      new ao(CommunityTopicDetailBannerView.a(this.a).getGroup().getId(), this.a.getContext()).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.g
 * JD-Core Version:    0.6.0
 */