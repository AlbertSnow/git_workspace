package com.wandoujia.p4.account.activity;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.a;
import com.wandoujia.account.g.m;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.account.manager.d;

final class y
  implements View.OnClickListener
{
  y(AccountCheckPasswordActivity paramAccountCheckPasswordActivity)
  {
  }

  public final void onClick(View paramView)
  {
    if (TextUtils.isEmpty(AccountCheckPasswordActivity.a(this.a).getText().toString()))
    {
      AccountCheckPasswordActivity.a(this.a, this.a.getString(2131624072));
      return;
    }
    this.a.a(this.a.getString(2131624166));
    AccountCheckPasswordActivity.b(this.a, AccountCheckPasswordActivity.a(this.a).getText().toString());
    ThreadPool.execute(new m(a.c(), AccountCheckPasswordActivity.a(this.a).getText().toString(), "changeAccount", "login", this.a.b, d.a().d()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.y
 * JD-Core Version:    0.6.0
 */