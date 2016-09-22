package com.wandoujia.p4.community.fragmant;

import android.support.v7.widget.l;
import android.view.MenuItem;
import com.wandoujia.p4.community.activity.CommunityMembersActivity;

final class aq
  implements l
{
  aq(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131494113)
    {
      CommunityMembersActivity.a(this.a.getActivity(), CommunityTopicListTabFragment.a(this.a));
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.aq
 * JD-Core Version:    0.6.0
 */