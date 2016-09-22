package com.wandoujia.jupiter.morph;

import android.view.View;
import com.wandoujia.morph.engine.i;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.SmartImageView;

final class d
  implements com.wandoujia.morph.a.c
{
  public final void a(View paramView, i parami)
  {
    if ((paramView == null) || (parami == null))
      return;
    if ((paramView instanceof SmartImageView))
      c.a((SmartImageView)paramView, parami);
    while (true)
    {
      c.a(paramView, parami);
      return;
      if (!(paramView instanceof CustomFontTextView))
        continue;
      c.a((CustomFontTextView)paramView, parami);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.morph.d
 * JD-Core Version:    0.6.0
 */