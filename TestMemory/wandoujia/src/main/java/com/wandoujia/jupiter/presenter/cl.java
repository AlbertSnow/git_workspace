package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ba;
import java.util.List;

final class cl extends ba
{
  private List<Entity> b;

  public cl(View paramView, Model paramModel)
  {
    super(paramView);
    this.b = paramModel.b().sub_entity;
  }

  public final int getCount()
  {
    if (this.b != null)
      return this.b.size();
    return 0;
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.b == null)
      return null;
    View localView = c.a(paramViewGroup, 2130903259);
    ((TextView)localView.findViewById(2131493602)).setText((String)getItem(paramInt));
    return localView;
  }

  public final Object getItem(int paramInt)
  {
    if (this.b != null)
      return ((Entity)this.b.get(paramInt)).sub_title;
    return "";
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.b == null)
      return null;
    if ((paramView == null) || (!paramView.getTag().toString().equals("NON_DROPDOWN")))
    {
      paramView = c.a(paramViewGroup, 2130903293);
      paramView.setTag("NON_DROPDOWN");
    }
    ((TextView)paramView.findViewById(2131493602)).setText((String)getItem(paramInt));
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cl
 * JD-Core Version:    0.6.0
 */