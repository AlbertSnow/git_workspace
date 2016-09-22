package com.wandoujia.p4.community.fragmant;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import com.wandoujia.p4.views.NirvanaListPopupWindow;

final class r
  implements AdapterView.OnItemClickListener
{
  r(CommunityNewBallotFragment paramCommunityNewBallotFragment, String[] paramArrayOfString)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    CommunityNewBallotFragment.c(this.b).setText(this.a[paramInt]);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if ((CommunityNewBallotFragment.a(this.b) != null) && (CommunityNewBallotFragment.a(this.b).b()))
        CommunityNewBallotFragment.a(this.b).a();
      return;
      CommunityNewBallotFragment.a(this.b, "game");
      continue;
      CommunityNewBallotFragment.a(this.b, "tv");
      continue;
      CommunityNewBallotFragment.a(this.b, "anime");
      continue;
      CommunityNewBallotFragment.a(this.b, "other");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.r
 * JD-Core Version:    0.6.0
 */