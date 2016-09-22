package com.wandoujia.p4.community.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class h
  implements DialogInterface.OnClickListener
{
  h(f paramf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    f.a(this.a);
    new Thread(new i(this.a, 0)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.h
 * JD-Core Version:    0.6.0
 */