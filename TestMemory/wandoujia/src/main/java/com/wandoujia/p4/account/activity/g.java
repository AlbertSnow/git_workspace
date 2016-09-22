package com.wandoujia.p4.account.activity;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.g.x;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.account.manager.d;

final class g
  implements View.OnClickListener
{
  g(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountBindActivity.b(this.a.a).equals("email"))
    {
      this.a.a.setResult(100);
      this.a.a.finish();
    }
    do
      return;
    while (!AccountBindActivity.b(this.a.a).equals("tel"));
    AccountBindActivity.a(this.a.a, false);
    EditText localEditText = (EditText)AccountBindActivity.g(this.a.a).findViewById(2131493364);
    if (TextUtils.isEmpty(localEditText.getText().toString()))
    {
      com.wandoujia.account.h.a.a(this.a.a, this.a.a.getString(2131624173), this.a.a.getString(2131623966), new h(this)).show();
      return;
    }
    AccountBindActivity.a(this.a.a, true);
    this.a.a.a(this.a.a.getString(2131623975));
    ThreadPool.execute(new x(AccountBindActivity.b(this.a.a), localEditText.getText().toString(), "verify_tag", this.a.a.b, d.a().d()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.g
 * JD-Core Version:    0.6.0
 */