package com.wandoujia.logv3.toolkit.cardshow;

import android.support.v4.app.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.by;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.log.R.id;
import com.wandoujia.logv3.toolkit.v;
import java.util.ArrayList;
import java.util.List;

public final class o
{
  private static final int a = R.id.tag_log_card_show_action;
  private final List<Long> b = new ArrayList();
  private boolean c = false;
  private RecyclerView d;

  private void a(View paramView, List<View> paramList)
  {
    if (v.p(paramView))
    {
      paramList.add(paramView);
      v.b();
      if (v.r(paramView));
    }
    while (true)
    {
      return;
      if (!(paramView instanceof ViewGroup))
        continue;
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = 0; i < localViewGroup.getChildCount(); i++)
        a(localViewGroup.getChildAt(i), paramList);
    }
  }

  private p b(View paramView)
  {
    p localp = (p)paramView.getTag(a);
    if (localp == null)
    {
      localp = new p(this).a(paramView);
      paramView.setTag(a, localp);
    }
    return localp;
  }

  private boolean c()
  {
    if ((this.d == null) || (!b.b(this.d)) || (this.d.getVisibility() != 0));
    Boolean localBoolean;
    do
    {
      return false;
      localBoolean = b.d(this.d);
    }
    while ((localBoolean != null) && (!localBoolean.booleanValue()));
    return true;
  }

  public final void a()
  {
    this.b.clear();
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    this.d = paramRecyclerView;
    if (!c());
    while (true)
    {
      return;
      this.c = true;
      for (int i = 0; i < paramRecyclerView.getChildCount(); i++)
        a(paramRecyclerView.getChildAt(i), paramRecyclerView.getAdapter().b(i));
    }
  }

  public final void a(View paramView)
  {
    paramView.removeCallbacks(b(paramView));
  }

  public final void a(View paramView, long paramLong)
  {
    if (!SystemUtil.aboveApiLevel(11));
    do
      return;
    while ((!v.p(paramView)) || (!this.c) || (!c()));
    p localp = b(paramView);
    localp.a(paramLong);
    paramView.postDelayed(localp, 300L);
  }

  public final void b()
  {
    this.d = null;
    this.b.clear();
    this.c = false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.o
 * JD-Core Version:    0.6.0
 */