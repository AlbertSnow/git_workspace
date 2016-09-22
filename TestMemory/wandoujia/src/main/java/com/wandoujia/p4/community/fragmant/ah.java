package com.wandoujia.p4.community.fragmant;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.l;
import android.view.MenuItem;
import com.wandoujia.p4.community.b.bk;
import com.wandoujia.p4.community.b.k;
import com.wandoujia.p4.community.b.n;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

final class ah
  implements l
{
  ah(CommunityTopicDetailFragment paramCommunityTopicDetailFragment)
  {
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131494109:
      new com.wandoujia.p4.community.b.f(new com.wandoujia.p4.community.http.a.f(CommunityTopicDetailFragment.d(this.a).getId()), this.a.getActivity(), CommunityTopicDetailFragment.d(this.a).getId()).execute();
      return true;
    case 2131494112:
      new n(String.valueOf(CommunityTopicDetailFragment.d(this.a).getAuthor().getUid()), this.a.getActivity()).execute();
      return true;
    case 2131494111:
      String str2 = CommunityTopicDetailFragment.d(this.a).getId();
      boolean bool3 = CommunityTopicDetailFragment.d(this.a).isFeatured();
      boolean bool4 = false;
      if (!bool3)
        bool4 = true;
      new k(str2, bool4).execute();
      return true;
    case 2131494110:
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    String str1 = CommunityTopicDetailFragment.d(this.a).getId();
    boolean bool1 = CommunityTopicDetailFragment.d(this.a).isSticky();
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    new bk(localFragmentActivity, str1, bool2).execute();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.ah
 * JD-Core Version:    0.6.0
 */