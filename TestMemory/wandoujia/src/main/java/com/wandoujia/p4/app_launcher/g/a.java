package com.wandoujia.p4.app_launcher.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.utils.c;

public final class a
  implements BaseView
{
  private View a;
  private DoubleIcon b;
  private TextView c;

  private a(View paramView)
  {
    this.a = paramView;
    DoubleIcon localDoubleIcon;
    View localView1;
    if (paramView != null)
    {
      View localView2 = paramView.findViewById(2131492903);
      if ((localView2 instanceof DoubleIcon))
      {
        localDoubleIcon = (DoubleIcon)localView2;
        this.b = localDoubleIcon;
        if (paramView == null)
          break label77;
        localView1 = paramView.findViewById(2131492998);
        if (!(localView1 instanceof TextView))
          break label77;
      }
    }
    label77: for (TextView localTextView = (TextView)localView1; ; localTextView = null)
    {
      this.c = localTextView;
      return;
      localDoubleIcon = null;
      break;
    }
  }

  public static a a(ViewGroup paramViewGroup)
  {
    return new a(c.a(paramViewGroup, 2130903159));
  }

  public final DoubleIcon a()
  {
    return this.b;
  }

  public final TextView b()
  {
    return this.c;
  }

  public final View getView()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.g.a
 * JD-Core Version:    0.6.0
 */