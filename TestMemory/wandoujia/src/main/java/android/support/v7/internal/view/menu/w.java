package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class w extends BaseAdapter
{
  private i a;
  private int b = -1;

  public w(v paramv, i parami)
  {
    this.a = parami;
    a();
  }

  private void a()
  {
    m localm = v.c(this.c).p();
    if (localm != null)
    {
      ArrayList localArrayList = v.c(this.c).n();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        if ((m)localArrayList.get(j) != localm)
          continue;
        this.b = j;
        return;
      }
    }
    this.b = -1;
  }

  public final m a(int paramInt)
  {
    if (v.a(this.c));
    for (ArrayList localArrayList = this.a.n(); ; localArrayList = this.a.k())
    {
      if ((this.b >= 0) && (paramInt >= this.b))
        paramInt++;
      return (m)localArrayList.get(paramInt);
    }
  }

  public final int getCount()
  {
    if (v.a(this.c));
    for (ArrayList localArrayList = this.a.n(); this.b < 0; localArrayList = this.a.k())
      return localArrayList.size();
    return -1 + localArrayList.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = v.b(this.c).inflate(v.a, paramViewGroup, false); ; localView = paramView)
    {
      aa localaa = (aa)localView;
      if (this.c.b)
        ((ListMenuItemView)localView).setForceShowIcon(true);
      localaa.a(a(paramInt));
      return localView;
    }
  }

  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.w
 * JD-Core Version:    0.6.0
 */