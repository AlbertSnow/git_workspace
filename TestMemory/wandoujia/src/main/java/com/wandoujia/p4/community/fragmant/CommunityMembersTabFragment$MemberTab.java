package com.wandoujia.p4.community.fragmant;

import android.content.Context;
import com.wandoujia.p4.a;
import com.wandoujia.p4.fragment.k;
import com.wandoujia.p4.views.r;

 enum CommunityMembersTabFragment$MemberTab
{
  private final k delegate;
  private final String scope;

  static
  {
    TOTAL = new MemberTab("TOTAL", 1, new k(new r("total", a.a().getString(2131624476)), CommunityRankingListFragment.class, null), "total");
    ALL = new MemberTab("ALL", 2, new k(new r("all", a.a().getString(2131624475)), CommunityAllMembersFragment.class, null), "all");
    MemberTab[] arrayOfMemberTab = new MemberTab[3];
    arrayOfMemberTab[0] = WEEKLY;
    arrayOfMemberTab[1] = TOTAL;
    arrayOfMemberTab[2] = ALL;
    $VALUES = arrayOfMemberTab;
  }

  private CommunityMembersTabFragment$MemberTab(k paramk, String paramString)
  {
    this.delegate = paramk;
    this.scope = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityMembersTabFragment.MemberTab
 * JD-Core Version:    0.6.0
 */