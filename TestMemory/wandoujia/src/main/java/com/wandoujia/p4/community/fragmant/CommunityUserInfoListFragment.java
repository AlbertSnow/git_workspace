package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.PullToRefreshAsyncloadFragment;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.views.CommunityUserInfoBannerView;
import com.wandoujia.p4.tips.TipsType;

public class CommunityUserInfoListFragment extends PullToRefreshAsyncloadFragment<com.wandoujia.p4.community.card.b.c>
{
  private CommunityUserInfoBannerView c;
  private com.wandoujia.p4.community.http.b.i d;
  private com.wandoujia.p4.adapter.i e;
  private ba f;

  protected final com.wandoujia.p4.c.a<com.wandoujia.p4.community.card.b.c> a()
  {
    if (this.d == null)
      this.d = new com.wandoujia.p4.community.http.b.l("joined", "");
    return new o(this.d, new com.wandoujia.p4.community.card.b.a.a());
  }

  protected final h<com.wandoujia.p4.community.card.b.c> b()
  {
    az localaz = new az(this, 0);
    this.f = new ba(0);
    this.e = new com.wandoujia.p4.adapter.i(this.f);
    this.e.a(4);
    return localaz;
  }

  protected final void c()
  {
    if (this.c != null)
      this.c.findViewById(2131493924).setVisibility(0);
    k().c();
  }

  protected int getLayoutResId()
  {
    return 2130903245;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    b.O().a(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    com.wandoujia.p4.c.a locala = i().d();
    if (locala != null)
      locala.d();
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if ((!isAdded()) || (!paramCommunityEvent.b));
    do
    {
      return;
      switch (ay.a[paramCommunityEvent.a.ordinal()])
      {
      default:
        return;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    while ((getActivity() == null) || (getActivity().isFinishing()) || (!isAdded()));
    this.c.findViewById(2131493924).setVisibility(8);
    b.a(new bb(this, 0), new Void[0]);
    g();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    if (!com.wandoujia.account.a.z())
    {
      com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NEED_LOGIN);
      return;
    }
    this.c = CommunityUserInfoBannerView.a(getActivity());
    l().a(this.c);
  }

  public void onResume()
  {
    super.onResume();
    if (this.c != null)
      this.c.a();
  }

  protected void onStartLoading()
  {
    super.onStartLoading();
    b.a(new bb(this, 0), new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityUserInfoListFragment
 * JD-Core Version:    0.6.0
 */