package com.wandoujia.logv3.toolkit.cardshow;

import android.support.v4.app.b;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.log.R.id;
import com.wandoujia.logv3.toolkit.v;
import java.util.ArrayList;
import java.util.List;

public final class h
{
  private static final int a = R.id.tag_log_card_show_action;
  private final List<Long> b = new ArrayList();
  private boolean c = false;
  private AbsListView d;

  private i b(View paramView)
  {
    i locali = (i)paramView.getTag(a);
    if (locali == null)
    {
      locali = new i(this).a(paramView);
      paramView.setTag(a, locali);
    }
    return locali;
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
    this.d = null;
    this.b.clear();
    this.c = false;
  }

  public final void a(View paramView)
  {
    paramView.removeCallbacks(b(paramView));
  }

  public final void a(View paramView, long paramLong)
  {
    if (!SystemUtil.aboveApiLevel(11));
    i locali;
    do
    {
      do
        return;
      while (!v.p(paramView));
      locali = b(paramView);
      locali.a(paramLong);
    }
    while ((!this.c) || (!c()));
    paramView.postDelayed(locali, 300L);
  }

  public final void a(AbsListView paramAbsListView)
  {
    this.d = paramAbsListView;
    if (!c());
    while (true)
    {
      return;
      this.c = true;
      int i = this.d.getFirstVisiblePosition();
      int j = this.d.getLastVisiblePosition();
      for (int k = i; k <= j; k++)
        a(this.d.getChildAt(k - this.d.getFirstVisiblePosition()), ((ListAdapter)this.d.getAdapter()).getItemId(k));
    }
  }

  public final void b()
  {
    this.b.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.h
 * JD-Core Version:    0.6.0
 */