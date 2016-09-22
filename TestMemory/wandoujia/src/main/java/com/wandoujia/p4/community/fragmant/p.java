package com.wandoujia.p4.community.fragmant;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.imagepicker.activity.ImageChooserActivity;

final class p
  implements View.OnClickListener
{
  p(CommunityNewBallotFragment paramCommunityNewBallotFragment)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a.getActivity(), ImageChooserActivity.class);
    localIntent.putExtra("max_count", 1);
    localIntent.putExtra("default_tab_pos", 1);
    this.a.startActivityForResult(localIntent, 1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.p
 * JD-Core Version:    0.6.0
 */