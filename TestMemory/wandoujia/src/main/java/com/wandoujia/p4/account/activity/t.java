package com.wandoujia.p4.account.activity;

import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.g.f;
import com.wandoujia.account.g.o;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.account.manager.d;

final class t
  implements View.OnClickListener
{
  t(AccountChangePasswordActivity paramAccountChangePasswordActivity)
  {
  }

  public final void onClick(View paramView)
  {
    String str1 = AccountChangePasswordActivity.e(this.a).getText().toString();
    String str2 = AccountChangePasswordActivity.a(this.a).getText().toString();
    if (((TextUtils.isEmpty(AccountChangePasswordActivity.f(this.a))) && (TextUtils.isEmpty(str1))) || (TextUtils.isEmpty(str2)))
      com.wandoujia.account.h.a.a(this.a, this.a.getString(2131625249), this.a.getString(2131623982), new u()).show();
    do
    {
      return;
      if ((str2.length() < 8) || (b.v(str2)))
      {
        com.wandoujia.account.h.a.a(this.a, this.a.getString(2131625251), this.a.getString(2131623982), new v()).show();
        return;
      }
      if (str2.length() > 50)
      {
        com.wandoujia.account.h.a.a(this.a, this.a.getString(2131625252), this.a.getString(2131623982), new w()).show();
        return;
      }
      this.a.a(this.a.getString(2131623983));
      if (TextUtils.isEmpty(str1))
        continue;
      ThreadPool.execute(new f(str1, str2, "change_password_tag", this.a.b, d.a().d()));
      return;
    }
    while (TextUtils.isEmpty(AccountChangePasswordActivity.f(this.a)));
    ThreadPool.execute(new o(com.wandoujia.account.a.c(), AccountChangePasswordActivity.f(this.a), str2, "change_password_tag", this.a.b, d.a().d()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.t
 * JD-Core Version:    0.6.0
 */