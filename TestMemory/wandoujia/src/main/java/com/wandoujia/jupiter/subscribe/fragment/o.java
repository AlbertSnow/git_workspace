package com.wandoujia.jupiter.subscribe.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.ripple_framework.view.ab;

final class o
  implements ab
{
  o(SubscribeTimeLineFragment paramSubscribeTimeLineFragment)
  {
  }

  public final void a(View paramView)
  {
    int i = this.a.getResources().getDimensionPixelOffset(2131427692);
    paramView.findViewById(2131493768).setPadding(0, i, 0, 0);
    ((TextView)paramView.findViewById(2131492998)).setText(2131625460);
    ((ImageView)paramView.findViewById(2131492905)).setImageResource(2130838044);
    ((TextView)paramView.findViewById(2131492866)).setText(2131624623);
    paramView.findViewById(2131492866).setOnClickListener(new p());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.o
 * JD-Core Version:    0.6.0
 */