package com.wandoujia.p4.community.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.p4.community.b.x;

final class e
  implements DialogInterface.OnClickListener
{
  e(String paramString, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new x(this.a, this.b).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.e
 * JD-Core Version:    0.6.0
 */