package com.alipay.android.mini.window.sdk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.alipay.android.mini.widget.MiniLabelInput;
import com.alipay.android.mini.widget.e;

final class r
  implements DialogInterface.OnClickListener
{
  r(q paramq)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (TextUtils.equals(q.a(this.a), q.b(this.a)[paramInt]))
      return;
    q.a(this.a, q.b(this.a)[paramInt]);
    if (TextUtils.equals("A", q.a(this.a)))
    {
      q.c(this.a).c(20);
      if (q.d(this.a) == null)
        q.a(this.a, new e(q.c(this.a).e()));
    }
    while (true)
    {
      q.c(this.a).e(q.e(this.a)[paramInt] + "号码");
      q.c(this.a).d(null);
      return;
      q.c(this.a).c(100);
      if (q.d(this.a) == null)
        continue;
      q.d(this.a).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.r
 * JD-Core Version:    0.6.0
 */