package com.wandoujia.jupiter.subscribe.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.adapter.a;
import com.wandoujia.ripple_framework.model.Model;

final class n
  implements View.OnClickListener
{
  n(m paramm, Model paramModel)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 1;
    TextView localTextView;
    if (!SubscribeOnBoardFragment.a(this.a))
    {
      int k = i;
      this.a.a(i, Boolean.valueOf(k));
      SubscribeOnBoardFragment.a(this.b.h(), this.a);
      SubscribeOnBoardFragment.d(this.b.a).b();
      localTextView = SubscribeOnBoardFragment.c(this.b.a);
      if (CollectionUtils.isEmpty(SubscribeOnBoardFragment.a(this.b.a)))
        break label93;
    }
    while (true)
    {
      localTextView.setEnabled(i);
      return;
      int m = 0;
      break;
      label93: int j = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.n
 * JD-Core Version:    0.6.0
 */