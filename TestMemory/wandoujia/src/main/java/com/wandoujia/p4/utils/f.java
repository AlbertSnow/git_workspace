package com.wandoujia.p4.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.base.utils.ClipboardUtil;

final class f
  implements DialogInterface.OnClickListener
{
  f(String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ClipboardUtil.copyText(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.f
 * JD-Core Version:    0.6.0
 */