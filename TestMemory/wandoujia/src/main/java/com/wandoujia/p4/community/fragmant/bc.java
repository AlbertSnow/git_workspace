package com.wandoujia.p4.community.fragmant;

import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import de.greenrobot.event.c;

final class bc
  implements View.OnClickListener
{
  bc(CommunityUserTopicListFragment paramCommunityUserTopicListFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.isAdded())
      b.O().d(new CommunityEvent(CommunityEvent.Type.SELECT_TAB, true, "group_explore"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.bc
 * JD-Core Version:    0.6.0
 */