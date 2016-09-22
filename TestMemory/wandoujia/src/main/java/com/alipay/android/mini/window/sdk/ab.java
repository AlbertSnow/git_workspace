package com.alipay.android.mini.window.sdk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.alipay.android.mini.widget.MiniLabelInput;
import com.alipay.android.mini.widget.YearMonthPicker;
import com.wandoujia.account.e.a;

final class ab
  implements DialogInterface.OnClickListener
{
  ab(q paramq)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = q.q(this.a).a.c();
    q.b(this.a, q.q(this.a).a.d());
    q.c(this.a, String.valueOf(i));
    q.d(this.a, q.r(this.a).substring(2, 4));
    q.h(this.a).d(q.s(this.a) + "/" + q.t(this.a));
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ab
 * JD-Core Version:    0.6.0
 */