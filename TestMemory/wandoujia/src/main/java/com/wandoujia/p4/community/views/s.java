package com.wandoujia.p4.community.views;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.account.activity.AccountModifyProfileActivity;

final class s
  implements View.OnClickListener
{
  s(CommunityUserInfoBannerView paramCommunityUserInfoBannerView)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.getContext().startActivity(new Intent(this.a.getContext(), AccountModifyProfileActivity.class));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.s
 * JD-Core Version:    0.6.0
 */