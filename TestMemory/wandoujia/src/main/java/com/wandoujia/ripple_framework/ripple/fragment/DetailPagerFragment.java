package com.wandoujia.ripple_framework.ripple.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.logv3.toolkit.LogViewPager;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.adapter.c;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.fragment.k;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.DetailInfo;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.h;
import com.wandoujia.ripple_framework.theme.ThemeType;
import com.wandoujia.ripple_framework.view.RippleSwipeBackContainer;
import java.util.List;

public abstract class DetailPagerFragment extends BaseFragment
  implements k
{
  protected c a;
  protected View b;
  protected DetailInfo c;
  private LogViewPager d;
  private RippleSwipeBackContainer e;
  private View f;

  public final Model a(Fragment paramFragment)
  {
    int i = paramFragment.getArguments().getInt("position");
    if ((this.c == null) || (!this.c.a()))
      return null;
    return (Model)this.c.b().get(i);
  }

  protected final void b(int paramInt)
  {
    switch (c.a[((Model)this.c.b().get(paramInt)).f().ordinal()])
    {
    default:
      return;
    case 1:
      this.e.setEnabled(true);
      return;
    case 2:
    }
    this.e.setEnabled(false);
  }

  public com.wandoujia.ripple_framework.theme.a getThemePresenter()
  {
    return new com.wandoujia.ripple_framework.theme.a().a(R.id.foreground, ThemeType.BACKGROUND, R.color.bg_white);
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public boolean onBackPressed()
  {
    if (this.e == null)
      return false;
    this.e.b();
    return true;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.rip_detail_fragment, null);
    this.f = localView.findViewById(R.id.background);
    this.b = localView.findViewById(R.id.foreground);
    this.e = ((RippleSwipeBackContainer)localView.findViewById(R.id.swipe));
    this.e.setBackgroundView(this.f);
    return localView;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.c = DetailInfo.a((h)getActivity(), getArguments());
    if (!this.c.a())
    {
      finish();
      return;
    }
    this.e.setOnAnimListener(new a(this));
    if (ContentTypeEnum.ContentType.FEED == ((Model)this.c.b().get(this.c.c())).f())
    {
      int i = i.k().g().getResources().getDimensionPixelSize(R.dimen.feed_detail_margin_top);
      if (this.windowTranslucentStatus)
        i += i.k().g().getResources().getDimensionPixelSize(R.dimen.toolbar_margin);
      ViewHelper.setY(this.b, i);
    }
    switch (c.a[((Model)this.c.b().get(this.c.c())).f().ordinal()])
    {
    default:
      this.e.a();
      return;
    case 1:
    }
    this.e.a(this.c.d());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.DetailPagerFragment
 * JD-Core Version:    0.6.0
 */