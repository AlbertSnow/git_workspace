package com.unionpay.mpay.widgets;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;

final class v
  implements View.OnFocusChangeListener
{
  v(h paramh)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    new StringBuilder("onFocusChange:").append(paramBoolean).append(",").append(h.d(this.a));
    if (paramBoolean)
      if ((h.b(this.a)) && (h.a(this.a) != null))
        h.a(this.a).setVisibility(0);
    while (true)
    {
      if (h.d(this.a) != null)
        h.d(this.a).a(paramBoolean);
      h.a(this.a, paramBoolean);
      this.a.invalidate();
      return;
      if ((!h.b(this.a)) || (h.a(this.a) == null))
        continue;
      h.a(this.a).setVisibility(4);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.v
 * JD-Core Version:    0.6.0
 */