package com.wandoujia.p4.app_launcher.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.utils.c;

public final class b
  implements BaseView
{
  private View a;
  private TextView b;

  private b(View paramView)
  {
    this.a = paramView;
    paramView.findViewById(2131493406);
    this.b = ((TextView)paramView.findViewById(2131493407));
    paramView.findViewById(2131492998);
  }

  public static b a(ViewGroup paramViewGroup)
  {
    return new b(c.a(paramViewGroup, 2130903160));
  }

  public final TextView a()
  {
    return this.b;
  }

  public final View getView()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.g.b
 * JD-Core Version:    0.6.0
 */