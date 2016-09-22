package com.wandoujia.p4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ck;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.p4.views.CommonViewPager;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class TabHostFragment extends BaseFragment
{
  private View a;
  private PagerSlidingTabStrip b;
  private CommonViewPager c;
  private l d;
  private int e;
  private int f = -1;
  private ck g = new m(this);
  private Set h = new HashSet();
  private ck i;

  private void a(int paramInt, Bundle paramBundle)
  {
    this.d.a(paramInt, paramBundle);
    this.c.a(paramInt, false);
  }

  private int e()
  {
    if ((b() != null) && (this.d != null))
    {
      String str = b();
      int j = this.d.a(str);
      if (j >= 0)
        return j;
    }
    return 0;
  }

  protected int a()
  {
    return 2130903057;
  }

  protected final String a(int paramInt)
  {
    return this.d.d(paramInt);
  }

  public final void a(ck paramck)
  {
    this.i = paramck;
  }

  public final void a(String paramString, Bundle paramBundle)
  {
    if (this.d.a(paramString) >= 0)
      a(this.d.a(paramString), paramBundle);
  }

  public final void a(List<k> paramList)
  {
    this.d.a(paramList);
    this.b.b();
  }

  public final Fragment b(int paramInt)
  {
    return this.d.b(paramInt);
  }

  public String b()
  {
    if (!TextUtils.isEmpty(null))
      return null;
    if (this.f >= 0)
      return a(this.f);
    return "";
  }

  public abstract List<k> c();

  public final int d()
  {
    if (this.c != null)
      return this.c.getCurrentItem();
    return e();
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.b = ((PagerSlidingTabStrip)this.a.findViewById(2131493141));
    this.b.setAllCaps(true);
    this.c = ((CommonViewPager)this.a.findViewById(2131493142));
    this.d = new l(getActivity(), getChildFragmentManager());
    List localList = c();
    this.c.setAdapter(this.d);
    if (!CollectionUtils.isEmpty(localList))
    {
      this.d.a(c());
      this.d.d();
      this.e = e();
      if ((getArguments() == null) || (!getArguments().containsKey("last_selected_item_pos")))
        break label172;
      this.c.a(getArguments().getInt("last_selected_item_pos"), false);
    }
    while (true)
    {
      this.b.setViewPager(this.c);
      this.b.setOnPageChangeListener(this.g);
      return;
      label172: this.c.setCurrentItem(this.e);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(a(), paramViewGroup, false);
    return this.a;
  }

  public void onDestroy()
  {
    this.h.clear();
    super.onDestroy();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("last_selected_item_pos", d());
    super.onSaveInstanceState(paramBundle);
  }

  public void onViewStateRestored(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      int j = paramBundle.getInt("last_selected_item_pos", -1);
      if (j != -1)
        a(j, paramBundle);
    }
    super.onViewStateRestored(paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.TabHostFragment
 * JD-Core Version:    0.6.0
 */