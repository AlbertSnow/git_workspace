package com.wandoujia.p4.community.fragmant;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

final class d
  implements View.OnClickListener
{
  d(CommunityBallotCompleteFragment paramCommunityBallotCompleteFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.isAdded())
      this.a.getActivity().finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.d
 * JD-Core Version:    0.6.0
 */