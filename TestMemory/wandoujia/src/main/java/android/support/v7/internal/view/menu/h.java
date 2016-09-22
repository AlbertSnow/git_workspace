package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class h extends BaseAdapter
{
  private int a = -1;

  public h(g paramg)
  {
    a();
  }

  private void a()
  {
    m localm = this.b.b.p();
    if (localm != null)
    {
      ArrayList localArrayList = this.b.b.n();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        if ((m)localArrayList.get(j) != localm)
          continue;
        this.a = j;
        return;
      }
    }
    this.a = -1;
  }

  public final m a(int paramInt)
  {
    ArrayList localArrayList = this.b.b.n();
    int i = paramInt + 0;
    if ((this.a >= 0) && (i >= this.a))
      i++;
    return (m)localArrayList.get(i);
  }

  public final int getCount()
  {
    int i = 0 + this.b.b.n().size();
    if (this.a < 0)
      return i;
    return i - 1;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = this.b.a.inflate(this.b.c, paramViewGroup, false); ; localView = paramView)
    {
      ((aa)localView).a(a(paramInt));
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
 * Qualified Name:     android.support.v7.internal.view.menu.h
 * JD-Core Version:    0.6.0
 */