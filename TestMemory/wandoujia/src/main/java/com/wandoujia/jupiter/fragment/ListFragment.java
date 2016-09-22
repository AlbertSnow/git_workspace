package com.wandoujia.jupiter.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.p;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.g;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.ab;

public class ListFragment extends BaseListFragment
{
  protected com.wandoujia.ripple_framework.adapter.a a = new d();
  private cc b;
  private Integer c;
  private int m = 2130903417;
  private ab n;
  private e<Model> o;

  protected int a()
  {
    return 2130903332;
  }

  protected com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    p localp = new p(paramString);
    localp.a(this.e);
    if ((getArguments() != null) && ((getArguments().getBoolean("filter", false)) || ("true".equals(getArguments().getString("filter")))) && (this.o == null))
      this.o = com.wandoujia.jupiter.d.a.d();
    if (this.o != null)
    {
      localp.a(this.o);
      return localp;
    }
    localp.a(com.wandoujia.jupiter.d.a.a());
    return localp;
  }

  public void a(DataLoadListener.Op paramOp)
  {
  }

  public void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }

  public final void a(e parame)
  {
    if (this.o == null)
    {
      this.o = parame;
      return;
    }
    this.o = com.wandoujia.ripple_framework.d.a.a(this.o, parame);
  }

  public final void a(ab paramab)
  {
    this.n = paramab;
  }

  protected cc b()
  {
    if (this.b == null)
      this.b = new c(g(), c());
    return this.b;
  }

  public int c()
  {
    if (this.c == null)
      this.c = Integer.valueOf(getResources().getDimensionPixelOffset(2131427694));
    return this.c.intValue();
  }

  public final void f()
  {
    this.m = 2130903418;
  }

  protected com.wandoujia.ripple_framework.adapter.a g()
  {
    return this.a;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(this.m);
    if (this.n == null)
      this.n = new ad();
    this.h.setEmptyViewRender(this.n);
    if (this.g != null)
    {
      com.wandoujia.jupiter.anim.a locala = new com.wandoujia.jupiter.anim.a(this.g);
      this.g.setItemAnimator(locala);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ListFragment
 * JD-Core Version:    0.6.0
 */