package com.alipay.wandoujia;

import android.support.v4.app.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.image.c.a;
import java.util.List;

final class bi extends BaseAdapter
{
  private bi(bg parambg)
  {
  }

  private String a(int paramInt)
  {
    if ((bg.a(this.a) != null) && (paramInt < bg.a(this.a).size()))
      return (String)bg.a(this.a).get(paramInt);
    return null;
  }

  public final int getCount()
  {
    if (bg.a(this.a) != null)
      return bg.a(this.a).size();
    return 0;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = LayoutInflater.from(a.a().b()).inflate(d.f("mini_ui_select_button_item"), null);
    int i = getCount();
    if (i == 1)
      paramView.setBackgroundResource(d.e("mini_table_normal_selector"));
    while (true)
    {
      TextView localTextView = (TextView)paramView.findViewById(d.a("mini_select_button_text"));
      localTextView.setText(a(paramInt));
      localTextView.setTextSize(this.a.s());
      return paramView;
      if (paramInt == 0)
      {
        paramView.setBackgroundResource(d.e("mini_table_top_selector"));
        continue;
      }
      if (paramInt == i - 1)
      {
        paramView.setBackgroundResource(d.e("mini_table_bottom_selector"));
        continue;
      }
      paramView.setBackgroundResource(d.e("mini_table_center_selector"));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bi
 * JD-Core Version:    0.6.0
 */