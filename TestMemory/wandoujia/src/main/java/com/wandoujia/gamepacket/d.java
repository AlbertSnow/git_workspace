package com.wandoujia.gamepacket;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;

final class d
  implements View.OnClickListener
{
  d(b paramb, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if (b.b(this.b) != null)
      b.b(this.b).onClick(this.a, paramView.getId());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.d
 * JD-Core Version:    0.6.0
 */