package com.wandoujia.p4.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;

final class c
  implements View.OnLongClickListener
{
  c(BaseCardSelectableAdapter paramBaseCardSelectableAdapter, long paramLong)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    this.b.a(this.a);
    BaseCardSelectableAdapter.a(this.b);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.c
 * JD-Core Version:    0.6.0
 */