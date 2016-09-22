package com.wandoujia.p4.community.views;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.p4.community.activity.CommunityMessageActivity;

final class o
  implements View.OnClickListener
{
  o(CommunityUnReadCountMenuView paramCommunityUnReadCountMenuView)
  {
  }

  public final void onClick(View paramView)
  {
    CommunityMessageActivity.a(this.a.getContext());
    CommunityUnReadCountMenuView.a(this.a).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.o
 * JD-Core Version:    0.6.0
 */