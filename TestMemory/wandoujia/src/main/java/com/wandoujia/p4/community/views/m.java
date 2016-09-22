package com.wandoujia.p4.community.views;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.activity.CommunityMembersActivity;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

final class m
  implements View.OnClickListener
{
  m(CommunityTopicListBannerView paramCommunityTopicListBannerView, CommunityGroupModel paramCommunityGroupModel)
  {
  }

  public final void onClick(View paramView)
  {
    CommunityMembersActivity.a((Activity)this.b.getContext(), this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.m
 * JD-Core Version:    0.6.0
 */