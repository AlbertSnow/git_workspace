package com.wandoujia.ripple_framework.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;

final class ag
  implements View.OnClickListener
{
  ag(Action paramAction)
  {
  }

  public final void onClick(View paramView)
  {
    ((c)i.k().a("navigation")).a(paramView.getContext(), this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ag
 * JD-Core Version:    0.6.0
 */