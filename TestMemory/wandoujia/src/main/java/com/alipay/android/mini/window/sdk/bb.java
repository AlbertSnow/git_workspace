package com.alipay.android.mini.window.sdk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.content.h;

final class bb
  implements DialogInterface.OnClickListener
{
  bb(MiniPayActivity paramMiniPayActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    h.a(this.a.getApplicationContext()).a(new Intent("com.alipay.android.app.pay.PAY_SUSPEND"));
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bb
 * JD-Core Version:    0.6.0
 */