package com.wandoujia.p4.community.fragmant;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.adapter.i;
import com.wandoujia.p4.community.card.b.c;
import java.util.List;

final class az extends h<c>
{
  private az(CommunityUserInfoListFragment paramCommunityUserInfoListFragment)
  {
  }

  public final void a(List<c> paramList)
  {
    super.a(paramList);
    CommunityUserInfoListFragment.a(this.b).a(paramList);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return CommunityUserInfoListFragment.b(this.b).getView(paramInt, paramView, paramViewGroup);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.az
 * JD-Core Version:    0.6.0
 */