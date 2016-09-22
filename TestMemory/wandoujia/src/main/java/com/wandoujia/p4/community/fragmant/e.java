package com.wandoujia.p4.community.fragmant;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.b.ak;

final class e
  implements View.OnClickListener
{
  e(CommunityBallotStatusFragment paramCommunityBallotStatusFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.isAdded())
      new ak(this.a.getActivity()).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.e
 * JD-Core Version:    0.6.0
 */