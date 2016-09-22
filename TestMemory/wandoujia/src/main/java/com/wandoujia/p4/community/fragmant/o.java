package com.wandoujia.p4.community.fragmant;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.views.NirvanaListPopupWindow;

final class o
  implements View.OnClickListener
{
  o(CommunityNewBallotFragment paramCommunityNewBallotFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if ((CommunityNewBallotFragment.a(this.a) != null) && (CommunityNewBallotFragment.a(this.a).b()))
      CommunityNewBallotFragment.a(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.o
 * JD-Core Version:    0.6.0
 */