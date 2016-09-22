package com.wandoujia.p4.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.wandoujia.p4.views.RefreshingHeaderView;
import java.util.List;

public final class o extends m
{
  private RefreshingHeaderView b;

  public o(ListAdapter paramListAdapter)
  {
    super(paramListAdapter);
  }

  public final void a()
  {
    if (this.b != null)
      new j();
  }

  public final void a(int paramInt, View paramView)
  {
    if (this.b != null)
      paramInt++;
    super.a(paramInt, paramView);
  }

  public final void a(ViewGroup paramViewGroup, long paramLong)
  {
    if (this.b == null)
    {
      this.b = RefreshingHeaderView.a(paramViewGroup);
      this.b.setLastCacheTime(paramLong);
      this.a.add(0, this.b);
      notifyDataSetChanged();
    }
  }

  public final boolean b()
  {
    return this.b != null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.o
 * JD-Core Version:    0.6.0
 */