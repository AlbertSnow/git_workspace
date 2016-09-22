package com.wandoujia.p4.account.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.widget.a;

final class i
  implements View.OnClickListener
{
  i(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountBindActivity.g(this.a.a) != null)
      AccountBindActivity.g(this.a.a).dismiss();
    AccountBindActivity.a(this.a.a, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.i
 * JD-Core Version:    0.6.0
 */