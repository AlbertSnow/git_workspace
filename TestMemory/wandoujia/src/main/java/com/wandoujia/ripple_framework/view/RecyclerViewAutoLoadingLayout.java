package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.support.v4.view.bg;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.base.log.Log;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;

public class RecyclerViewAutoLoadingLayout extends SwipeRefreshLayout
  implements DataLoadListener<Model>
{
  protected NirvanaRecyclerView c;
  protected com.wandoujia.nirvana.framework.ui.recycler.g d;
  protected com.wandoujia.nirvana.framework.network.page.a<Model> e;
  private ac f;
  private com.wandoujia.nirvana.framework.ui.recycler.g g;
  private View h;
  private int i;
  private ab j;
  private boolean k = false;
  private boolean l = true;
  private aa m = new s();

  public RecyclerViewAutoLoadingLayout(Context paramContext)
  {
    super(paramContext);
    d();
  }

  public RecyclerViewAutoLoadingLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d();
  }

  private void a(View paramView)
  {
    if (this.j != null)
      this.j.a(paramView);
  }

  private void a(DataLoadListener.Op paramOp, boolean paramBoolean)
  {
    if (!this.l)
      return;
    com.wandoujia.nirvana.framework.ui.recycler.g localg1;
    label22: com.wandoujia.nirvana.framework.ui.recycler.g localg2;
    if (paramBoolean)
    {
      setRefreshing(true);
      localg1 = this.g;
      localg2 = localg1;
    }
    for (boolean bool = false; ; bool = true)
    {
      localg2.a(bool);
      return;
      if (!this.e.k())
      {
        setRefreshing(false);
        localg1 = this.g;
        break label22;
      }
      if (paramOp == DataLoadListener.Op.REFRESH)
      {
        setRefreshing(true);
        localg1 = this.g;
        break label22;
      }
      if (paramOp != DataLoadListener.Op.ADD)
        break;
      localg1 = this.g;
      if (a())
        break label22;
      localg2 = localg1;
    }
  }

  private void d()
  {
    this.i = R.layout.rip_view_empty_tip;
    this.j = new t();
  }

  protected static com.wandoujia.nirvana.framework.ui.recycler.g f()
  {
    return new y();
  }

  private void g()
  {
    if (this.m.a(this.e, this.c))
      e();
    do
      return;
    while (this.h == null);
    this.h.setVisibility(8);
  }

  private void h()
  {
    if ((this.e != null) && (this.e.b()) && (this.c.getChildCount() > 0) && (!bg.b(this.c, 1)))
      this.e.i();
  }

  public final void a(DataLoadListener.Op paramOp)
  {
    a(paramOp, false);
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    g();
    if ((paramOp != DataLoadListener.Op.REFRESH) && (paramOp == DataLoadListener.Op.ADD) && (paramg.a == 0))
      this.c.a(0);
    boolean bool = false;
    if (paramg != null)
      bool = paramg.f;
    a(paramOp, bool);
    h();
    if ((!this.k) || (this.e.b()) || (this.c.getAdapter() == null) || (!(this.c.getAdapter() instanceof com.wandoujia.nirvana.framework.ui.recycler.a)))
      return;
    c();
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    a(paramOp, false);
  }

  public final void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    for (int n = 0; n < -1 + getChildCount(); n++)
    {
      View localView = getChildAt(n);
      if ((localView == this.h) || (localView == this.c))
        continue;
      Log.d("RecyclerViewAutoLoadingLayout", "bring loading view to front", new Object[0]);
      localView.bringToFront();
    }
  }

  protected void c()
  {
    post(new x(this));
  }

  public final void e()
  {
    if (this.h != null)
    {
      this.h.setVisibility(0);
      a(this.h);
      return;
    }
    this.h = b.a(this, this.i);
    a(this.h);
    addView(this.h);
  }

  public NirvanaRecyclerView getRecyclerView()
  {
    return this.c;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((NirvanaRecyclerView)findViewById(R.id.recycler_view));
    a(getResources().getDimensionPixelSize(R.dimen.toolbar_height) - getResources().getDimensionPixelSize(R.dimen.refresh_circle_size), getResources().getDimensionPixelSize(R.dimen.pull_to_refresh_height));
    setOnRefreshListener(new u(this));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.h;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int n = getMeasuredWidth();
      int i1 = getMeasuredHeight();
      int i2 = getPaddingLeft();
      int i3 = getPaddingTop();
      int i4 = n - getPaddingLeft() - getPaddingRight();
      int i5 = i1 - getPaddingTop() - getPaddingBottom();
      localView.layout(i2, i3, i4 + i2, i5 + i3);
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    View localView = this.h;
    if ((localView != null) && (localView.getVisibility() != 8))
      measureChild(localView, paramInt1, paramInt2);
  }

  public void setAdapter(f paramf)
  {
    this.g = new v();
    if ((this.c.getLayoutManager() instanceof GridLayoutManager))
      this.g.a(false);
    while (true)
    {
      this.c.setAdapter(paramf);
      h();
      return;
      paramf.b(this.g);
    }
  }

  public void setEmptyDataChecker(aa paramaa)
  {
    this.m = paramaa;
  }

  public void setEmptyLayout(int paramInt)
  {
    if (this.h != null)
    {
      removeView(this.h);
      this.h = null;
    }
    this.i = paramInt;
  }

  public void setEmptyViewRender(ab paramab)
  {
    this.j = paramab;
  }

  public void setFullscreen(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public void setList(com.wandoujia.nirvana.framework.network.page.a parama)
  {
    this.e = parama;
    g();
    h();
    setOnLoadListener(new ac(this, parama));
  }

  public void setOnLoadListener(ac paramac)
  {
    this.f = paramac;
  }

  public void setSwipeRefreshEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout
 * JD-Core Version:    0.6.0
 */