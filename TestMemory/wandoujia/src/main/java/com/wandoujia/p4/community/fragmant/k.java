package com.wandoujia.p4.community.fragmant;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.p4.adapter.i;
import com.wandoujia.p4.community.card.b.c;
import java.util.List;

final class k extends com.wandoujia.p4.adapter.h<c>
{
  private k(CommunityGroupListFragment paramCommunityGroupListFragment)
  {
  }

  public final void a(List<c> paramList)
  {
    super.a(paramList);
    com.wandoujia.p4.community.utils.h.a(paramList);
    CommunityGroupListFragment.c(this.b).a(paramList);
  }

  public final int getCount()
  {
    if (this.a != null)
      return (1 + this.a.size()) / 2;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return CommunityGroupListFragment.d(this.b).getView(paramInt, paramView, paramViewGroup);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.k
 * JD-Core Version:    0.6.0
 */