package com.wandoujia.accessibility.hibernation.view;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;

final class c
  implements View.OnClickListener
{
  c(b paramb, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if (b.a(this.b) != null)
      b.a(this.b).onClick(this.a, paramView.getId());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.c
 * JD-Core Version:    0.6.0
 */