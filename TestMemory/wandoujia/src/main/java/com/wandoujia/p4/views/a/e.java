package com.wandoujia.p4.views.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.base.utils.ClipboardUtil;

final class e
  implements DialogInterface.OnClickListener
{
  e(StringBuilder paramStringBuilder)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ClipboardUtil.copyText(this.a.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.a.e
 * JD-Core Version:    0.6.0
 */