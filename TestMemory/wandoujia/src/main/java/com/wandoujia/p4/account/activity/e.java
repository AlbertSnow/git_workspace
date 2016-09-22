package com.wandoujia.p4.account.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.account.manager.d;

final class e
  implements View.OnClickListener
{
  e(AccountBindActivity paramAccountBindActivity)
  {
  }

  public final void onClick(View paramView)
  {
    if ((paramView.getId() == 2131493091) && (AccountBindActivity.a(this.a)))
    {
      this.a.a(this.a.getString(2131623975));
      if (!AccountBindActivity.b(this.a).equals("email"))
        break label120;
      AccountBindActivity.a(this.a, AccountBindActivity.c(this.a).getText().toString());
    }
    while (true)
    {
      ThreadPool.execute(new com.wandoujia.account.g.e(AccountBindActivity.d(this.a), AccountBindActivity.e(this.a), "", AccountBindActivity.b(this.a), "bind_tag", this.a.b, d.a().d()));
      return;
      label120: if (!AccountBindActivity.b(this.a).equals("tel"))
        continue;
      AccountBindActivity.a(this.a, AccountBindActivity.c(this.a).getText().toString());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.e
 * JD-Core Version:    0.6.0
 */