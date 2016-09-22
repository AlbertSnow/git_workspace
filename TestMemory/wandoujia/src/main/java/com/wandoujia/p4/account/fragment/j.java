package com.wandoujia.p4.account.fragment;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.g.x;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.account.manager.d;

final class j
  implements View.OnClickListener
{
  j(AccountProfileFragment paramAccountProfileFragment, String paramString1, String paramString2)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.equals("email"))
    {
      if (AccountProfileFragment.i(this.c) != null)
        AccountProfileFragment.i(this.c).dismiss();
      d.a().a(this.c.b);
    }
    do
      return;
    while (!this.a.equals("tel"));
    EditText localEditText = (EditText)AccountProfileFragment.i(this.c).findViewById(2131493364);
    if (TextUtils.isEmpty(localEditText.getText().toString()))
    {
      com.wandoujia.account.h.a.a(this.c.getActivity(), this.c.getString(2131624173), this.c.getString(2131623966), new k()).show();
      return;
    }
    this.c.b(this.b);
    ThreadPool.execute(new x(this.a, localEditText.getText().toString(), "VERIFY_CODE_TAG", this.c.b, d.a().d()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.j
 * JD-Core Version:    0.6.0
 */