package com.wandoujia.jupiter.library.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.view.ba;
import java.util.ArrayList;
import java.util.List;

public final class d extends ba
{
  private List<String> b = new ArrayList();

  public d(View paramView)
  {
    super(paramView);
  }

  public final void a(List<String> paramList)
  {
    this.b.addAll(paramList);
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0)
      return c.a(paramViewGroup, 2130903322);
    View localView = c.a(paramViewGroup, 2130903321);
    TextView localTextView = (TextView)localView.findViewById(2131493602);
    if ((paramInt >= 0) && (paramInt < this.b.size()));
    for (String str = (String)this.b.get(paramInt); ; str = "")
    {
      localTextView.setText(str);
      return localView;
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (!paramView.getTag().toString().equals("NON_DROPDOWN")))
    {
      paramView = c.a(paramViewGroup, 2130903320);
      paramView.setTag("NON_DROPDOWN");
    }
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.a.d
 * JD-Core Version:    0.6.0
 */