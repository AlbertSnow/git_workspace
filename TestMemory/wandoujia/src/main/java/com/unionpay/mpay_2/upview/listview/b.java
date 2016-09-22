package com.unionpay.mpay_2.upview.listview;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

final class b extends BaseAdapter
{
  private b(a parama)
  {
  }

  public final int getCount()
  {
    List localList = a.a(this.a);
    int i = 0;
    if (localList != null)
    {
      int j = a.a(this.a).size();
      i = 0;
      if (j > 0)
        i = a.a(this.a).size();
    }
    return i;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramViewGroup != null)
      paramViewGroup.setDescendantFocusability(393216);
    Drawable localDrawable;
    Object localObject2;
    Object localObject1;
    if (paramView == null)
      if ((((com.unionpay.pboctransaction.model.b)a.a(this.a).get(paramInt)).d() == 0) && (a.b(this.a) != null))
      {
        localDrawable = (Drawable)a.b(this.a).get(0);
        localObject2 = new d(a.c(this.a), null, localDrawable, null);
        ((d)localObject2).setDescendantFocusability(393216);
        localObject1 = localObject2;
      }
    while (true)
    {
      ((View)localObject2).setTag(Integer.valueOf(paramInt));
      ((d)localObject1).a(a.a(this.a, paramInt));
      ((d)localObject1).a(new f(this));
      ((d)localObject1).a(paramInt);
      return localObject2;
      localDrawable = null;
      break;
      localObject1 = (d)paramView;
      localObject2 = paramView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.listview.b
 * JD-Core Version:    0.6.0
 */