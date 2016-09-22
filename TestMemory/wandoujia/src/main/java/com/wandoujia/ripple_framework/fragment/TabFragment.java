package com.wandoujia.ripple_framework.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.navigation.c;
import com.wandoujia.ripple_framework.view.LoadingView;
import com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip;
import java.util.List;

public class TabFragment extends BaseFragment
  implements c
{
  private View a;
  private LoadingView b;
  protected PagerSlidingTabStrip d;
  protected ViewPager e;
  protected com.wandoujia.ripple_framework.adapter.l f;
  protected List<m> g;
  protected View h;

  public final void b(List<m> paramList)
  {
    this.g = paramList;
    if (paramList.size() > 1)
    {
      if (this.h != null)
        this.h.setVisibility(0);
      this.d.setVisibility(0);
      if (this.a != null)
        this.a.setVisibility(0);
    }
    while (true)
    {
      this.f = new com.wandoujia.ripple_framework.adapter.l(getActivity(), getChildFragmentManager());
      this.f.a(paramList);
      this.e.setAdapter(this.f);
      this.d.setViewPager(this.e);
      this.e.setCurrentItem(d());
      return;
      if (this.h != null)
        this.h.setVisibility(8);
      this.d.setVisibility(8);
      if (this.a == null)
        continue;
      this.a.setVisibility(8);
    }
  }

  protected int c()
  {
    return R.layout.rip_tab_fragment;
  }

  protected int d()
  {
    return 0;
  }

  protected final void f()
  {
    if ((this.b == null) && (getView() != null))
    {
      ViewStub localViewStub = (ViewStub)getView().findViewById(R.id.stub_loading);
      if (localViewStub != null)
        this.b = ((LoadingView)localViewStub.inflate().findViewById(R.id.loading));
    }
    if (this.b != null)
      this.b.a();
  }

  protected final void g()
  {
    if (this.b != null)
      this.b.b();
  }

  public View getPageView()
  {
    Fragment localFragment;
    if ((this.f == null) || (this.e == null))
    {
      localFragment = null;
      if (localFragment != null)
        break label40;
    }
    label40: ak localak;
    String str;
    do
    {
      return null;
      localFragment = this.f.e(this.e.getCurrentItem());
      break;
      localak = v.h(localFragment.getView());
      str = v.i(localFragment.getView());
    }
    while ((localak == null) && (str == null));
    return localFragment.getView();
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public boolean navigateTo(String paramString)
  {
    i.k().a("navigation");
    ViewPager localViewPager = this.e;
    List localList = this.g;
    int i = 0;
    if (localList != null);
    for (int j = 0; ; j++)
    {
      int k = localList.size();
      i = 0;
      if (j < k)
      {
        if ((paramString == null) || (!paramString.equals(((m)localList.get(j)).d)))
          continue;
        localViewPager.setCurrentItem(j);
        i = 1;
      }
      return i;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return b.a(paramViewGroup, c());
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.d = ((PagerSlidingTabStrip)getView().findViewById(R.id.sliding_tab));
    this.e = ((ViewPager)getView().findViewById(R.id.view_pager));
    this.a = getView().findViewById(R.id.divider);
    this.h = getView().findViewById(R.id.sliding_tab_container);
    this.e.a(new l(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.TabFragment
 * JD-Core Version:    0.6.0
 */