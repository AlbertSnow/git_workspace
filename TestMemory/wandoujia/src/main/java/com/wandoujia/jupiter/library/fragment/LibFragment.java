package com.wandoujia.jupiter.library.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ck;
import android.view.View;
import android.view.ViewTreeObserver;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.account.f.b;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.library.view.e;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.p4.views.ScrollDownLayout;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.fragment.TabFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibFragment extends TabFragment
{
  protected View a;
  protected View b;
  protected ScrollDownLayout c;
  private av i;
  private List<m> j = new ArrayList();
  private ValueAnimator k;
  private ValueAnimator l;
  private ck m = new ar(this);

  private void a()
  {
    if (!CollectionUtils.isEmpty(this.j))
      b();
    setTitle(getString(2131625030));
    this.j = LibFragment.TabData.access$400();
    b(this.j);
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!(localm.e instanceof e))
        continue;
      ((e)localm.e).a();
    }
  }

  private void b()
  {
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!(localm.e instanceof e))
        continue;
      ((e)localm.e).b();
    }
  }

  private void e()
  {
    getView();
    a();
    this.c.c();
  }

  protected final int c()
  {
    return 2130903428;
  }

  public void onDestroy()
  {
    d.a().d().b(this.i);
    ((c)i.k().a("event_bus")).c(this);
    super.onDestroy();
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    b();
  }

  public void onEventMainThread(j paramj)
  {
    if (EventBusManager.Type.DROP_ALL_SUBSCRIPTION.equals(paramj.a))
      e();
    do
      return;
    while ((!EventBusManager.Type.MULTI_UNINSTALL.equals(paramj.a)) || (!(paramj.b instanceof Boolean)) || (!((Boolean)paramj.b).booleanValue()));
    this.c.b();
  }

  public void onResume()
  {
    super.onResume();
    if ((this.e.getCurrentItem() != 1) && (this.b != null))
      this.b.setVisibility(8);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    a();
    if (getArguments() != null)
      navigateTo(getArguments().getString("page_intent_uri"));
    paramView.findViewById(2131493001).setVisibility(8);
    this.i = new av(this, 0);
    d.a().d().a(this.i);
    this.a = paramView.findViewById(2131493682);
    this.b = paramView.findViewById(2131493779);
    this.c = ((ScrollDownLayout)paramView.findViewById(2131493414));
    this.e.a(this.m);
    if ((this.c.getViewTreeObserver() != null) && (this.c.getViewTreeObserver().isAlive()))
    {
      this.c.getViewTreeObserver().addOnGlobalLayoutListener(new as(this));
      ((c)i.k().a("event_bus")).a(this);
    }
    at localat = new at(this);
    this.c.setOnScrollChangedListener(localat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.LibFragment
 * JD-Core Version:    0.6.0
 */