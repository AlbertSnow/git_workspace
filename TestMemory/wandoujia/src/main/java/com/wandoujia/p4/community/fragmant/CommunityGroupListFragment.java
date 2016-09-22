package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.PullToRefreshAsyncloadFragment;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.views.FetchMoreFooterView;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class CommunityGroupListFragment extends PullToRefreshAsyncloadFragment<com.wandoujia.p4.community.card.b.c>
  implements com.wandoujia.p4.fragment.b
{
  private static final int c = com.wandoujia.p4.a.a().getResources().getDimensionPixelOffset(2131427468);
  private com.wandoujia.p4.community.http.b.i d;
  private com.wandoujia.p4.adapter.i e;
  private l f;
  private View g;
  private View h;
  private com.wandoujia.p4.community.utils.k i;
  private boolean j = true;
  private boolean k = false;
  private boolean l = true;
  private boolean m = false;
  private String n = "game";
  private String[] o = { "game", "tv", "anime", "balloting" };

  private void r()
  {
    if ((getActivity() == null) || (getActivity().isFinishing()) || (!isAdded()))
      return;
    View localView = this.g;
    TipsType[] arrayOfTipsType = new TipsType[1];
    arrayOfTipsType[0] = TipsType.COMMUNITY_NO_GROUP;
    com.wandoujia.p4.tips.a.a(localView, arrayOfTipsType);
    g();
  }

  private void s()
  {
    if ((isAdded()) && (this.h != null))
      l().c(this.h);
  }

  private void t()
  {
    k().a(new ArrayList());
    k().notifyDataSetChanged();
  }

  protected final com.wandoujia.p4.c.a<com.wandoujia.p4.community.card.b.c> a()
  {
    if (this.d == null)
    {
      if (!"balloting".equals(this.n))
        break label53;
      this.d = new com.wandoujia.p4.community.http.b.b(this.n);
    }
    while (true)
    {
      return new o(this.d, new com.wandoujia.p4.community.card.b.a.a());
      label53: if ((this.k) && (com.wandoujia.account.a.z()))
      {
        this.d = new com.wandoujia.p4.community.http.b.l("not_joined", this.n);
        continue;
      }
      this.d = new com.wandoujia.p4.community.http.b.b(this.n);
    }
  }

  protected final void a(int paramInt, ExecutionException paramExecutionException)
  {
    super.a(paramInt, paramExecutionException);
    if (getActivity() != null)
      p.a(getActivity(), 2131625287, p.a).a();
  }

  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null);
    do
      return;
    while (!"community_login".equals(paramBundle.getString("launch_from")));
    g();
  }

  protected final h<com.wandoujia.p4.community.card.b.c> b()
  {
    k localk = new k(this, 0);
    this.f = new l(0);
    this.e = new com.wandoujia.p4.adapter.i(this.f);
    this.e.b(c);
    this.e.d(2 * c);
    this.e.c(c);
    this.e.e(2 * c);
    this.e.a(2);
    return localk;
  }

  protected final void c()
  {
    t();
    n().setVisibility(8);
    com.wandoujia.p4.tips.a.a(this.g, TipsType.COMMUNITY_NO_GROUP);
  }

  protected final boolean d()
  {
    return true;
  }

  protected final void e()
  {
    super.e();
    r();
  }

  protected int getLayoutResId()
  {
    return 2130903246;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    android.support.v4.app.b.O().a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.j = localBundle.getBoolean("show_sub_categories", true);
      this.k = localBundle.getBoolean("filter_joined_groups", false);
      this.l = localBundle.getBoolean("has_subject_type_game", true);
      if (!this.l)
        this.n = "tv";
    }
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
    android.support.v4.app.b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if ((!isAdded()) || (!paramCommunityEvent.b))
      return;
    switch (j.a[paramCommunityEvent.a.ordinal()])
    {
    default:
      return;
    case 1:
    case 2:
    }
    r();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    this.g = paramView.findViewById(2131493499);
    if ((this.j) && (getActivity() != null) && (this.i == null))
    {
      String[] arrayOfString = getResources().getStringArray(2131230729);
      this.i = new com.wandoujia.p4.community.utils.k(getActivity());
      if (!this.l)
        this.i.a(arrayOfString[0]);
      this.i.a(l(), arrayOfString);
      this.i.a(new i(this));
    }
    Config.p();
    CommunityImageUtils.a(getActivity());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityGroupListFragment
 * JD-Core Version:    0.6.0
 */