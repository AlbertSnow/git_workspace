package android.support.v7.internal.widget;

import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class ah extends BaseAdapter
{
  private ah(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public final int getCount()
  {
    return ScrollingTabContainerView.a().getChildCount();
  }

  public final Object getItem(int paramInt)
  {
    return ((ai)ScrollingTabContainerView.a().getChildAt(paramInt)).a();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return ScrollingTabContainerView.a(this.a, (a)getItem(paramInt));
    ((ai)paramView).a((a)getItem(paramInt));
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ah
 * JD-Core Version:    0.6.0
 */