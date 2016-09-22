package com.wandoujia.p4.community.fragmant;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.card.b.g;
import com.wandoujia.p4.community.http.b.c;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;
import com.wandoujia.p4.tips.TipsType;

public class CommunityNotificationListFragment extends NetworkListAsyncloadFragment<g>
{
  protected final com.wandoujia.p4.c.a<g> a()
  {
    return new o(new c(), new u(0));
  }

  protected final h<g> b()
  {
    return new t(0);
  }

  protected final void c()
  {
    com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_MESSAGE);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityNotificationListFragment
 * JD-Core Version:    0.6.0
 */