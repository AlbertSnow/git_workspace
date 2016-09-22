package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.unionpay.mpay.widgets.ac;

final class y
  implements View.OnClickListener
{
  y(b paramb, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.getVisibility() == 8)
    {
      this.a.setVisibility(0);
      this.b.k.a(false);
      return;
    }
    this.a.setVisibility(8);
    this.b.k.a(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.y
 * JD-Core Version:    0.6.0
 */